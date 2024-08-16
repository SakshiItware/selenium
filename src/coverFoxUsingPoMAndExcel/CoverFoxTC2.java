package coverFoxUsingPoMAndExcel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import commonMethod.Utility;
import dev.failsafe.internal.util.Assert;

public class CoverFoxTC2 {

	
		private static final String StringplanNumbers = null;
		WebDriver driver;
		CoverFoxHomePage homePage;
		CoverFoxHealthPlanPage healthPlanPage;
		CoverFoxAddressDetailsPage addressDetailsPage;
		CoverFoxMemberDetailsPage memberDetailsPage;
		CoverFoxResultPage resultPage;
		String filePath;
		
		@BeforeTest
		public void launchBrowser()
		{
			
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notification");
			driver=new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.get("https://www.coverfox.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			homePage=new CoverFoxHomePage(driver);
			healthPlanPage=new CoverFoxHealthPlanPage(driver);
			addressDetailsPage=new CoverFoxAddressDetailsPage(driver);
			memberDetailsPage=new CoverFoxMemberDetailsPage(driver);
			resultPage= new CoverFoxResultPage(driver);
			filePath = "D:\\sakshiExceldoc.xlsx\\";
		
	}

		
		@BeforeClass
		public void preConditions()throws InterruptedException,EncryptedDocumentException,IOException
		{
			
			homePage.clickOnGenderButton();
			Thread.sleep(1000);
			healthPlanPage.clickOnNextButton();
			Thread.sleep(1000);
			
			memberDetailsPage.handleAgeDropDown(Utility.readDataFromExcel(filePath, "Sheet5", 0, 0));
			
			memberDetailsPage.clickOnNextButton();
			Thread.sleep(1000);
			addressDetailsPage.enterMobileNumber(Utility.readDataFromExcel(filePath, "Sheet", 0, 1));
			
			addressDetailsPage.enterMobileNumber(Utility.readDataFromExcel(filePath, "Sheet", 0, 2));
			
			addressDetailsPage.clickOnContinueButton();
		}
		@Test
		public void validateBanners()throws InterruptedException {
			Thread.sleep(4000);
			int bannerPlanNumbers = resultPage.getPlanNumbersFromBanners();//actual
			int StringPlanNumbers = resultPage.getPlanNumbersFromString();//expected
			org.testng.Assert.assertEquals(StringplanNumbers, bannerPlanNumbers,"Plans on banners not matching with results, TC failed");

					}
					@AfterClass
					public void closeBrowser()
					{
					driver.close();

		}
		
		
}
		
