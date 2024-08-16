package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		//use of xpath locator
		//syntax= //tagname[@attribute name = 'attribute value'
		
		driver.findElement(By.xpath("//input[@ name='firstname']")).sendKeys("SAKSHI");
		driver.findElement(By.xpath("//input[@ name='Lastname']")).sendKeys("CHAUDHARI");
		driver.findElement(By.xpath("//input[@ name='reg_email_']")).sendKeys("sakshi.chaudhari019@gmail.com");
	   driver.findElement(By.xpath("//input[@ name ='reg_email_confirmation_']")).sendKeys("sakshi.chaudhari019@gmail.com");
	   driver.findElement(By.xpath("//input[@ name='password']")).sendKeys("sak23#$@");
	   
		
	}

}
