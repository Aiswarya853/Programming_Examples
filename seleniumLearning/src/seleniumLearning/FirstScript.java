package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hellooo Cognizant");
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
WebElement googleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
String text = googleLogo.getText();
System.out.println("the captured text is " + text);
//Google Search
WebElement googleSearch = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
googleSearch.sendKeys("Elephant");
//driver.quit();
//WebElement searchButton = driver.findElement(By.xpath("//div[@class='lJ9FBc']/center/input[1]"));
//searchButton.click();
//driver.quit();
}
	
}
