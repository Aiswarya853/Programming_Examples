package webdriverCommandsActions;

//import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchPages {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url1 = "https://demoqa.com/forms";
		//String url2 ="https://demoqa.com/text-box";
		driver.navigate().to(url1);
		driver.navigate().refresh();
		System.out.println(" Current url --> "+driver.getCurrentUrl());
		System.out.println("Page source --> " + driver.getPageSource());
		System.out.println("Page Title is --> " + driver.getTitle());
		WebElement element = driver.findElement(By.xpath("//div[@class='accordion']/div[1]/span[1]/div[1]"));
		element.click();
		WebElement textbox = driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[1]"));
		textbox.click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		WebDriver driver2 = new ChromeDriver();
		driver2.navigate().to(url1);
		driver2.close();
		driver.quit();}

}
