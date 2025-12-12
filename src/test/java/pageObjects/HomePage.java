package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
 public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='My Account']") 
    WebElement account_link;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register_link;
	
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement login_link;
	
	public void clickAccount() {
		
		account_link.click();
	}
	
	public void clickRegister() {
		
		register_link.click();
	}
	
	public void clickLogin() {
		
		login_link.click();
	}
	
}
