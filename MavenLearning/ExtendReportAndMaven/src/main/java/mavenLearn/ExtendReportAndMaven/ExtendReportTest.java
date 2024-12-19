package mavenLearn.ExtendReportAndMaven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.TestHTMLReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.observer.ExtentObserver;

public class ExtendReportTest {
	 WebDriver driver;
	 ExtentReports extentReport;
	 ExtentObserver htmlReport;
	  ExtentTest testcase;
	@BeforeSuite
	public void launchingBrowser() {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		//ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--headless");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();}
	@AfterSuite
	public void closingBrowser() {
	driver.quit(); }
	
	@Test
	public void firstTest() {
		/*extentReport = new ExtentReports();
		htmlReport = new ExtentObserver();
		extentReport.attachReporter(htmlReport);*/
		String url ="https://www.easemytrip.com/";
		driver.navigate().to(url);
		System.out.println("My first test was successfull");
		
	}
	
}


	

	


