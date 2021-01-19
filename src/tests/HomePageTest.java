package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class HomePageTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		LoginPage login = new LoginPage(driver); 
		login.ClickLogin();
		login.typeUsername();
		login.typePassword();
		login.submitLogin();
		
		/*LoginPage login1 = new LoginPage(); 
		login1.ClickLogin();
		login1.forgotPswdLink();
		*/
		
		
	}

}
