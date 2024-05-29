package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import commonFunction.Common_Functions;
import pageObjects.Add_all_items_Add_to_Cart_PageObjects;

public class Verify_Add_ALl_Items_Testcase extends Common_Functions {

	@Test(priority = 1)
	public void addAllIteams() {
		// use Pagefactory and init the elements
		PageFactory.initElements(driver, Add_all_items_Add_to_Cart_PageObjects.class);

		// click the first Add To Cart button
		Add_all_items_Add_to_Cart_PageObjects.Add_to_Cart1.click();
	}

	@Test(priority = 2)
	public void add2nditeam() {
		// click the second Add To Cart button
		Add_all_items_Add_to_Cart_PageObjects.Add_to_Cart2.click();
	}

	@Test(priority = 3)
	public void add3rdIteam() {
		// click the third Add To Cart button
		Add_all_items_Add_to_Cart_PageObjects.Add_to_Cart3.click();
	}

	@Test(priority = 4)
	public void add4thIteam() {
		// click the fourth Add To Cart button
		Add_all_items_Add_to_Cart_PageObjects.Add_to_Cart4.click();
	}

	@Test(priority = 5)
	public void add5thIteam() {
		// click the fifth Add To Cart button
		Add_all_items_Add_to_Cart_PageObjects.Add_to_Cart5.click();
	}

	@Test(priority = 6)
	public void add6thIteam() {
		// click the sixth Add To Cart button
		Add_all_items_Add_to_Cart_PageObjects.Add_to_Cart6.click();
	}
}
