package chromeOptionsUse;

import java.lang.foreign.Linker.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              
		ChromeOptions options = new ChromeOptions();
		
	 //options.addArguments("start-maximized");
	// Options.addArguments("incognito");
	 //options.getArguments("--headless=new");
	 options.addArguments("-headless");
	 WebDriver driver= new ChromeDriver(options);
	 driver.get("https://www.naukri.com/");
	 Thread.sleep(4000);
	 String myText =

	 driver.findElement(By.xpath("//h1[contains(text(),'Find')]")).getText();

	 System.out.println(myText);
	}

}
