package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorRightOf {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("locked");
	Thread.sleep(3000);
	/*WebElement elementUsingAboveLoc =
	driver.findElement(RelativeLocator.with(By.tagName("input")).above(knownWebele
			ment)));*/
	//WebElement belowField =	driver.findElement(By.RelativeLocator.with(By.tagName("input")).toRightof(email));
	//belowField.sendKeys("acetest@farmersinsurance.com");
	//Thread.sleep(3000);
		driver.quit();

	}

}
