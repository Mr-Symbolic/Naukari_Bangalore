package LoginForBangalore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import BrowserSetUp.Base;
import POM.HomePage;
import POM.LoginPageNaukari;

public class Login  {
	
	public WebDriver driver ;
	public LoginPageNaukari loginPageNaukari;
	public HomePage homePage;
	
	@Parameters("browser")
	@BeforeTest
	public void LauchBrowserAndGenerateReport(String BrowserName) {
		if(BrowserName.equals("Chrome"))
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Velocity\\selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		
	}
	
	@BeforeClass
	public void CreatePOMobjects() {
		loginPageNaukari = new LoginPageNaukari(driver);
		homePage = new HomePage(driver);
	}

	@BeforeMethod
	public void OpenApplication() {
		driver.get("https://www.naukri.com/");
	}
	
	@Test
	public void  OpenNaukriApplicationForBangaloreProfile() {
		
		 loginPageNaukari.clickOnLoginButton();
		 loginPageNaukari.sendCredentials();
		 
		 homePage.clickonProfile();
		 homePage.updateProfile();
		 
		 homePage.editProfileJava();
		 homePage.versionUpdate();
		 
		 homePage.logoutFromApp();
		
	}

}
