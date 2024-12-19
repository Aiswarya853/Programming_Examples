package Waits;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWaits {

	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		//ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--headless");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.easemytrip.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to(url);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,0)");
		WebElement flight =driver.findElement(By.xpath("//span[@class='meuicowidth flightmenuico']"));
		flight.click();
		WebElement from =driver.findElement(By.xpath("//input[@id='FromSector_show']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(from));
		from.click();
		from.click();
		Thread.sleep(3000);
		from.sendKeys("coimbatore");
		from.click();
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
	
		WebElement to =driver.findElement(By.xpath("//input[@id='Editbox13_show' ]"));
		to.click();
		to.sendKeys("chennai");
		to.click();
		//WebElement date =driver.findElement(By.xpath("//li[@id='trd_3_18/12/2024' ]"));
		//date.click();
		WebElement search =driver.findElement(By.xpath("//button[@class='srchBtnSe' ]"));
		search.click();
		WebElement searchResult =driver.findElement(By.xpath("//div[@class='col-md-12 col-sm-12 main-bo-lis pad-top-bot ng-scope' and @ng-if='s.l_OB==null']"));
		searchResult.getText();
		
		
		
		
		
		
	}

}
