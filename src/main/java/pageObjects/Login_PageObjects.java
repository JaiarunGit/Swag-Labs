package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_PageObjects {

	// find the username locator by using @FindBy Annotation
	@FindBy(id="user-name")
	public static WebElement UserName;

	// find the password locator by using @FindBy Annotation
	@FindBy(id="password")
	public static WebElement PassWord;
	
	// find the login button locator by using @FindBy Annotation
	@FindBy(id="login-button")
	public static WebElement loginbtn;
}
