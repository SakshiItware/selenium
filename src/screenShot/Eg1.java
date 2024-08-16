package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Eg1 {
public static void main(String[] args) throws IOException {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.naukri.com/nlogin/login");
File myfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
System.out.println(myfile);
File destination = new File("C:\\logs\\TakeScreenshot selenium\\tst.png");
FileHandler.copy(myfile, destination);



}



		
		
		
		
		
	}


