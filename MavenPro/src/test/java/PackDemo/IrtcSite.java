package PackDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IrtcSite {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		driver=DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.get("https://www.irctc.co.in/nget/train-search"); 
	    Thread.sleep(5000);
	}
	@Test
	public void testMeApp() throws InterruptedException {
      driver.findElement(By.xpath("//label[contains(text(),'PNR STATUS')]")).click();

	Set<String> set=driver.getWindowHandles();
		for(String w:set) 
		{
			driver.switchTo().window(w);	
		}
			//System.out.println(set.size());
		driver.findElement(By.id("inputPnrNo")).sendKeys("5969375700");
		Thread.sleep(5000);
		}
}
