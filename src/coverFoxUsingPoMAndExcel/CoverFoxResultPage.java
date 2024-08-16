package coverFoxUsingPoMAndExcel;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage {

	@FindBy(xpath = "//div[contains(text(),'Insurance Plans')]")
	private WebElement resultText;
	
	@FindBy(className = "plan-card-container")
	private List<WebElement> banners;
	
	public CoverFoxResultPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void validateBanners() throws InterruptedException {
	
		Thread.sleep(2000);
		 String[] ar = resultText.getText().split(" ");
		 String numberInString = ar[0];
		int result = Integer.parseInt(numberInString);
		System.out.println("Matching number "+result);
		 List<WebElement> banners1 = banners;
		 int numberofbanners=banners.size();
			System.out.println("Banner numbers "+numberofbanners);
			if(result==numberofbanners)
			{
				System.out.println("Result is matching TC is passed");
			}
	
			else
			{
				System.out.println("Result is not matching T");
			}
	}
	public int getPlanNumbersFromString()
	{
		String ar[]=resultText.getText().split("");
		int result = Integer.parseInt(ar[0]);
		return result;
	}
	public int getPlanNumbersFromBanners()
	{
		List<WebElement> banners1 = banners;
		int bannerSize = banners.size();
		return bannerSize;
	}
	public boolean is_displaySortPlan()
	{
		boolean ChecksortPlan = is_displaySortPlan();
		return ChecksortPlan;
		
	}
	}
	
	
	
	
	
