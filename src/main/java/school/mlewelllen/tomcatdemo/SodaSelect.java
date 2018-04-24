package school.mlewelllen.tomcatdemo;

import java.util.ArrayList;
import java.util.List;
import school.mlewelllen.tomcatdemo.brandObject;

public class SodaSelect{
	List<brandObject> bo = new ArrayList<brandObject>();
	public List getAvailableBrands(SodaType type){
		List brands = new ArrayList();
		if(type.equals(SodaType.PEPSICO)){
			brands.add("Pepsi");	
			brands.add("Mug Root Beer");	
			brands.add("Mountain Dew");
		}
		else if(type.equals(SodaType.COCACOLA)){
			brands.add("Coca-Cola");
			brands.add("Sprite");
			brands.add("Fanta");
			brands.add("Fresca");
		}
		else if(type.equals(SodaType.DRPEPPERSNAPPLE)){
			brands.add("7up");
			brands.add("A&W Root Beer");
			brands.add("Dr. Pepper");
			brands.add("Crush");
		}
		else {
			brands.add("No Brand Available");
		}
		return brands;
	}
	
	public List getVendorProducts(){
		bo.add(new brandObject("PEPSICO", "Pepsi"));
		bo.add(new brandObject("PEPSICO", "Mug Root Beer"));
		bo.add(new brandObject("PEPSICO", "Mountain Dew"));
		
		bo.add(new brandObject("COCACOLA", "Coca-Cola"));
		bo.add(new brandObject("COCACOLA", "Sprite"));
		bo.add(new brandObject("COCACOLA", "Fanta"));
		bo.add(new brandObject("COCACOLA", "Fresca"));
		
		bo.add(new brandObject("DRPEPPERSNAPPLE","7up"));
		bo.add(new brandObject("DRPEPPERSNAPPLE","A&W Root Beer"));
		bo.add(new brandObject("DRPEPPERSNAPPLE","Crush"));

		return bo;
	}
}



