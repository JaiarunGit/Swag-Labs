package commonFunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Common_Functions {
	public static Properties properties;
	public static WebDriver driver;

	// Load the property file
	public Properties loadPropertyFile() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties;
	}

	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadPropertyFile();

		// get the browser property from config.properties file
		properties.getProperty("browser");

		// get the Browser Url from config.properties file
		String Url = properties.getProperty("url");

		// get the driver path from config.properties file
		String Driverlocation = properties.getProperty("driverLocation");

		System.setProperty("webdriver.chrome.driver", Driverlocation);

		// Launch the Browser
		driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Enter the Browser Url
		driver.get(Url);

		// Verify the Browser Url 
		String browserUrl = "https://www.saucedemo.com/";
	    Assert.assertEquals(Url, browserUrl, "Invalid browser url");
	}

	@AfterSuite
	public void tearDown() {
		// Close the Browser
		driver.quit();
	}
}
