package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageNaukari {
	
	@FindBy (xpath = "//a[@title='Jobseeker Login']")
	private WebElement Login;
	
	@FindBy (xpath = "//input[@placeholder='Enter your active Email ID / Username']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@placeholder='Enter your password']")
	private WebElement password;
	
	@FindBy (xpath = " //button[text()='Login']")
	private WebElement 	loginFirst;
	
	
	public LoginPageNaukari(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginButton() {
		Login.click();
	}
	
	public void sendCredentials() {
		username.sendKeys("pratikbshirude28@gmail.com");
		password.sendKeys("Velocity@5731");
		loginFirst.click();
	}
	
	

}
