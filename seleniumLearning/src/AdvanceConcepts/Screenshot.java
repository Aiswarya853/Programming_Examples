package AdvanceConcepts;

import java.io.File;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static WebDriver driver;
	public static void capture_Screenshot() throws WebDriverException{
		
	File screenshot =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date d = new Date();
	String name = d.toString().replace(":", "_").replace(" ", "_")+ ".png";
	String destinationPath = "src/screenshottedImage/"+ name;
  FileHandler.class.
  
		
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://emicalculator.net/home-loan-emi-calculator";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,1000)");
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		WebElement pswd = driver.findElement(By.xpath("//input[@id='password']"));
		pswd.sendKeys("secret_sauce");
		
		
		
	}

}
