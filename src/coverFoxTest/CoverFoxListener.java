package coverFoxTest;

import java.io.IOException;


import org.apache.poi.ss.formula.functions.Address;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import coverFoxBase.Base;
import coverFoxPOM.CoverFoxAddressDetailsPage;
import coverFoxPOM.CoverFoxHealthPlanPage;
import coverFoxPOM.CoverFoxResultPage;
import coverFoxUtility.Utility;
import coverFoxPOM.CoverFoxMemberDetailsPage;
import coverFoxPOM.CoverFoxHomePage;


@Listeners(coverFoxUtility.Listener.class)
public class CoverFoxListener extends Base 
{
CoverFoxHomePage  homePage;
CoverFoxHealthPlanPage  healthPlan;
CoverFoxAddressDetailsPage  addressPage;
CoverFoxMemberDetailsPage  memberePage;
CoverFoxResultPage resultPage;
String Filepath;

@BeforeTest
public void launchBrowser()
{
	openBrowser();
	homePage = new CoverFoxHomePage(driver);
	healthPlan = new CoverFoxHealthPlanPage(driver);
	addressPage = new CoverFoxAddressDetailsPage(driver);
	memberePage = new CoverFoxMemberDetailsPage(driver);
	resultPage = new CoverFoxResultPage(driver);
	Filepath = "d:\\excel\\Stringdata.xlsx";
}
@BeforeClass
public void preconditions() throws InterruptedException,IOException 
{
	
	      // Home-Page
			Thread.sleep(1000);
			homePage=new CoverFoxHomePage(driver);
			homePage.clickOnGenderButton();

			// Health-Plan Page
			Thread.sleep(2000);
			healthPlan=new CoverFoxHealthPlanPage(driver);
			healthPlan.clickOnNextButton();

			// Member-details Page
			Thread.sleep(2000);
			memberePage =new CoverFoxMemberDetailsPage(driver);
	        
	        memberePage.handleAgeDropDown(Utility.readDataFromPropertiesFile("age"));
			memberePage.clickOnNextButton();

			Thread.sleep(2000);

			// Address-Details Page
			addressPage=new CoverFoxAddressDetailsPage(driver);
			addressPage.enterPincode(Utility.readDataFromPropertiesFile("pincode"));
			addressPage.enterMobileNumber(Utility.readDataFromPropertiesFile("mobno"));
			addressPage.clickOnContinueButton();

			Thread.sleep(2000);
}
@Test
public void validationBanners() throws InterruptedException
{
	Thread.sleep(4000);
	Assert.fail();
	int bannerPlanNumber= resultPage.getPlanNumersFromBanners();
	int StringPlanNumbers = resultPage.getPlanNumersFromString();
	Assert.assertEquals(StringPlanNumbers,bannerPlanNumber,"Plan on banners not matching with result,TC failed");
	
}
@Test
public void ChecksortPlan() throws InterruptedException 
{
	Thread.sleep(4000);
//	Assert.fail();
	Assert.assertEquals(resultPage.sortPlanFilterIsDisplayed(),"Sort plan Dropdown is not display,TC is fail");
	
}
@AfterClass
public void CloseBrowser()
{
	driver.close();	
}	
	
}

