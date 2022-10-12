package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath = "//div[@class='nI-gNb-drawer__bars']")
	private WebElement profile;
	
	@FindBy (xpath = "//a[text()='View & Update Profile']")
	private WebElement updateprofile;
	
	@FindBy (xpath ="//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy (xpath = "(//span[@tabindex='0'])[10]")
	private WebElement editjava;
	
	@FindBy (xpath = "//input[@placeholder='Software Version']")
	private WebElement softwareversion;
	
	@FindBy (xpath = "//button[@id='saveITSkills']")
	private WebElement save;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonProfile() {
		profile.click();
	}
	
	public void updateProfile() {
		updateprofile.click();
	}
	
	public void logoutFromApp() {
		profile.click();
		logout.click();
	}
	
	public void editProfileJava() {
		editjava.click();
	}
	
	public void versionUpdate() {
		softwareversion.sendKeys("function");
		save.click();
	}
	
	public void clearVersionUpdate() {
		softwareversion.clear();
		save.click();
	}
}
