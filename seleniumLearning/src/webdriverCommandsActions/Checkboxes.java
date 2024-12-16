package webdriverCommandsActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://demoqa.com/checkbox";
		driver.navigate().to(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='rct-options']/button[1]")));
		WebElement expandall = driver.findElement(By.xpath("//div[@class='rct-options']/button[1]"));
		expandall.click();
		WebElement commands = driver.findElement(By.xpath("//input[@id='tree-node-commands']//following::span[1]"));
		Boolean testcheck=	commands.isSelected();
		if(testcheck == true) {System.out.println("command is checked");}
		else { System.out.println("the command is unchecked");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='tree-node-commands']//following::span[1]")));
		commands.click();}
		WebElement classified = driver.findElement(By.xpath("//input[@id='tree-node-classified']//following::span[1]"));
		System.out.println(	"classified checkbox displayed is " + classified.isDisplayed());
		commands.click();
		WebElement excelfile = driver.findElement(By.xpath("//input[@id='tree-node-excelFile']//following::span[1]"));
		WebElement notes = driver.findElement(By.xpath("//input[@id='tree-node-notes']//following::span[1]"));
		notes.click();
		js.executeScript("window.scrollBy(0, 900)");
	if(excelfile.isEnabled()==true){
			System.out.println("its is enabled");}
		excelfile.click();
		driver.close();
		
	}




}


