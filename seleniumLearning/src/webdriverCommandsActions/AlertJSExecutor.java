package webdriverCommandsActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertJSExecutor{

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://demoqa.com/automation-practice-form";
		driver.navigate().to(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 700)");
		driver.manage().window().maximize();
		js.executeScript("alert('Hi am alert')");
	}

}
