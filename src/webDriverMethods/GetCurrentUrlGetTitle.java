package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetCurrentUrlGetTitle {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		
		String myTitle = driver.getTitle();
		
		System.out.println(myTitle);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

}
