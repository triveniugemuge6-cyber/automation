package automatesites;

import dynamic_code.Baseclass;

public class Amazon  extends  Baseclass  {

	public static void main(String[] args) {
		
		launch_browser("chrome");
		//launch_browser("edge");
		HitUrl("https://www.amazon.in/");
		
		  System.out.println("The title of webpage is as:"+driver.getTitle());
	
	}
	
	
	}


