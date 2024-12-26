package testPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sourcePage.BaseTest;
import sourcePage.LoginPage;
import utility.ReadExcelFile;

public class loginTest extends BaseTest{

	static String xlfilepath =System.getProperty("user.dir") + "\\TestDatas\\DATA SHEET.ods";
	@Test(priority =1, dataProvider ="loginDataProvider")
	void verifyLogin(String username1, String password1) throws InterruptedException {
	LoginPage loggingin = new LoginPage(driver);
//		String username2 = "Demo12";
//		//String password2 ="Test123456$";
	System.out.println(xlfilepath);
	loggingin.loginBySubmit(username1,password1);

	}
	@DataProvider(name = "loginDataProvider" )
	public static String[][] loginDataProvider(){
		//ReadExcelFile xlfile =new ReadExcelFile();
		int	row = ReadExcelFile.getRowCount(xlfilepath, "Sheet1");
		int	clm =	ReadExcelFile.getcolumnCount(xlfilepath, "Sheet1");

		String[][] data = new String[row-1][clm];
		for(int i=1; i<row; i++) {
			for(int j=0; j<clm;j++) {
				data[i-1][j] = ReadExcelFile.getCellValue(xlfilepath, "Sheet1", i, j);
			}
		}
		return data;
	}
}

