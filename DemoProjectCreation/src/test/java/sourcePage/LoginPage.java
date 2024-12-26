package sourcePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends BaseTest {
	 WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	//this.driver =driver;
	PageFactory.initElements(driver, this);
	}
	//@FindBy(xpath="//*[@id=\"loginlabel\"]") WebElement loginclick;
	@FindBy(xpath="//a[@id='loginlabel' and @class='lg_button']") WebElement login;
	@FindBy(id="user_login") WebElement uname;
	@FindBy(id="user_pass") WebElement pswd;
	@FindBy(id="wp-submit") WebElement submittButton;
	public void loginBySubmit(String username1, String password1) throws InterruptedException {
		login.click();
		uname.sendKeys(username1);
		pswd.sendKeys(password1);
		Thread.sleep(2000);
		submittButton.click();
	}
	
}

