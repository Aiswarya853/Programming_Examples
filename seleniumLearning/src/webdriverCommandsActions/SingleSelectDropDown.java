package webdriverCommandsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://demoqa.com/automation-practice-form";
		driver.navigate().to(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 700)");
		driver.manage().window().maximize();
		WebElement state = driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder'][1]"));
		//div[@class=' css-tlfecz-indicatorContainer'][1]"
		//*[@class='css-19bqh2r'][1]
		System.out.println("state Button enabled is -->" +state.isEnabled());
		WebElement city = driver.findElement(By.xpath("//span[@class=' css-109onse-indicatorSeparator']/following::div[1]"));
		System.out.println("city Button enabled is -->" +city.isEnabled());
		Select select = new Select(state);
		select.selectByIndex(1);
		select.selectByValue("NCR");
		select.selectByVisibleText("NCR");
		driver.close();
		
		
		

	}

}
