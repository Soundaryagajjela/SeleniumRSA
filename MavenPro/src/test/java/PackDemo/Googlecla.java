package PackDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Googlecla {
	@Test
	public void googlePage() {
	WebDriver driver=BrowserInstace.getDriver("chrome");
	driver.get("http://www.Google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@id='SIvCob']/a[4]")).click();
}
}