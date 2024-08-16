package SeneliumWait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/home");
		
WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(15000));
		

w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h6[text()='Sign In'])[2]")));


driver.findElement(By.xpath("(//h6[text()='sign In'])[2]")).click();

	}
	
}
