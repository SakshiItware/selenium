package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollByUse {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.flipkart.com/");
 		
	
		 Thread.sleep(2000);
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(90;1500)");
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(90'500)");
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(90,-1500)");
	}

}
