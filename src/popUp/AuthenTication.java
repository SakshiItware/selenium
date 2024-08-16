package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenTication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		How to handle https://username:passwprd@URL
//			username:admin
//			password:admin
//			url:https://the-internet.herokuapp.com/basic_auth
				
				String username="admin";
		        String password="admin";
		        
	//driver.get("https://the-internet.herokuapp.com/basic_auth");
		        driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		        
		        System.out.println(driver.findElement(By.tagName("p")).getText());
	
	
	}

}
