package PackDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PackData.DataprovideCls;

public class DataCls {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String v1) {
		driver=DriverUtility.getDriver(v1);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@AfterTest
	public void afterTest() {
		driver.close();
	}
	@Test(dataProvider="dp1",dataProviderClass=DataprovideCls.class)
	public void testNewTour(String userId,String password) {
		//driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(userId);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		//driver.navigate().back();
		if(driver.getTitle().contains("Flight")) {
			driver.findElement(By.linkText("SIGN-OFF")).click();
		}
	}
/*@DataProvider(name="dp1") //allias name is "dp1" which is user defined one
	public Object[][] getData() {
		Object[][] obj= {
				{"mercury1","mercury1"},
				{"mercury","mercury"}			
		};
		return obj;
	}*/
}
