package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	//constructor
	public AccountRegistrationPage(WebDriver driver) {
		
		super(driver);
	}
	
	//locators
	@FindBy(xpath="//input[@id=\"input-firstname\"]")
	WebElement txtfirst_name;
	
	@FindBy(xpath="//input[@id=\"input-lastname\"]")
	WebElement txtlast_name;
	
	@FindBy(xpath="//input[@id=\"input-email\"]")
	WebElement txtemail_id;
	
	@FindBy(xpath="//input[@id=\"input-telephone\"]")
	WebElement txttelephone_no;
	
	@FindBy(xpath="//input[@id=\"input-password\"]")
	WebElement txtpass_word;
	
	@FindBy(xpath="//input[@id=\"input-confirm\"]")
	WebElement txtpassword_confirm;
	
	@FindBy(xpath="//input[@name=\"agree\"]")
	WebElement chkAgree;

	@FindBy(xpath="//input[@value=\"Continue\"]")
	WebElement buttcon_button;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement account_confirmation;
	
	
	public void firstname(String fname) {
		txtfirst_name.sendKeys(fname);
	}
	
	public void lastname(String lname) {
		txtlast_name.sendKeys(lname);
	}
	
	public void email_id(String emid) {
		txtemail_id.sendKeys(emid);
	}
	
	public void tele_no(String telno) {
		txttelephone_no.sendKeys(telno);
	}
	
	public void pass_word(String password) {
		txtpass_word.sendKeys(password);
		
	}
	
	public void con_password(String con_pass) {
		txtpassword_confirm.sendKeys(con_pass);
	}
	
	public void agree() {
		chkAgree.click();
	}
	
	public void con_tinue() {
		buttcon_button.click();
	}
	
	public String getconfirmationmsg() {
		try {
			
			return(account_confirmation.getText());
		}
		catch(Exception e){
			return(e.getMessage());
		}
		
	}
}
