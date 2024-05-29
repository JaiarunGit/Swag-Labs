package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import commonFunction.Common_Functions;
import pageObjects.Filter_Icon_PageObjects;

public class Verify_Filter_Testcase extends Common_Functions {
	
	@Test
	public void clickFilterIcon() {
		// use Pagefactory and init the elements
		PageFactory.initElements(driver, Filter_Icon_PageObjects.class);
		
		// click the dropdown Filter
		Filter_Icon_PageObjects.clkFilterIcon.click();	
	}
}