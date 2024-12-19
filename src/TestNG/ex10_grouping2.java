package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class ex10_grouping2
{
	@Test(groups = {"Login"})
	public void TC6() 
	{
		Reporter.log("---running TC6--",true);
	}
	
	@Test(groups = {"Login"})
	public void TC7() 
	{
		Reporter.log("---running TC7--",true);
	}
	
	@Test(groups = {"Payment"})
	public void TC8() 
	{
		Reporter.log("---running TC8--",true);
	}
	
	@Test(groups = {"Payment"})
	public void TC9() 
	{
		Reporter.log("---running TC9--",true);
	}
	
	@Test(groups = {"Profile"})
	public void TC10() 
	{
		Reporter.log("---running TC10--",true);
	}
}
