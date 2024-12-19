package WebdriverTables;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dynamicTables4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.moneyworks4me.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,1000)");
		Actions action= new Actions(driver);
		WebElement funds =driver.findElement(By.xpath("//li[@class='mega_menu_dropdown mega_menu_demo_2 has_dropdown' and @id ='mutualfundsmenu']"));
		Thread.sleep(1000);
		action.moveToElement(funds).build().perform();
		Thread.sleep(2000);
		WebElement capfunds =driver.findElement(By.linkText("/mutual-funds/best-mutual-funds/large-cap-mutual-funds/?from=menu"));
		capfunds.click();
		

		
		
	}

}
