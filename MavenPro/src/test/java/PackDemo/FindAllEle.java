package PackDemo;


import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FindAllEle {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver=DriverUtility.getDriver("chrome");
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void launchApp() {
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
	}
//To see the order details
	@Test
	public void checkOrder()
	{
	driver.findElement(By.partialLinkText("SignIn"));
	driver.findElement(By.id("userName")).sendKeys("mercury");
	driver.findElement(By.id("password")).sendKeys("mercury");
	driver.findElement(By.id("login")).click();
	driver.findElement(By.xpath("//span[contains(text(),'OrderDetails')]"));
	WebElement tbody=driver.findElement(By.xpath("//table[@class='table']/tbody"));
	List<WebElement> list=tbody.findElements(By.tagName("tr"));
	System.out.println(list.size());
	
	for(WebElement e:list)
	{
		System.out.println(e.getText());
	}
	}
}
