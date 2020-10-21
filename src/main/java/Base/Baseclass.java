package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver driver=null;

	public Baseclass() {
		if (driver == null) {

			System.setProperty("webdriver.chrome.driver",
					"F:\\Build-Java\\eclipse-java-oxygen-3a-win32\\eclipse\\devaworkspace\\QVCPROJECT\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
	}
}
