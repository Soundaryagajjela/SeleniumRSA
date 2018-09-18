package PackDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependencyCls {
 @BeforeTest
public void beforeTest()
{
System.out.println("Launch the browser");	 
}
 @Test(priority=1)
 public void launchApp() {
	 System.out.println("Launch the App");	 
 }
 @Test(priority=2,dependsOnMethods="launchApp")
 public void logIn() {
	 System.out.println("Login");	 
 }
 @Test(priority=3,dependsOnMethods="logIn")
 public void logOut() {
	 System.out.println("Logout");	 
 }
 @AfterTest
 public void afterTest()
 {
 	 
 }
}
