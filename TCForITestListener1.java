package testDemo1;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TCForITestListener1 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("im in Before Method");
	}
	@Test(priority=1)
	public void reg() {
		System.out.println("Executing User Regeration TC");
	}
	@Test(priority=2)
	public void LogIn() {
		System.out.println("Executing LogIn TC");
		Assert.assertEquals(1==2, "1 is not equal to 1");
	}
	@Test(priority=3)
	public void LogOut() {	
		System.out.println("Executing LogOut TC");
		throw new SkipException("Skipping LogOut TC");
	}
}
