package automatesites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomate {
public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		
      WebElement email = driver.findElement(By.cssSelector("input#email"));
 
       email.click();
       email.sendKeys("triveni@123");
       Thread.sleep(3000);
       email.clear();
       email.sendKeys("abc@1234");
       
       //password
       
         WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
         
         pass.click();
         pass.sendKeys("123456");
         
         
        //login find
         
      WebElement login = driver.findElement(By.xpath("//button[@name=\"login\"]"));
      System.out.println("login.getText()");
      System.out.println("the text entered is as:"+email.getAttribute("value"));
      
      
 

	}

}
