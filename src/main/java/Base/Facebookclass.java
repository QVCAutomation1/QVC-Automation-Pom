package Base;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.CopyUtils;
import org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;




public class Facebookclass extends Baseclass {
	@FindBy(xpath = "//input[@id='email']")
	private WebElement usernametext;
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement passwordtext;
	@FindBy(xpath = "//button[@name='login']")
	private WebElement submit;

	public Facebookclass() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return usernametext;
	}

	public WebElement getpassword() {
		return passwordtext;
	}

	public WebElement getsubmit() {
		return submit;
	}
	public  void screenshot() throws IOException {
		TakesScreenshot ss=  (TakesScreenshot) driver;
		File f1=ss.getScreenshotAs(OutputType .FILE);
		File f2=new File("C:\\Users\\My\\git1\\QVCPROJECT\\Screenshot.files.png");
		 FileUtils.copyFile(f1,f2);

	}

}
