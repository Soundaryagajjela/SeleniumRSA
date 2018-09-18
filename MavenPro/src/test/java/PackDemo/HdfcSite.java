package PackDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HdfcSite
{
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String s) {
		driver=DriverUtility.getDriver(s);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	}
	@Test
	public void testHdfcSite() throws InterruptedException {
		driver.get("https://www.hdfcbank.com/"); 
		Thread.sleep(1000);
		Actions act=new Actions(driver);	
		 WebElement e1=driver.findElement(By.xpath("//span[contains(text(),'Apply now')]"));
		 act.moveToElement(e1).perform();
		 Thread.sleep(1000);
		 WebElement e2=driver.findElement(By.linkText("Credit Card"));
		 act.moveToElement(e2).click().perform();
		 Set<String> set=driver.getWindowHandles();
		for(String w: set) {
			driver.switchTo().window(w);
		}
		Thread.sleep(1000);
			WebElement e3=driver.findElement(By.xpath("//div[@id='rightNavPanel']/div[1]/img"));
			act.moveToElement(e3).click().perform();
		driver.findElement(By.xpath("//div[@id='txtCustIDNoAuth']/input")).sendKeys("9809877899");
		Thread.sleep(1000);
	 driver.quit();
	}
	
 @Test
	public void testIrtcSite() throws InterruptedException {
		driver.get("https://www.irctc.co.in/");	
		Thread.sleep(1000);
      driver.findElement(By.xpath("//label[contains(text(),'PNR STATUS')]")).click();
	Set<String> set=driver.getWindowHandles();
		for(String w:set) 
		{
			driver.switchTo().window(w);	
		}
			//System.out.println(set.size());
		driver.findElement(By.id("inputPnrNo")).sendKeys("5969375700");
		Thread.sleep(1000);
	 driver.quit();
		}
}
