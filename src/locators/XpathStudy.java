package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(2000);
		// xpath-->
	//	driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		// id-->
		WebElement mobileNumberField = driver.findElement(By.id("mobileNumber"));
		mobileNumberField.sendKeys("7397955171");
		// name-->
		driver.findElement(By.name("mobileNumber"));
		}
		
		
		
	}


