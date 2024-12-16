package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		//Thread.sleep(3000);
	WebElement text =	driver.findElement(By.xpath("//center[text()='This is DEMO site for TESTING purpose']"));
	String collectedText = text.getText();
	//Thread.sleep(1000);
	WebElement pass =	driver.findElement(By.xpath("//input[contains(@id, 'pass')]"));
	pass.sendKeys("pass");
	System.out.println("Collected Text is " + collectedText);
		//Thread.sleep(3000);
		driver.quit();

	}

}
