package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
  
	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder=\"E-Mail Address\"]")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@placeholder=\"Password\"]")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@value=\"Login\"]")
	WebElement but_login;
	
	public void setEmailid(String email) {
		txt_email.sendKeys(email);
		
	}
	
	public void setpassWord(String pswd) {
		txt_password.sendKeys(pswd);
	}
	
	public void clickLogin() {
		but_login.click();
	}
}
