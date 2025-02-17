package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myacntlnk;
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement regacntlnk;
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement loginlnk;
	
	
	public void clickMyAcnt() {
		myacntlnk.click();
	}
	public void clickRegAcc() {
		regacntlnk.click();
	}
	public void clickLgn() {
		loginlnk.click();
	}
	
	
	
	
	

}
