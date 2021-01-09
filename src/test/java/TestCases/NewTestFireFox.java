package TestCases;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Utilities.MyUtilities;

public class NewTestFireFox extends MyUtilities {
	
	
	@Test(priority = 1)
	  public void testOne() throws IOException {
		  
		ExtentTest test = extent.createTest("TESTCASE 1 : Test Google site - TestCase 1");
		
		//define driver capability for Chrome
		DesiredCapabilities dc=DesiredCapabilities.firefox();
		//this is the url of the Selenium Grid Hub, with exposed port 4444
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		//launch the test url
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		test.log(Status.INFO, "Title of the page is :" + title);
		
		
	  }
	  
	  @Test(priority = 2)
	  public void testTwo() throws IOException {
		  
		ExtentTest test = extent.createTest("TESTCASE 2 : Test yahoo site - TestCase 2");
		  
		//define driver capability for Chrome
		DesiredCapabilities dc=DesiredCapabilities.firefox();
		//this is the url of the Selenium Grid Hub, with exposed port 4444
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		//launch the test url
		driver.get("https://www.yahoo.com");
		String title = driver.getTitle();
		test.log(Status.INFO, "Title of the page is :" + title);
		
		
	  }
	
	
	
  
}
