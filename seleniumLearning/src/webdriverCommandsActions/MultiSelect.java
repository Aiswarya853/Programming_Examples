package webdriverCommandsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://demoqa.com/select-menu";
		driver.navigate().to(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 700)");
		driver.manage().window().maximize();
		WebElement standardMultiSelect = driver.findElement(By.xpath("//select[@id ='cars']"));
		Select ss = new Select(standardMultiSelect);
		if(ss.isMultiple() ==true) {
			System.out.println("Standard multi select is a multi select option");
			ss.selectByValue("volvo");
			ss.selectByIndex(2);
			ss.selectByVisibleText("Audi");
		}
		else {System.out.println("It is a single select");}
		WebElement MultiSelectdropdown = driver.findElement(By.xpath("//div[@class =' css-1wa3eu0-placeholder' and @style ='opacity: 1; transition: opacity 260ms;']"));
		//MultiSelectdropdown.click();
		
		Select s =new Select(MultiSelectdropdown);
		if(s.isMultiple()==true) {
			System.out.println(" Multi Select dropdown is a multi select option");
			s.selectByIndex(5);
			s.selectByValue("Red");
			s.selectByVisibleText("Blue");}
		driver.close();
	}

}
