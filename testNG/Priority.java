package testNG;

import org.testng.annotations.Test;

public class Priority {
  @Test(priority=1)
  public void e() {
	  System.out.println("Automation Testing");
  }
  
  
  @Test(invocationCount = 2)
  public void d() {
	  System.out.println("Manual Testing");
  }
  
  
  @Test(priority=3)
  public void c() {
	  System.out.println("java");
  }
  
  @Test(priority = 4)
  public void b() {
	  System.out.println("selenium");
  }
  
  @Test(priority = 5)
  public void a() {
	  System.out.println("testing");
  }
}
