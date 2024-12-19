package TestNG;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class ex7_Verification_Assertion6
{
	@Test
	public void m1_softAssert() 
	{
		SoftAssert soft=new SoftAssert();
		
		boolean actResut=false;
		soft.assertTrue(actResut, "Failed1: act Result false - ");	
		
		
		String actResut1="xyz";
		String expResut1="abcd";
		soft.assertEquals(actResut1, expResut1,"Failed2: both resuts are diff-  ");		   //className.methodName();

		soft.assertAll();
	}
}
