package school.mlewelllen.tomcatdemo;

import java.util.ArrayList;
import java.util.List;
import school.mlewelllen.tomcatdemo.brandObject;

public class SodaSelect{
	public List getAvailableBrands(SodaType type){
		List brands = new ArrayList();
		ArrayList<brandObject> searchBrands = new ArrayList<brandObject>();
		if(type.equals(SodaType.PEPSICO)){
			brands.add("Pepsi");	
			searchBrands.add( new brandObject("Pepsi","PEPSICO"));
			brands.add("Mug Root Beer");	
			searchBrands.add( new brandObject("Mug RootBeer","PEPSICO"));
			brands.add("Mountain Dew");
			searchBrands.add( new brandObject("Mountain Dew","PEPSICO"));
		}
		else if(type.equals(SodaType.COCACOLA)){
			brands.add("Coca-Cola");
			searchBrands.add( new brandObject("Coca-Cola", "COCACOLA"));
			brands.add("Sprite");
			searchBrands.add( new brandObject("Sprite", "COCACOLA"));
			brands.add("Fanta");
			searchBrands.add( new brandObject("Fanta", "COCACOLA"));
			brands.add("Fresca");
			searchBrands.add( new brandObject("Fresca","COCACOLA"));
		}
		else if(type.equals(SodaType.DRPEPPERSNAPPLE)){
			brands.add("7up");
			searchBrands.add( new brandObject("7up","DRPEPPERSNAPPLE"));
			brands.add("A&W Root Beer");
			searchBrands.add( new brandObject("A&W Root Beer","DRPEPPERSNAPPLE"));
			brands.add("Dr. Pepper");
			searchBrands.add( new brandObject("Dr. Pepper","DRPEPPERSNAPPLE"));
			brands.add("Crush");
			searchBrands.add( new brandObject("Crush", "DRPEPPERSNAPPLE"));
		}
		else {
			brands.add("No Brand Available");
		}
		return brands;
	}
}



