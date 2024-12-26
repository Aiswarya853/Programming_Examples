package testPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import sourcePage.BaseTest;
import sourcePage.LoginPage;
import utility.ReadExcelFile;


public class LoginnTest extends BaseTest {
	
	static String xlfilepath =System.getProperty("user.dir") + "\\TestDatas\\DATA SHEET.xlsx";
	@Test
	public void loginPortal() throws InterruptedException {
		System.out.println(xlfilepath);
		LoginPage lp = new LoginPage(driver);
		String username = ReadExcelFile.getCellValue(xlfilepath, "Sheet1", 1, 0);
		String Password = ReadExcelFile.getCellValue(xlfilepath, "Sheet1", 1, 1);
		System.out.println("The User Name is: " + username);
		System.out.println("The Password is: " + Password);
		lp.loginBySubmit(username, Password);
		
		}}
//	@Test
//	void verifyLogin() {
//		LoginPage loggingin = new LoginPage(driver);
//		String Username = "Demo12";
//		String Password ="Test123456$";
//		loggingin.loginBySubmit(Username,Password);}
//
//}
