package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	/*Object repo
	 * 
	 */

	WebDriver driver;
	By LoginLink = By.xpath("//*[@id='pt-login']/a");
	By UserName = By.id("wpName1");
	By Passwd = By.id("wpPassword1");
	By LoginButton = By.id("wpLoginAttempt");
	By ForgotLink = By.xpath("//*[@id='userloginForm']/form/div/div[6]/div/a");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ClickLogin() {
		driver.findElement(LoginLink).click();
	}
	
	public void typeUsername() {
		driver.findElement(UserName).sendKeys("DivyaKothandan");
	}
	
	public void typePassword() {
		driver.findElement(Passwd).sendKeys("SeleniumTesting");
	}
	
	public void submitLogin() {
		driver.findElement(LoginButton).click();
	}
	
	public void forgotPswdLink() {
		driver.findElement(ForgotLink).click();
	}
	
	
	
}
