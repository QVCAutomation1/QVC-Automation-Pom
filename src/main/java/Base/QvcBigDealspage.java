package Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QvcBigDealspage extends Baseclass {
	@FindBy(xpath = "//input[@id='email']")
	private WebElement usernametext;
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement passwordtext;
	@FindBy(xpath = "//button[@name='login']")
	private WebElement submit;

	public QvcBigDealspage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername_text() {
		return usernametext;
	}

	public WebElement getpassword_text() {
		return passwordtext;
	}

	public WebElement getsubmit_text() {
		return submit;
	}

}
