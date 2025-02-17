package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAcntPage extends BasePage {
	WebDriver driver;
	
	public CreateAcntPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement phnnum;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement cnfrmpassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement policyagree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuebtn;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement cnfrmmsg;
	
	
	public void setfirstname(String fname) {
		firstname.sendKeys(fname);
	}
	public void setlastname(String lname) {
		lastname.sendKeys(lname);
	}
	public void setemail(String semail) {
		email.sendKeys(semail);
	}
	public void setphonenum(String sphonenum) {
		phnnum.sendKeys(sphonenum);
	}
	public void setpassword(String pword) {
		password.sendKeys(pword);
	}
	public void cnfrmpassword(String cpword) {
		cnfrmpassword.sendKeys(cpword);
	}
	public void setpolicy(){
		policyagree.click();
	}
	public void clickcontinue() {
		continuebtn.click();
	}
	public String checkCnfrmMsg() {
		String viewedmsg=cnfrmmsg.getText();
		return viewedmsg;
	}
	
	
	
	
	
	
	
}
