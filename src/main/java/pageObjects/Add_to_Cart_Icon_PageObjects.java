package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_to_Cart_Icon_PageObjects {

	// find the Add To Cart icon locator by using @FindBy Annotation
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	public static WebElement ClickATCicon;
}
