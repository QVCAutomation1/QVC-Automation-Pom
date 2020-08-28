package testpacksge;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Baseclass;
import Base.pageobjectclass;

public class testclass {

	String s2 = "Beauty iQ Steal";
	Baseclass bp; // no meaning
	pageobjectclass pc; // no meaning
	@Test
	public void verifyproduct() throws InterruptedException {
		bp = new Baseclass();
		pc = new pageobjectclass();
		pc.mrng();
		System.out.println("nothing more");
		Thread.sleep(3000);
		pc.product().click();
		String s1 = pc.prctitem().getText();
		System.out.println(s1);
		if (s2.equalsIgnoreCase(s1)) {
			System.out.println("product text verified sucessfully" + s1);

		} else {
			System.out.println("product text not sucessfully verified" + s2);
			Assert.fail();

		}
		bp.driver.close();

	}
}
