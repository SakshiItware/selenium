package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).sendKeys("Velocity");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).sendKeys("class");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_5')]")).click();

		String myText = driver.findElement(By.xpath("//div[contains(text(),'new account')]")).getText();

		System.out.println(myText);
	}

}
