package LoginForBangalore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.HomePage;
import POM.LoginPageNaukari;

public class simpleTest {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Velocity\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		driver.get("https://www.naukri.com/");
		
		LoginPageNaukari loginPageNaukari = new LoginPageNaukari(driver);
		 loginPageNaukari.clickOnLoginButton();
		 loginPageNaukari.sendCredentials();
		 
		 HomePage homePage = new HomePage(driver);
		 homePage.clickonProfile();
		 homePage.updateProfile();
		 homePage.editProfileJava();
		 homePage.versionUpdate(); 
		 homePage.logoutFromApp();
	}
}
