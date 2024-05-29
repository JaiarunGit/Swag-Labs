package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import commonFunction.Common_Functions;
import pageObjects.Add_to_Cart_Icon_PageObjects;

public class Verify_Add_to_Cart_Icon_Testcase extends Common_Functions {

	@Test
	public void clickAddToIcon() {
		// use Pagefactory and init the elements
		PageFactory.initElements(driver, Add_to_Cart_Icon_PageObjects.class);

		// click the Add to cart icon button
		Add_to_Cart_Icon_PageObjects.ClickATCicon.click();
	}
}
