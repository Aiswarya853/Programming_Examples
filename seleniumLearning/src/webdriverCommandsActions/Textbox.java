package webdriverCommandsActions;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Textbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//String url1 = "https://demoqa.com/forms";
		String url ="https://demoqa.com/text-box";
		driver.navigate().to(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		//js.executeScript(scroll)
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement textbox = driver.findElement(By.xpath("//div[@class=\"element-list collapse show\"]/ul/li[1]"));
		textbox.click();
		WebElement fullName = driver.findElement(By.xpath("//form[@id='userForm']/div[1]/div[2]/input"));
		fullName.sendKeys("Aiswarya gunasekharan");
		WebElement email = driver.findElement(By.xpath("//form[@id='userForm']/div[2]/div[2]/input"));
		email.sendKeys("acetest@farmersinsurance.com");
		System.out.println("full name displayed is " + textbox.getText());
		WebElement currentAddress = driver.findElement(By.xpath("//form[@id='userForm']/div[3]/div[2]/textarea"));
		currentAddress.sendKeys("palakkad");
		WebElement permanantAddress = driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']//child::div[2]/textarea"));
		permanantAddress.sendKeys("kerala");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].click();", submit);
		//submit.click();
		driver.close();





	}

}
