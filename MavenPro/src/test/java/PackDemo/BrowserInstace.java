package PackDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserInstace {
public static WebDriver getDriver(String browser)
{
	if(browser.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajjela.soundarya\\Desktop\\Selenium-Training Docs\\WebDriver\\WebDriver\\chromedriver.exe");	
 return new ChromeDriver();
	}else if (browser.equals("ie")) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\gajjela.soundarya\\Desktop\\Selenium-Training Docs\\WebDriver\\WebDriver\\IEDriverServer.exe");	
	 return new InternetExplorerDriver();
		}else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\gajjela.soundarya\\Desktop\\Selenium-Training Docs\\WebDriver\\WebDriver\\geckodriver.exe");	
			 return new FirefoxDriver();
				}else {
					return null;
				}					
}
}
