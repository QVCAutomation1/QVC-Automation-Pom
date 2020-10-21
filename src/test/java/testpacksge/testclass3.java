package testpacksge;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Base.Baseclass;
import Base.Facebookclass;

public class testclass3 {
	
	
	//@BeforeClass
	@Test(priority = 0)
	@Parameters({ "Username", "Password" })
	public void verifyTheParameter(String Username, String Password) throws InterruptedException {
		Baseclass Baseclassobject = new Baseclass();
		Facebookclass facebookobject = new Facebookclass();
		Thread.sleep(5000);
		facebookobject.getUsername().sendKeys(Username);
		facebookobject.getpassword().sendKeys(Password);
		Thread.sleep(5000);
		facebookobject.getsubmit().click();
		Thread.sleep(5000);

	}

	@Test(priority=1)
	public void homepage() throws Throwable {
		Facebookclass obj = new Facebookclass();
		obj.screenshot();
	}

	@AfterSuite
	public void browserclose() {
		Baseclass.driver.close();
	}

}








