package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dynamic_code.Baseclass;
@Listeners(NormalClass.class)
public class TestNG extends Baseclass{
  @Test(priority=1)
  public void launch_Browser() throws InterruptedException {
	  System.out.println("onstart");
  }
	  
  @Test(priority=2)
public void Hiturl() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("hiturl");
 
 }
 @Test(priority=3)
public void selectgender() throws InterruptedException {
	  WebElement selectgender = driver.findElement(By.xpath("//div[@id=\"shopWomen\"]"));
	  selectgender.click();
	  Thread.sleep(2000);
	  System.out.println("select gender");
	  
}
 @Test(priority=4)
public void Women() throws InterruptedException {
	  WebElement Women = driver.findElement(By.xpath("//a[@id=\"women_category\"]"));
	  act.moveToElement(Women).build().perform();
	  Thread.sleep(2000);
	  System.out.println("Women");
}
 @Test(priority=5)
public void Men() throws InterruptedException {
	  WebElement Men = driver.findElement(By.xpath("//a[@id=\"men_category\"]"));
	  act.moveToElement(Men).build().perform();
	  Thread.sleep(2000);
	  System.out.println("Men");
}
 @Test(priority=6)
public void Kids() throws InterruptedException {
	  WebElement Kids = driver.findElement(By.xpath("//a[@id=\"kids_category\"]"));
	  act.moveToElement(Kids).build().perform();
	  Thread.sleep(2000);
	  System.out.println("Kids");
}
 @Test(priority=7)
public void Home() throws InterruptedException {
	  WebElement Home = driver.findElement(By.xpath("//a[@id=\"home_category\"]"));
	  act.moveToElement(Home).build().perform();
	  Thread.sleep(2000);
	  System.out.println("Home");
}
 @Test(priority=8)
public void offers() throws InterruptedException {
	  WebElement offers = driver.findElement(By.xpath("//div[@id=\"newDeskOffers\"]"));
	  offers.click();
	  Thread.sleep(2000);
	  System.out.println("offers");
	  
}

 

	
 }






