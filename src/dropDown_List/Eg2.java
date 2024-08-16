package dropDown_List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Eg2 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/signup");
   Thread.sleep(2000);
   //1.
   WebElement day = driver.findElement(By.name("birthday_day"));
   //2.
   Select sDay = new Select(day);
   //3.
   sDay.selectByVisibleText("23");
   
   Thread.sleep(2000);
   WebElement month = driver.findElement(By.id("months"));
   Select sMonth = new Select(month);
   sMonth.selectByIndex(6);
   
   Thread.sleep(2000);
   WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
   Select sYear = new Select(year);
   sYear.deselectByValue("1997");
   
  
		   
   
	}

}
