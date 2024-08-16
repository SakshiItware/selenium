package misc;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");
Thread.sleep(1000);
driver.findElement(By.name("q")).sendKeys("Wardha");
Thread.sleep(1000);
List<WebElement>resluts=
(List<WebElement>) driver.findElement(By.xpath("(//ul[@class='G43f7e'])[1]/li"));

System.out.println(resluts.size());//10

//for each

for(WebElement r:resluts)
{
	System.out.println(r.getText());
}
Thread.sleep(1000);

String reqired="munjya cast";

for(WebElement r:resluts) {
	
	String actualText=r.getText();
	Thread.sleep(1000);
	
	if(actualText.equals(reqired))
	{
		r.click();
		break;
		
		
	}
}
	
	}

}
