package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ex7_Verification_Assertion2
{
	@Test
	public void m2_assertNotEquals() 
	{
		String actResut="xyz";
		String expResut="xyz";
		Assert.assertNotEquals(actResut, expResut,"Failed: both resuts are same-  ");		 
	}
}
