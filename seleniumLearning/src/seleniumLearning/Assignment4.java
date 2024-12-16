package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		
			//System.out.println("Hellooo Cognizant");
			System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://onecognizant.cognizant.com/Home");
	WebElement trutime = driver.findElement(By.xpath("//div[contains(text(), 'TruTime ')]"));
	System.out.println(trutime.getText());
	trutime.click();
	WebElement monthAndYr = driver.findElement(By.xpath("//div[@id = 'datepicker']/div[1]"));
	System.out.println(monthAndYr.getText());
	
	WebElement monthAvg = driver.findElement(By.xpath("//div[@class = 'monthAvg']/span[2]"));
	System.out.println(monthAvg.getText());
	WebElement monthSwipeAvg = driver.findElement(By.xpath("//div[@class = 'monthAvg']/span[3]"));
	System.out.println(monthSwipeAvg.getText());
	WebElement monthtruAvg = driver.findElement(By.xpath("//div[@class = 'monthAvg']/span[4]"));
	System.out.println(monthtruAvg.getText());
	
	WebElement yrAvg = driver.findElement(By.xpath("//div[@class = 'yrAvg']/span[2]"));
	System.out.println(yrAvg.getText());
	WebElement yrSwipeAvg = driver.findElement(By.xpath("//div[@class = 'yrAvg']/span[3]"));
	System.out.println(yrSwipeAvg.getText());
	WebElement yrtruAvg = driver.findElement(By.xpath("//div[@class = 'yrAvg']/span[4]"));
	System.out.println(yrtruAvg.getText());
	}

}
