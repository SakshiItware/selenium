package chromeBrowertestcase;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;



public class FBSingUp {
	
		WebDriver driver;
  @org.testng.annotations.Parameters ("browserName")
		@Test
		public void CrossBrowser (String bname ) throws InterruptedException {
		
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			} else if (bname.equalsIgnoreCase("fireFox")) {
			driver = new FirefoxDriver();
			} else if (bname.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			driver.get("https://www.facebook.com/signup");
			driver.findElement(By.name("firstname")).sendKeys("Velocity");
			driver.findElement(By.name("lastname")).sendKeys("Pune");
			driver.findElement(By.name("reg_email__")).sendKeys("8888888888");
			Thread.sleep(2000);
			driver.close();
			}

	}


