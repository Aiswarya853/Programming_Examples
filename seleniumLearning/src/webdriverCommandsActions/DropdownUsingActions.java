package webdriverCommandsActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownUsingActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://demoqa.com/automation-practice-form";
		driver.navigate().to(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 700)");
		driver.manage().window().maximize();
		WebElement state = driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder' and contains(text(), 'Select State')]"));
		System.out.println("state Button enabled is -->" +state.isEnabled());
		WebElement city = driver.findElement(By.xpath("//div[@class=' css-14jk2my-container' and @id='city']"));
		//city	//span[@class=' css-109onse-indicatorSeparator']/following::div[1]
		System.out.println("city Button enabled is -->" +city.isEnabled());
		state.click();
		Actions action =new Actions(driver);;
		WebElement stateNCR = driver.findElement(By.xpath("//div[@class=' css-1uccc91-singleValue' and contains(text(), 'NCR')]"));
		System.out.println("state button clicked successfully");
		action.moveToElement(stateNCR).click(stateNCR).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=' css-1uccc91-singleValue' and contains(text(), 'NCR')]")));
		//action.moveToElement(stateNCR).click(stateNCR).build().perform();
		WebElement cityDelhi = driver.findElement(By.xpath("//div[@class=' css-1uccc91-singleValue' and contains(text(), 'Delhi')]"));
		action.doubleClick(city).moveToElement(cityDelhi).click(cityDelhi).build().perform();

	}

}
