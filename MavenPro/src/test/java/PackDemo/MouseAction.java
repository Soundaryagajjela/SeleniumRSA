package PackDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseAction {
WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver=DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.get("http://localhost:8083/TestMeApp/"); 
	}
	@Test
	public void testMeApp() {
	Actions act=new Actions(driver);	
	 WebElement e1=driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]"));
	 act.moveToElement(e1).perform();
	 WebElement e2=driver.findElement(By.xpath("//span[contains(text(),'Our Offices')]"));
	 act.moveToElement(e2).perform();
	 WebElement e3=driver.findElement(By.xpath("//span[contains(text(),'Chennai')]"));
	 act.moveToElement(e3).click().perform();
	 Set<String> set=driver.getWindowHandles();
	 //System.out.println(set.size());//it will print the count of windows opened currently/.
	for(String w: set) {
		driver.switchTo().window(w);
		WebElement fra=driver.findElement(By.name("main_page"));
		driver.switchTo().frame(fra);
		String adr=driver.findElement(By.id("demo3")).getText();
		System.out.println(adr);
	}
	
	}
}
