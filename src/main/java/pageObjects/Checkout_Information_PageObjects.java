package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout_Information_PageObjects {

	// find the Checkout button locator by using @FindBy Annotation
	@FindBy(id="checkout")
	public static WebElement ClickCheckout;
	
	// find the firstname text box locator by using @FindBy Annotation
	@FindBy(id="first-name")
	public static WebElement firstname;
	
	// find the lastname text box locator by using @FindBy Annotation
	@FindBy(id="last-name")
	public static WebElement lastname;

	// find the postalcode text box locator by using @FindBy Annotation
	@FindBy(id="postal-code")
	public static WebElement postalcode;
	
	// find the Continue button locator by using @FindBy Annotation
	@FindBy(id="continue")
	public static WebElement Continue;
	
	// find the Finish button locator by using @FindBy Annotation
	@FindBy(id="finish")
	public static WebElement Finish;
	
	// find the Backhome button locator by using @FindBy Annotation
	@FindBy(id="back-to-products")
	public static WebElement BackHome;
	
}
