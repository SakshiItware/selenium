package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyword_Eg5 {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://en-gb.facebook.com/r.php");
  Thread.sleep(1000);
  WebElement nameField = driver.findElement(By.name("firstname"));
  
  Actions act= new Actions(driver);
  
  //act.sendKeys(nameField,"Velocity").perform();
  
  act.sendKeys("Velocity").keyUp(Keys.SHIFT).build().perform();
	}

}
