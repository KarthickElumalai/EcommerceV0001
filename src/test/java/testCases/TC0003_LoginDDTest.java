package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC0003_LoginDDTest extends BaseClass {
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class, groups={"Master","DataDriven"})
	public void verifyLoginDDT(String email, String pass, String expresult) {
		logger.info("Starting Test TC0003_LoginDDTest");
		
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAcnt();
		hp.clickLgn();
		
		LoginPage lp=new LoginPage(driver);
		lp.enteremail(email);
		lp.enterpassword(pass);
		lp.clicklogin();
		
		MyAccountPage maccp=new MyAccountPage(driver);
		boolean macctest=maccp.verifymyacnt();
		
		if(expresult.equalsIgnoreCase("valid")) {
			if(macctest==true) {
				maccp.clicklgout();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		
		if(expresult.equalsIgnoreCase("invalid")) {
			if(macctest==true) {
				maccp.clicklgout();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
		}catch(Exception e) {
			Assert.assertTrue(false);
		}
		logger.info("Finished Test TC0003_LoginDDTest");
	}

}
