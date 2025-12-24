package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class01 {
  @Test
  public void f() {
	  System.out.println("Test");
  }
  @BeforeSuite
  
  public void f2() {
	  System.out.println("BeforeSuite");
	  
	
}
  @BeforeClass
  public void f3() {
	  System.out.println("BeforeClass");
}
  @BeforeMethod
  public void f4() {
	  System.out.println("BeforeMethod");
	 
	
}
  @BeforeTest
  public void f5() {
	  System.out.println("BeforeClass");
  
  
}
  @AfterMethod
  public void f6() {
	  System.out.println("AfterMethod");
}
@AfterClass
public void f7() {
	  System.out.println("AfterClass");
	  
}
@AfterSuite
public void f8() {
	  System.out.println("AfterSuite");
	  
}
@AfterTest
public void f9() {
	  System.out.println("AfterTest");
}
	  
}
	  