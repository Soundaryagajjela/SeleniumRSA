package PackDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Dynamicdrop {
@Test
public void testNewTourLogin() {
	WebDriver driver=DriverUtility.getDriver("chrome");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("login")).click();
	boolean a=driver.findElement(By.linkText("ITINERARY")).isDisplayed();
	Assert.assertTrue(a);
	driver.findElement(By.cssSelector("input[value='oneway']")).click();
	WebElement from= driver.findElement(By.name("fromPort"));
	Select sel=new Select(from);
	List<WebElement> list=sel.getOptions();//to get all drop down list
	//list.size();
	System.out.println(list.size());
	Assert.assertEquals(list.size(),10);
	for(WebElement e:list) {
		//System.out.println(e.getText());
		String city=e.getText();
		if(city.equals("Paris")) {
			sel.selectByVisibleText(city);
			break;
		}
	}
}
}
