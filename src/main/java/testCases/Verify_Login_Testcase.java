package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.Common_Functions;
import pageObjects.Login_PageObjects;

public class Verify_Login_Testcase extends Common_Functions{

	@Test
	public void loginPage() {
		
		// use Pagefactory and init the elements
		PageFactory.initElements(driver, Login_PageObjects.class);
		
		// enter the username from config.properties file
		Login_PageObjects.UserName.sendKeys(properties.getProperty("username"));
		
		// enter the password from config.properties file
		Login_PageObjects.PassWord.sendKeys(properties.getProperty("password"));
		
		// click the login button
		Login_PageObjects.loginbtn.click();
		
	}
}