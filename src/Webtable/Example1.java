package Webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshetyacademy.com/AutomationPractice/");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

List<WebElement> row = driver.findElements(By.xpath("//table[@name='course']//tr"));

//how many row are there?

int totalNumberOfRow = row.size();
System.out.println("Total row in table are"+totalNumberOfRow);

//how many column are there?
List<WebElement>columns =driver.findElements(By.xpath("//table[@name='course']//tr[1]/th"));
int totalNumberOfColumns = columns.size();
System.out.println("Total columns in table are"+totalNumberOfColumns);

//how to read perticular data from table
WebElement myelement = driver.findElement(By.xpath("//table[@name='course']//tr[3]/td[2]"));
String myText = myelement.getText();
System.out.println("Data is "+myText);

//how to read perticular row from table
//table[@name='course']//tr[5]/td[1]
//table[@name='course']//tr[5]/td[2]
//table[@name='course']//tr[5]/td[3]

for(int i=1;i<=3;i++)//1--3
{
	WebElement element=
			driver.findElement(By.xpath("//table[@name='courses']//tr[5]/td["+i+"]"));

	String text = element.getText();
	System.out.println(text);
	
	
}
	

	}

}
