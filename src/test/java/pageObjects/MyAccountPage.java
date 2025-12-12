package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	
	public MyAccountPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//div[@id=\"content\"]/h2[1]")
	WebElement My_account_header;
	
	
	@FindBy(xpath="//aside[@id=\"column-right\"]//a[13]") //added in step6
	WebElement button_logout;
	
	
	public boolean isMyAccountPageExists() {
		
		try {
		return (My_account_header.isDisplayed());
	}
		catch(Exception e) {
			return false;
		}
	}
	
	public void clickLogout() {
		
		button_logout.click();
	}
	    
}
