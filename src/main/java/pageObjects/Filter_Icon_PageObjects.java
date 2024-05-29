package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Filter_Icon_PageObjects {

	// find the Filter Icon locator by using @FindBy Annotation
	@FindBy(xpath="//select[@class='product_sort_container']")
	public static WebElement clkFilterIcon;
	

	
	
}
