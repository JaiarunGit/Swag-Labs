package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menubutton_PageObjects {

	// find the Menu button locator by using @FindBy Annotation
	@FindBy(id="react-burger-menu-btn")
	public static WebElement Menubutton;
	
	// find the About locator by using @FindBy Annotation
	@FindBy(id="about_sidebar_link")
	public static WebElement ClickAbout;

}
