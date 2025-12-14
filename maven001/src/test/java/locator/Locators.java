package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//locators
		
		//1) id
		driver.findElement(By.id("nav-top"));
	    driver.findElement(By.id("nav-assist-shortcuts-container"));
		
	    //2)name
	    driver.findElement(By.name("google-site-verification"));
	    driver.findElement(By.name("twitter:site:id"));
	    
	    
	    //3)class name
	    driver.findElement(By.className("a-carousel-col a-carousel-left celwidget"));
	    driver.findElement(By.className("nav-assistant-separator"));
	    
	    //4)linkText
	    driver.findElement(By.linkText("Gift Card"));
	    driver.findElement(By.linkText("Today's Deals"));
	    
	    // 5) partial link text
	    driver.findElement(By.linkText("Gift"));
	    driver.findElement(By.linkText("Today's Deal"));
	    
	    
	   // 6)tag name
	    driver.findElement(By.tagName("a"));
	    driver.findElement(By.tagName("nav"));
	    
	    
		
		
	

	}

}
