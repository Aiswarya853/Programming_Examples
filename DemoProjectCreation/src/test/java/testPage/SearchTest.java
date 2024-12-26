package testPage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import sourcePage.BaseTest;
import sourcePage.LoginPage;
import sourcePage.SearchPage;
import utility.ReadExcelFile;

public class SearchTest extends BaseTest{
	static String xlfilepath =System.getProperty("user.dir") + "\\TestDatas\\DATA SHEET.ods";
	@Test
	void searchTest() throws InterruptedException, IOException {
		LoginIntoTest lp = new LoginIntoTest();
		lp.runLogin();
		
		
		SearchPage sp =new SearchPage(driver);
		//String	course = ReadExcelFile.getCellValue(xlfilepath, "Sheet2", 0, 0);
		String course="HTML for Beginners";
		sp.searchCourse(course);
		sp.verifyPageTitle();
	}

}
