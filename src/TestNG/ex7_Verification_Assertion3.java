package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ex7_Verification_Assertion3
{
	@Test
	public void m3_assertTrue() 
	{
		boolean actResut=false;
		Assert.assertTrue(actResut,"Failed: act result is false - ");		 
	}
}
