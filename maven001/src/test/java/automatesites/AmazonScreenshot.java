package automatesites;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import dynamic_code.Baseclass;

public class AmazonScreenshot  extends Baseclass {
	
	

	public static void main(String[] args) throws IOException {
		
		launch_browser("chrome");
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		File Source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File ("./ScreenShort/chromeSS1.png");
		
		FileHandler.copy(Source, target);

	}

}
