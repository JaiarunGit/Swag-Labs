package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import commonFunction.Common_Functions;
import pageObjects.Checkout_Information_PageObjects;

public class Verify_Checkout_Information_Testcase extends Common_Functions {

	@Test(priority = 0)
	public void checkoutInformation() {
		// use Pagefactory and init the elements
		PageFactory.initElements(driver, Checkout_Information_PageObjects.class);

		// click the Checkout button
		Checkout_Information_PageObjects.ClickCheckout.click();
	}

	@Test(priority = 1)
	public void fillCheckoutInformation() {
		// enter the first name in firtname box
		Checkout_Information_PageObjects.firstname.sendKeys(properties.getProperty("First-name"));

		// enter the last name in lastname box
		Checkout_Information_PageObjects.lastname.sendKeys(properties.getProperty("Last-name"));

		// enter the postal number in postalcode box
		Checkout_Information_PageObjects.postalcode.sendKeys(properties.getProperty("Postalcode"));

		// click the continue button
		Checkout_Information_PageObjects.Continue.click();

		// click the Finish button
		Checkout_Information_PageObjects.Finish.click();

		// click the BAckHome button
		Checkout_Information_PageObjects.BackHome.click();

	}
}
