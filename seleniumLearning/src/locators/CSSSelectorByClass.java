package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorByClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
	WebElement mailID =	driver.findElement(By.cssSelector("input.c"));
	mailID.sendKeys("aishu");
	WebElement pass =	driver.findElement(By.cssSelector(".inputtext"));
	pass.sendKeys("pass");
	
		Thread.sleep(3000);
		driver.quit();


	}

}
