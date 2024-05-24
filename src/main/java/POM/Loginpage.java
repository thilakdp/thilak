package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public Loginpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy (id="Email")
private WebElement Emailtextfield;

@FindBy (id ="Password")
private WebElement PasswordTextfield;


@FindBy (xpath="//input[@value='Login in']")
private WebElement loginButton;

public WebElement getEmailtextField() {
	return Emailtextfield;
	
}
	public WebElement getpasswordTextfield() {
		return PasswordTextfield;
		
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
}
