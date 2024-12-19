package WebdriverTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablesColumn {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://emicalculator.net/home-loan-emi-calculator";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,1000)");
		List<WebElement> rows =driver.findElements(By.xpath("//table[@class='noextras']/tbody/tr"));

		System.out.println("Total rows "+ rows.size());
		for (int i=1; i<rows.size(); i++) {
			System.out.println("Row elements are --> "+ rows.get(i).getText()); 
		
			List<WebElement> colms= driver.findElements(By.xpath("//table[@class='noextras']/tbody/tr/th"));
			System.out.println("Total columns "+ colms.size());
			for(int j=1; j<colms.size(); j++) {
			driver.findElement(By.xpath("//table[@class='noextras']/tbody/tr[i]/td[j]"));}}
		

			




	}

}
