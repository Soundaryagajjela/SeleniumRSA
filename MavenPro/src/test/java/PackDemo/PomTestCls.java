package PackDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.PageObjMdl;

public class PomTestCls {
WebDriver driver;
PageObjMdl obj;
	@BeforeTest
	public void beforeTest() {
	driver=DriverUtility.getDriver("chrome");
	obj=PageFactory.initElements(driver,PageObjMdl.class);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
	}
	@Test
	public void logIn() {
	String title=obj.clickSignIn();	
	Assert.assertTrue(title.contains("Flight"));
	}
	@AfterTest
	public void afterTest() {
		driver.close();
		obj=null; ///it will clear all objects created for the page class as we used reference variable of page class and assigned null to it
		}	
}
