package PackDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngCls {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
	driver=DriverUtility.getDriver("chrome");	
	driver.manage().window().maximize();
	System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		driver.close();	
		System.out.println("After Method");
	}
  @Test
  public void testGoogle() {
	  driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  System.out.println("Google Testing");
	  //Google Testing
  }
	  @Test
	  public void testNewTour() {
		  driver.get("http://newtours.demoaut.com/");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  System.out.println("Mercury tour Testing");
		  //Mercury tour Testing
  }
}
