package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  
		WebDriver driver= new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(2000);
		//boolean result = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled
		
	//	driver.findElement(By.xpath("//button[text()='Get OTP']")).click();

		WebElement mobileNumberField =

		driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		mobileNumberField.sendKeys("7777777777");
		// code optimise

		WebElement getOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));

		boolean result = getOtpButton.isEnabled();
		// getOtpButton.click();
		System.out.println(result);
		
	}
}
		
				
		
		
		
		
		
		
		
	


