package WebdriverTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTables2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://emicalculator.net/home-loan-emi-calculator";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,1000)");
		WebElement expand2025 = driver.findElement(By.xpath("//td[@id='year2025']"));
		expand2025.click();
		Thread.sleep(3000);
		//WebElement basetable = driver.findElement(By.xpath("//tr[@id='monthyear2025']"));
		List<WebElement> rows =driver.findElements(By.xpath("//tr[@id='monthyear2025']/td/div/table/tbody/tr"));
		//table[@class='noextras']/tbody/tr
		System.out.println("Total rows "+ rows.size());
		for (int i=1; i<rows.size(); i++) {
			
		System.out.println("Row elements are --> "+ rows.get(i).getText());} 
		

	}

}
