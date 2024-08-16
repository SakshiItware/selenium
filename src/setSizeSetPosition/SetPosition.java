package setSizeSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.co.in/");
Thread.sleep(1000);

Point p= driver.manage().window().getPosition();
System.out.println(p);

Point point = new Point(500,10);

Thread.sleep(2000);
driver.manage().window().setPosition(point);

Point point1= new Point(-200,-100);
Thread.sleep(2000);
driver.manage().window().setPosition(point1);
	}

}
