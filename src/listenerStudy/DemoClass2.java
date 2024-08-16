package listenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class DemoClass2 {
	
	@Test
	public void e()
	{
		Reporter.log("e is running",true);
	}
	@Test(dependsOnMethods= {"z"})
	public void f()
	{
		Reporter.log("f is running",true);
	}
	@Test
	public void g()
	{
		Assert.fail();
		Reporter.log("g is running",true);
	}
	@Test
	public void h()
	{
		Reporter.log("h is running",true);
	}
}
