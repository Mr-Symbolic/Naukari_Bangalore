package BrowserSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver openChromeDriver() {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Velocity\\selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		return driver;
	}

}
