package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStartsWith {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		//Thread.sleep(3000);
	WebElement text =	driver.findElement(By.xpath("//center[starts-with(text(), 'This is DEMO')]"));
	String collectedText = text.getText();
	
	WebElement checkbox =	driver.findElement(By.xpath("(//input[@type='checkbox'])[last()]"));
	checkbox.click();
	System.out.println("Collected Text is " + collectedText);
		//Thread.sleep(3000);
		driver.quit();


	}

}
