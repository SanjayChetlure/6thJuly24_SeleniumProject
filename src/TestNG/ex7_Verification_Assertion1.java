package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ex7_Verification_Assertion1
{
		
	@Test
	public void m1_assertEquals() 
	{
		String actResut="xyz";
		String expResut="abcd";
		Assert.assertEquals(actResut, expResut,"Failed: both resuts are diff-  ");		   //className.methodName();
	}
	
	
	
//	@Test
//	public void TC1() 
//	{
//		String actResut="abcd";
//		String expResut="abcd";
//		if(actResut.equals(expResut))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}		
//	}
	
	
}
