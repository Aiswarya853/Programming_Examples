import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://demoqa.com/radio-button";
		driver.navigate().to(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300)");
		driver.manage().window().maximize();
		WebElement noButton = driver.findElement(By.xpath("//label[@class='custom-control-label disabled']"));
		System.out.println("No Button enabled is -->" +noButton.isEnabled());
		System.out.println("No Button displayed is -->" + noButton.isDisplayed());
		WebElement yesButton = driver.findElement(By.xpath("//label[@class='custom-control-label' and  @for ='yesRadio']"));
		System.out.println(yesButton.isSelected());
		if(yesButton.isSelected() == false) {
			System.out.println("The radiobutton is not selected");
			yesButton.click();}
		driver.close();

	}

}
