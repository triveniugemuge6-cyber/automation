package maven0011;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		// url heat 
		driver.get("https://www.amazon.in/");
		
		// to maximize window
		
		driver.manage().window().maximize();
		
		// implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		// Explicit Wait
		// a)syntax of web driver wait
		
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(expected conditon.visibility of all elements("Locator"));
		
		//b) Fluent wait 
	     //  FluentWait<webDriver> wait=new FluentWait<webDriver>(Driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(Nosuchfieldexception.class);

	}

}
