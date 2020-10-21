package testpacksge;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.Baseclass;
import Base.Facebookclass;

public class testclass1 {
	@Test
	@DataProvider
	public void verify_the_DataProvider(String Username, String Password) throws InterruptedException {
		Baseclass Baseclassobject = new Baseclass();
		Facebookclass facebookobject = new Facebookclass();
		Thread.sleep(5000);
		facebookobject.getUsername().sendKeys(Username);
		facebookobject.getpassword().sendKeys(Password);
		Thread.sleep(5000);
		facebookobject.getsubmit().click();
		Thread.sleep(5000);

}
}
