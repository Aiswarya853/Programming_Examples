package webdriverActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseACtions {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.browserstack.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement getstartedbutton = driver.findElement(By.xpath("//a[@id ='signupModalProductButton' and contains(text(), 'Get started free')]"));
		System.out.println("button colour is --> "+getstartedbutton.getCssValue("background-color"));
		Actions action = new Actions(driver);
		action.moveToElement(getstartedbutton).build().perform();
		System.out.println("button2 colour is --> "+getstartedbutton.getCssValue("background-color"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 700)");
		WebElement viewPricing = driver.findElement(By.xpath("//a[@class='btn col-center btn-secondary btn-lg custom-btn-amp-events' and contains(text(),' View Pricing')]"));
		System.out.println("button text is --> "+viewPricing.getText());
		viewPricing.click();
		action.moveToElement(viewPricing).doubleClick(viewPricing).build().perform();
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(50)) ;
		
		WebElement bestvaluedollar = driver.findElement(By.xpath("//div[@class ='plan-wrapper live-desktop-mobile-plan best-value-plan comparison-table-exp show-live-team-pro-toggle show-live-fenced-features show-bug-capture-section' and @data-content ='Best Value']"));
    action.moveToElement(bestvaluedollar).click().build().perform();
     wait.until(ExpectedConditions.elementToBeSelected(bestvaluedollar));
     WebElement dollar = driver.findElement(By.xpath("//div[@class ='plan-wrapper live-desktop-mobile-plan best-value-plan comparison-table-exp show-live-team-pro-toggle show-live-fenced-features show-bug-capture-section' and @data-content ='Best Value' ]//div[@class='plan-price-details'][1]/span[1]"));
   System.out.println("dollar value" + dollar.getText());
     


	}

	
		
	}


