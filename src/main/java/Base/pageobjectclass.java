package Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjectclass extends Baseclass {
	//@FindBy(xpath = "//div[@class=\"menuLinkBar\"]/following::span[2]")
	//private WebElement today;
	////div[@class='menuLinkBar']//*[text()='Beauty iQ Steal']
	@FindBy(xpath = "//div[@class='top-navigation base-component parbase']//*[text()='Beauty iQ Steal']")
	private WebElement serch;
	@FindBy(xpath = "//*[@class='breadcrumb pageBreadcrumb']//li[@class='active']/h1")
	private WebElement menu;

	public pageobjectclass() {
		PageFactory.initElements(driver, this);
	}

	/*public WebElement todays() {
		return today;
	}*/

	public WebElement product() {
		return serch;
	}

	public WebElement prctitem() {
		return menu;
	}

	public void mrng() {
		Actions ref = new Actions(driver);
		ref.moveToElement(driver.findElement(By.xpath("//div[@class='menuLinkCell menuLinksRight']//div[@class='deals']"))).build().perform();;
	}
}
