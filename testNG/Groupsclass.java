package testNG;

import org.testng.annotations.Test;

public class Groupsclass {
  @Test(groups= {"high"},priority=1)
  public void launch_Browser() {
	  System.out.println("launch_Browser");
	  
	  
	  }
	  
	  @Test(groups= {"high"},priority=2)
	  public void Hiturl() {
		  
		 System.out.println("Hiturl");
	  }
	  
	  
	  
	  @Test(groups= {"high"},priority=3)
	  public void search() {
		  System.out.println("search");
	  }
	  
	  
	  @Test(groups= {"medium"},priority=4)
	  public void click () {
		  System.out.println("click");
	  }
	  
	  
	  
	  @Test(groups= {"medium"},priority=5)
	  public void sendata() {
		  System.out.println("sendata");
	  }
	  
	  @Test(groups= {"low"},priority=6)
	  public void overlap() {
		  System.out.println("overlap");
  }
}
