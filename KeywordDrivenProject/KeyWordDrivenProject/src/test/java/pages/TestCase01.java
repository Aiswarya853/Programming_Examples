package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Execution.Engine;
import utilites.ExcelFile;

public class TestCase01 {
	static WebDriver driver;
	//OpenBrowser	
	public static  void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/Softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();}

	public static void NavigatetoURL() throws InterruptedException {
		//Navigating to URL & maximizing
		driver.navigate().to(ExcelFile.dataclmValue);
		//"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
		driver.manage().window().maximize();
Thread.sleep(30);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));}

	public static void userNameSend() {
		//enter user name
		WebElement username = driver.findElement(Engine.locatoruh);
		username.sendKeys(ExcelFile.dataclmValue);}
	//enter password
	public static void pswdNameSend() {
		WebElement password = driver.findElement(Engine.locatoruh);
		password.sendKeys(ExcelFile.dataclmValue);}
	//click login button
	public static void loginClick() {
		WebElement loginbutton = driver.findElement(Engine.locatoruh);
		loginbutton.click();}

	//navigate to directory and click
	public static void myinfoClick() {
	WebElement myinfo = driver.findElement(Engine.locatoruh);
	myinfo.click();}
	//editing
	public static void emergencyDetailsAdd() {
	WebElement emgNo = driver.findElement(Engine.locatoruh);
	emgNo.sendKeys(ExcelFile.dataclmValue);}
	
	
	//Clicking on save button
	public static void submitclick() {
		WebElement saveutton = driver.findElement(Engine.locatoruh);
		saveutton.click();}
	
	//quit browser
	public static void quitBrowser() {
		driver.quit();}


}

