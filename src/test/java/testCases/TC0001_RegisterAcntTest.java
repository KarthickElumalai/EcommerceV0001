package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CreateAcntPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC0001_RegisterAcntTest extends BaseClass {
	@Test(groups= {"Sanity","Master"})
	public void createAcnt() {
		logger.info("Starting Test TC0001_CreateAcntTest");
		
		try {
		HomePage hp=new HomePage(driver);
		logger.info("Clicking create account");
		hp.clickMyAcnt();
		hp.clickRegAcc();
		
		CreateAcntPage acntpage=new CreateAcntPage(driver);
		logger.info("Entering personal details");
		acntpage.setfirstname(randomString().toUpperCase());
		acntpage.setlastname(randomString().toUpperCase());
		acntpage.setemail(randomString()+"@gmail.com");
		acntpage.setphonenum(randomNumeric());
		String password=randomAlphaNumeric();
		acntpage.setpassword(password);
		acntpage.cnfrmpassword(password);
		acntpage.setpolicy();
		acntpage.clickcontinue();
		
		logger.info("Confirming the message");
		String cnfrmmsg=acntpage.checkCnfrmMsg();
		if(cnfrmmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else 
		{
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.assertTrue(false);
		}
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("Finished Test TC0001_CreateAcntTest");
	}
	

}
