package testPage;

import java.io.IOException;

import org.testng.annotations.Test;

import sourcePage.BaseTest;
import sourcePage.LoginIntoPage;

public class LoginIntoTest extends BaseTest {
	
	
	
	@Test
	public void runLogin() throws IOException {
		LoginIntoPage lp = new LoginIntoPage(driver);
		String Username1 = "Demo12";
		String Password1 ="Test12345$";
		lp.loginpage( Username1, Password1);
		if (Username1.equals("Demo12") && Password1.equals("Test123456&")) {
			System.out.println("UserName and Password are equal, the login will be successfull");
			
		}
		else {
			captureScreenshot(driver, "runLogin");
			System.out.println("UserName and Password are not equal, the login willnot be successfull");
		}
		
	}
	

}
