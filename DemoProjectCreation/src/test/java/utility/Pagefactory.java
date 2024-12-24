package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Pagefactory {

	public static WebDriver startApplication(WebDriver driver, String browserName, String appUrl) {
	 if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=");
			driver =new ChromeDriver(opt);}
		else if(browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:/Softwares/edgedriver_win64/msedgedriver.exe");
			
			driver =new EdgeDriver();}

		else if(browserName.equalsIgnoreCase("Firefox")) {System.setProperty("webdriver.edge.driver", "C:/Softwares/geckodriver-v0.35.0-win64/geckodriver.exe");
		
		driver =new FirefoxDriver();}
		else {System.out.println("We don't support the mentioned browser");}
			
			driver.navigate().to(appUrl);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			return driver;
			
			
			}
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}
