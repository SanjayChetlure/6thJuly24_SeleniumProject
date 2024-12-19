package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class ex5_TestNGKeywords5_dependsOnMethod2
{
	@Test
	public void login1() 
	{
		Reporter.log("---running login1 TC--",true);
	}
	
	@Test
	public void login2() 
	{
		Reporter.log("---running login2 TC--",true)
	}
	
	@Test(dependsOnMethods = {"login1","login2"})
	public void logout() 
	{
		Reporter.log("---running logout TC--",true);
	}	
}
