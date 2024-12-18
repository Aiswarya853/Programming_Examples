package WebdriverTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTables1 {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://demo.guru99.com/test/web-table-element.php#";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		List<WebElement> rows =table.findElements(By.xpath("//tbody/tr"));
		for (int i=1; i<rows.size(); i++) {
		System.out.println("Row elements are --> "+ rows.get(i).getText());} 
		System.out.println("3rd Row is--> " + rows.get(3).getText());
		//WebElement row3 = table.findElement(By.xpath("//tbody/tr[3]"));
		//System.out.println("3rd row is "+ row3.getText());
		//To fetch single element
		WebElement specificvalue = table.findElement(By.xpath("//tbody/tr[3]/td[4]"));
		System.out.println("4rd Row 4th element is " +specificvalue.getText());
		
		 
	}

}
