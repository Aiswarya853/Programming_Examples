package sourcePage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utility.Pagefactory;
import utility.configDataProvider;


public class BaseTest {
	public static WebDriver driver;
	public static configDataProvider config;
	
	@BeforeClass
	
	public static void setup() {
	
	driver = Pagefactory.startApplication(driver, config.getBrowser(), config.getUrl());
	}
	@AfterClass
	public static void  teardown() {
	 Pagefactory.quitBrowser(driver);
	}
}
