package testpacksge;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.Baseclass;
import Base.pageobjectclass;

public class testclass {

	Baseclass baseclassObj = null; // no meaning
	pageobjectclass pageobjectclassObj = null; // no meaning

	@Test
	public void verifyproduct() throws InterruptedException {
		String expectedTextBeautyIqBreadcrum = "Beauty iQ Steal";
		baseclassObj = new Baseclass();
		pageobjectclassObj = new pageobjectclass();
		pageobjectclassObj.moveToTodaysDealsMenu();
		Thread.sleep(3000);
		pageobjectclassObj.getBeautyIqMenuWebElement().click();
		String actualTextBeautyIqBreadcrum = pageobjectclassObj.getBreadcrumbWebElement().getText();
		System.out.println(actualTextBeautyIqBreadcrum);
		if (expectedTextBeautyIqBreadcrum.equalsIgnoreCase(actualTextBeautyIqBreadcrum)) {
			System.out.println("Beauty IQ Breadcrum text verified sucessfully" + expectedTextBeautyIqBreadcrum);
		} else {
			System.out.println("Beauty IQ Breadcrum text not verified sucessfully" + actualTextBeautyIqBreadcrum);
			Assert.fail();
		}

	}

	@AfterSuite
	public void closeActiveBrowser() {
		baseclassObj.driver.close();
		// TODO Auto-generated method stub

	}
}
