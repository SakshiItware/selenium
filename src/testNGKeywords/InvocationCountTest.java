package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountTest {


		
		@Test(invocationCount=4)
		public void mytest() {
		Reporter.log("My test id rinning",true);
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method is running");
	
	}

}
