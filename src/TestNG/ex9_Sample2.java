package TestNG;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class ex9_Sample2
{
	@Test
	public void TC4() 
	{
		Reporter.log("---running TC4--",true);
	}
	
	@Test
	public void TC5() 
	{
		Reporter.log("---running TC5--",true);
	}
	
	@Test
	public void TC6() 
	{
		String actResult="abcd";
		String expResult="xyz";
		Assert.assertEquals(actResult, expResult,"Failed TC6: both Results are diff");
		Reporter.log("---running TC6--",true);
	}
}
