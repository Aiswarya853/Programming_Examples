package sourcePage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utility.Pagefactory;
import utility.configDataProvider;


public class BaseTest {
	public static WebDriver driver;
	public static configDataProvider config = new configDataProvider();
	
	@BeforeClass
	public static void setup() {
	
	driver = Pagefactory.startApplication(driver, config.getBrowser(), config.getUrl());
	}
	
	@AfterClass
	public  void  teardown() {
		Pagefactory.quitBrowser(driver);
	}
	public void captureScreenshot(WebDriver driver, String testName) throws IOException {
		TakesScreenshot screenshot =(TakesScreenshot) driver;
		
	File src =	screenshot.getScreenshotAs(OutputType.FILE);
		//Date currentDate = new Date() ;
		File target = new File( "user.dir" + "\\Screenshots\\" + testName + ".png");
	FileUtils.copyFile(src, target);
		
	}
}
