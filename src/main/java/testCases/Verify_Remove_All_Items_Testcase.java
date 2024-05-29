package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.Common_Functions;
import pageObjects.Remove_All_Items_PageObjects;

public class Verify_Remove_All_Items_Testcase extends Common_Functions {

	@Test(priority=0)
	public void removeItem1() {
		// use Pagefactory and init the elements
		PageFactory.initElements(driver, Remove_All_Items_PageObjects.class);
		
		// click the first RemoveItem button
		Remove_All_Items_PageObjects.RemoveItem1.click();
	}

	@Test(priority=1)
	public void removeItem2() {
		// click the second RemoveItem button
		Remove_All_Items_PageObjects.RemoveItem2.click();
	}

	@Test(priority=2)
	public void removeItem3() {
		// click the third RemoveItem button
		Remove_All_Items_PageObjects.RemoveItem3.click();
	}

	@Test(priority=3)
	public void removeItem4() {
		// click the fourth RemoveItem button
		Remove_All_Items_PageObjects.RemoveItem4.click();
	}

	@Test(priority=4)
	public void removeItem5() {
		// click the fifth RemoveItem button
		Remove_All_Items_PageObjects.RemoveItem5.click();
	}

	@Test(priority=5)
	public void removeItem6() {
		// click the sixth RemoveItem button
		Remove_All_Items_PageObjects.RemoveItem6.click();
	}
}
