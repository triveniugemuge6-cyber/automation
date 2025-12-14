package report;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.Baseclass;

public class CreateReport extends Baseclass {

	public static void main(String[] args) throws Throwable {
		
		String projectpath = System.getProperty("user.dir");
	
     ExtentSparkReporter esr =new ExtentSparkReporter(projectpath+"\\Report\\ReportGenerated");
     
     // Configuration set
     
    esr.config().setDocumentTitle("Automation Reprt");
    esr.config().setReportName("Ecommerce report");
    esr.config().setTheme(Theme.STANDARD);
    
   ExtentReports er=new ExtentReports();
   er.attachReporter(esr);
   
   // system configuration set 
   
   er.setSystemInfo("as", "window");
   er.setSystemInfo("Browser", "chrome");
   er.setSystemInfo("Domain", "Ecommerce");
   er.setSystemInfo("Application", "Flipkart");
   er.setSystemInfo("senior Quality Analyst", "triveni");
   
   
   ExtentTest et = er.createTest("Launch Browser");
    et.log(Status.INFO, "LaunchBrowser");
    
    ExtentTest et1 = er.createTest(" Hit URL");
    
    et1.log(Status.PASS, "pass Hit URL");
    
    ExtentTest et2 = er.createTest("click on search functinality ");
    
    et2.log(Status.FAIL, "click on search functinality");
    
    ExtentTest et3 = er.createTest("send data");
    
    et3.log(Status.SKIP, "send data");
    
   
   launch_browser("chrome");
    HitUrl("https://www.flipkart.com/");
    
   
    }

	
	

}
 