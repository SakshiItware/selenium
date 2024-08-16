package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstNumberOfLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		List<WebElement> totalLinks =driver.findElements(By.tagName("a"));

		//print how many links are there?
		System.out.println(totalLinks.size());
		
		//print all links
		System.out.println(totalLinks);
		
		//using forloop
//		for(int i=0;i<=totalLinks.size()-1;i++)
//		{
//			System.out.println(totalLinks.get(i).getText());
//		}
		
		//for each
		
		
		for(WebElement t:totalLinks)
		{
			System.out.println(t.getText());
		}
		
		
		
		
	}

}
