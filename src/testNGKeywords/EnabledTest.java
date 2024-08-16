package testNGKeywords;



import org.testng.annotations.Test;
import org.testng.Reporter;

public class EnabledTest {

	@Test
	public void a()
	{
		Reporter.log("A is running",true);
	}
	@Test(enabled = true)
	
	public void b()
	{
	Reporter.log("B is running", true);
	}
	@Test
	public void c()
	{
	Reporter.log("C is running", true);
	}
	
	
	
	
}
