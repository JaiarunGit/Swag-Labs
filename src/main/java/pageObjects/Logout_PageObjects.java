package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_PageObjects {

	// find the Menu button locator by using @FindBy Annotation
	@FindBy(id = "react-burger-menu-btn")
	public static WebElement Menubutton;

	// find the Reset App State locator by using @FindBy Annotation
	@FindBy(id = "reset_sidebar_link")
	public static WebElement ResetAppState;

	// find the Logout button locator by using @FindBy Annotation
	@FindBy(id = "logout_sidebar_link")
	public static WebElement LogOut;

}