package sourcePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
@FindBy(id= "search_course") WebElement searchopt;
@FindBy(xpath= "//*[@id=\"primary_menu\"]/nav[1]/form/button") WebElement searchbutton;
@FindBy(xpath= "//*[@id=\"logo\"]/a/span") WebElement pageTitle;

String actualTitle;
String ExpectedTitle = "ITlearn370";
public void searchCourse(String courseName) {
	/*
	 * WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(50));
	 * wait.until(ExpectedConditions.elementToBeClickable(searchopt));
	 */	searchopt.sendKeys(courseName);
	
	//wait.until(ExpectedConditions.elementToBeClickable(searchbutton));
	searchbutton.click();
	actualTitle =pageTitle.getText();}
	
	
	
public void verifyPageTitle() {
	
	try {
	if (actualTitle.equalsIgnoreCase(ExpectedTitle)) {
		System.out.println("Actual Title "+ actualTitle + " equals Expected title "+ ExpectedTitle);}
	
	else {
		
		System.out.println("Actual and expected title didn't match");
	}
	}
	catch(Exception e){
	   e.printStackTrace();
		
		
	}
	
	
}
}