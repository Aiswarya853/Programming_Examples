import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class framesWindows {
	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement menu = driver.findElement(By.xpath("//div[@id='mobile_menu_toggler']"));
		menu.click();
		WebElement ebook = driver.findElement(By.xpath("//span[@class='icon chevron-down']"));
		ebook.click();
		
	

	}

}
