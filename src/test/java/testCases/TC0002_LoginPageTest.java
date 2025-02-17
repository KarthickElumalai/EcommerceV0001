package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC0002_LoginPageTest extends BaseClass {
	
	@Test(groups= {"Sanity","Regresion","Master"})
	public void verifyLoginPage() {
		logger.info("Starting Test TC0002_LoginPageTest");
		try {
			logger.info("Opening Home Page");
			HomePage hp=new HomePage(driver);
			hp.clickMyAcnt();
			hp.clickLgn();
			
			logger.info("Opening Home Login Page");
			LoginPage lp=new LoginPage(driver);
			lp.enteremail(p.getProperty("email"));
			lp.enterpassword(p.getProperty("password"));
			lp.clicklogin();
			
			logger.info("Opening My Account Page");
			MyAccountPage maccp=new MyAccountPage(driver);
			boolean macctest=maccp.verifymyacnt();
			Assert.assertEquals(macctest, true,"LoginFailed");
			
			logger.info("Finished Testing TC0002_LoginPageTest");
		}
		catch(Exception e) {
			Assert.fail();
		}
		
	}

}
