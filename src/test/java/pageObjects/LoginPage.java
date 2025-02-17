package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement inputemail;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement inputpassword;
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbtn;
	
	public void enteremail(String email) {
		inputemail.sendKeys(email);
	}
	public void enterpassword(String password) {
		inputpassword.sendKeys(password);
	}
	public void clicklogin() {
		loginbtn.click();
	}

}
