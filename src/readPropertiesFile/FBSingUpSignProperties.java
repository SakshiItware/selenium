package readPropertiesFile;

import java.io.IOException;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethod.Utility;

public class FBSingUpSignProperties 

{
@Test
public void data() throws IOException, InterruptedException

{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	String url = UltilityProperties.readDataFromProertyFile("url");
	driver.get(url);
	driver.findElement(By.name("Firstname")).sendKeys(UltilityProperties.readDataFromProertyFile("firstName"));
	 driver.findElement(By.name("lastname")).sendKeys(UltilityProperties.readDataFromProertyFile("lastName"));
	  driver.findElement(By.name("mobNum")).sendKeys(UltilityProperties.readDataFromProertyFile("mobNum"));
	  Thread.sleep(2000);
	  driver.close();
 }




}


