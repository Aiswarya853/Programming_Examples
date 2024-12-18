import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class testNGBasics {
	@BeforeTest

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		//	driver.navigate().to(url);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 700)");
			driver.manage().window().maximize();
		
		
	}
}
