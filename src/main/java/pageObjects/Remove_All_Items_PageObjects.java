package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Remove_All_Items_PageObjects {

	// find the RemoveItem1 button locator by using @FindBy Annotation
	@FindBy(id="remove-sauce-labs-backpack")
	public static WebElement RemoveItem1;
	
	// find the RemoveItem2 button locator by using @FindBy Annotation
	@FindBy(id="remove-sauce-labs-bike-light")
	public static WebElement RemoveItem2;

	// find the RemoveItem3 button locator by using @FindBy Annotation
	@FindBy(id="remove-sauce-labs-bolt-t-shirt")
	public static WebElement RemoveItem3;
	
	// find the RemoveItem4 button locator by using @FindBy Annotation
	@FindBy(id="remove-sauce-labs-fleece-jacket")
	public static WebElement RemoveItem4;
	
	// find the RemoveItem5 button locator by using @FindBy Annotation
	@FindBy(id="remove-sauce-labs-onesie")
	public static WebElement RemoveItem5;
	
	// find the RemoveItem6 button locator by using @FindBy Annotation
	@FindBy(id="remove-test.allthethings()-t-shirt-(red)")
	public static WebElement RemoveItem6;
}
