package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ex7_Verification_Assertion5
{
	@Test
	public void limitationOfAssertClass() 
	{
		boolean actResut=false;
		Assert.assertTrue(actResut, "Failed1: act Result false - ");	
		
		
		String actResut1="xyz";
		String expResut1="abcd";
		Assert.assertEquals(actResut1, expResut1,"Failed2: both resuts are diff-  ");		   //className.methodName();
	}
}
