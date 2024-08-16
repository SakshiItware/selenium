package dropDown_List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/Automationpractce/");

//1.Identify list box to be handled and store it in reference variable
WebElement dropDown = driver.findElement(By.cssSelector("select#dropdown-class-example"));
Thread.sleep(1000);
//2. Create an object of select class which will accept WebElement as argument
Select s= new Select(dropDown);

//3.By using one of the select class method we can select value fromm list box like
//option2
//s.SelectByIndex(2);
s.selectByValue("Option2");
s.selectByVisibleText("Option2");
	}
	
	
}