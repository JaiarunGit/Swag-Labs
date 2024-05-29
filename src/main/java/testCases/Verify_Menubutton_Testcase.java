package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.Common_Functions;
import pageObjects.Menubutton_PageObjects;

public class Verify_Menubutton_Testcase extends Common_Functions {

	@Test(priority = 1)
	public void menuButton() {

		// use Pagefactory and init the elements
		PageFactory.initElements(driver, Menubutton_PageObjects.class);

		// click the Menu button
		Menubutton_PageObjects.Menubutton.click();
	}

	@Test(priority = 2)
	public void clickAbout() {
		// click About option
		Menubutton_PageObjects.ClickAbout.click();

		// parent window
		String parentwindow = driver.getWindowHandle();

		// Navigate to the parent window
		driver.navigate().back();

		// Switch the control to parent window
		driver.switchTo().window(parentwindow);
	}
}
