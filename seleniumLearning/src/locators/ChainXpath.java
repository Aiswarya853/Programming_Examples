package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChainXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	WebElement name =	driver.findElement(By.xpath("//div[@class = 'form-group']/input[1]"));
	name.sendKeys("aishu");
	
	WebElement email =	driver.findElement(By.xpath("//div[@class = 'form-group']/input[2]"));
	email.sendKeys("acetest@farmersinsurance.com");
	//Thread.sleep(3000);
		driver.quit();



	}

}
