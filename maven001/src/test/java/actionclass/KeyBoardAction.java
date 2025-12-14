package actionclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Baseclass;

public class KeyBoardAction extends Baseclass {
	

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		HitUrl("https://www.jeevansathi.com/");
		
		// Keyboard Action - keydown - page down
		// object create action class pass parameters ref var webdriver
		
		Actions act= new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_UP).build().perform();
	

}
}
