package webdriverCommandsActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationAndSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://demoqa.com/automation-practice-form";
		driver.navigate().to(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 700)");
		driver.manage().window().maximize();
		WebElement currentAddress = driver.findElement(By.xpath("//div[@id='currentAddress-wrapper']/div[2]/textarea"));
		org.openqa.selenium.Dimension size = currentAddress.getSize();
		
	     System.out.println("Height is -->"+ size.getHeight());
	     System.out.println("width is --> "+ size.getWidth());
	    Point location =  currentAddress.getLocation();
	    System.out.println("The X point is -->"+ location.getX());
	    System.out.println("The Y point is -->"+ location.getY());
	    driver.close();

	}

}
