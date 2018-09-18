package PackDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTour {
@Test
public void NewTourLogin() {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajjela.soundarya\\Desktop\\Selenium-Training Docs\\WebDriver\\WebDriver\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	WebDriver driver=BrowserInstace.getDriver("chrome");
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("REGISTER")).click(); //using the link text selector finding the element
	driver.findElement(By.name("userName")).sendKeys("mercury");
	//driver.findElement(By.name("password")).sendKeys("mercury");
	//driver.findElement(By.name("login")).click(); 
	String title=driver.getTitle();//we can write like this to get the title or we include it in the below line and compare.
	Assert.assertEquals(title, "Find a Flight: Mercury Tours:");
	//driver.findElement(By.name("tripType")).click(); if we use it it won't work as 2 radio buttons are having same name .hence commented.
	driver.findElement(By.cssSelector("input[value='oneway']")).click();
}
}