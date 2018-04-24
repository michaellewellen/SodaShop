package school.mlewelllen;

import school.mlewelllen.tomcatdemo.SodaSelect;
import school.mlewelllen.tomcatdemo.SodaType;
import school.mlewelllen.tomcatdemo.brandObject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.lang.String;

@WebServlet(
        name = "searchservlet",
        urlPatterns = "/SearchResult"
)

public class searchServlet extends HttpServlet { 
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String searchString = (String)req.getParameter("search");
	SodaSelect sodaSelect = new SodaSelect();
	List sodaBrands = sodaSelect.getVendorProducts();
	
	Iterator ss = sodaBrands.iterator();
	List<String> results = new ArrayList<String>();
	while(ss.hasNext()){
		brandObject cur = (brandObject) ss.next();
		if(cur.getCompany().contains(searchString) || cur.getBrand().contains(searchString)){
			results.add(cur.getCompany() + " " + cur.getBrand());
		}
	}
	req.setAttribute("result", results);		
        RequestDispatcher view = req.getRequestDispatcher("searchResult.jsp");
        view.forward(req, resp); 
    	}
	
}
