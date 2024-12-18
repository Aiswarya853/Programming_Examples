package webdriverCommandsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://demoqa.com/automation-practice-form";
		driver.navigate().to(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 700)");
		driver.manage().window().maximize();
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		//System.out.println("Background colour--> " + submitButton.getCssValue("background-color"));
		js.executeScript("arguments[0].style.border ='3px solid red'",submitButton);
		js.executeScript("history.go(0)");
	}

}
