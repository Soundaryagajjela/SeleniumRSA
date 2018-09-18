package PackDemo;

import org.testng.annotations.Test;

public class Test1 {
	@Test(priority=-1)
public void testRegistration() {
	System.out.println("User Registration");
}
	@Test(priority=0)
	public void testLogin() {
		System.out.println("User Login");
	}
}
