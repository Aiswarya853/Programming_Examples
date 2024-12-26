package sourcePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginIntoPage {
	WebDriver driver;
	 
	public LoginIntoPage(WebDriver Driver1) {
		this.driver= Driver1;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='loginlabel' and @class='lg_button']") WebElement loginbutton;
	@FindBy(id="user_login") WebElement uname;
	@FindBy(id="user_pass") WebElement pswd;
	@FindBy(id="wp-submit") WebElement submittButton;
	@FindBy(xpath = "//*[@id='login_drop_panel']/div/ul/li[3]/a") WebElement logout;
 public  void loginpage(String username, String password) {
	loginbutton.click();
	uname.sendKeys(username);
	pswd.sendKeys(password);
	submittButton.click();
	logout.submit();
	
	
	
}


}