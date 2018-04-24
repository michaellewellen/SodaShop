package school.mlewelllen;

import school.mlewelllen.tomcatdemo.SodaSelect;
import school.mlewelllen.tomcatdemo.SodaType;

import java.util.List;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        name = "indexservlet",
        urlPatterns = ""
)

public class indexServlet extends HttpServlet { 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//	make an array from the Enum list in SodaTYpe
	SodaType[] type = SodaType.values();

//	make a ArrayList with the Enum information
	List sodaCompany = new ArrayList();
	for(int i = 0; i < (type.length); i ++){
		sodaCompany.add(type[i].name());
	}

        req.setAttribute("Company", sodaCompany);
        RequestDispatcher view = req.getRequestDispatcher("newIndex.jsp");
        view.forward(req, resp); 
    }
}

