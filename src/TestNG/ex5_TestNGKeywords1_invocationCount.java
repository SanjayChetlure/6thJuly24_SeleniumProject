package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex5_TestNGKeywords1_invocationCount
{
	@Test(invocationCount = 2)
	public void verifyLogo1() 
	{
		Reporter.log("---running verify Logo1 TC--",true);
	}
}
