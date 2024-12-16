package locators;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleShadowDOMElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://dev.automationtesting.in/shadow-dom");
		driver.manage().window().maximize();
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	/*WebElement shadowElement = (WebElement) js.executeScript("return document.querySelector("#shadow-root").shadowRoot.querySelector("#shadow-element")");
		
	js.executeScript("arguments[0].click()" , shadowElement );*/
	driver.quit();
		

	}

}
