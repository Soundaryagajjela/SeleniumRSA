package PackDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Test2 {
	/*@Test
	public void testChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajjela.soundarya\\Desktop\\Selenium-Training Docs\\WebDriver\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	}*/
	/*@Test
	public void testIE() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\gajjela.soundarya\\Desktop\\Selenium-Training Docs\\WebDriver\\WebDriver\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
	}
	@Test
	public void testFireFox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\gajjela.soundarya\\Desktop\\Selenium-Training Docs\\WebDriver\\WebDriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	}*/
	@Test
	public void testChrome1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajjela.soundarya\\Desktop\\Selenium-Training Docs\\WebDriver\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.co.in/");
		driver.manage().window().maximize();
		
	}
}
