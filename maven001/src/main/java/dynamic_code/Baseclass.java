package dynamic_code;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Baseclass {
	
	public static WebDriver driver;
	 

	public static void launch_browser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
		}
		
	else if(browser.equalsIgnoreCase("firefox")) {
		 driver= new FirefoxDriver();
		
	}
		
	
	else if(browser.equalsIgnoreCase("edge")) {
		 driver=new EdgeDriver();
	}
		   System.out.println("The brower launch is as:"+browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	
		
	}
	///--------hit URL------------
	
       public static void HitUrl(String url) {
		
		driver.get(url);
		 System.out.println("The title of webpage is"+driver.getTitle());
			 


      
       
      
       
       }
       
} 

