package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTestTestNG {
	WebDriver driver;

	@BeforeClass
	public void launchApplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://en.wikipedia.org/wiki/Main_Page");
	}

	@Test
	public void LoginTestCase() {
		LoginPage login = new LoginPage(driver); 
		login.ClickLogin();
		login.typeUsername();
		login.typePassword();
		login.submitLogin();
	}
	@Test(enabled=false)
	public void ForgotPaswwordTest() {
		LoginPage login1 = new LoginPage(driver); 
		login1.ClickLogin();
		login1.forgotPswdLink();
	}
	
	@AfterClass
	public void closeApplication() {
		driver.quit();
	}





}
