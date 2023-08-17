package testDemo1;

import org.testng.annotations.Test;

public class TCForTestListener2 {
	@Test(priority=1)
	public void purchaseProdcut() {
		System.out.println("Executing Purchase Product Test Case");
	}
	@Test(priority=2)
	public void shippingProduct() {
		System.out.println("Executing Shipping Product Test Case");
	}
	@Test(priority=3)
	public void payment() {
		System.out.println("Exectuing Payment Test Case");
	}
}
