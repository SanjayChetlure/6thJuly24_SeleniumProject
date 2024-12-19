package TestNG;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex4_TestNgAnnotations 
{
	@BeforeClass
	public void openBrowser() 
	{
		Reporter.log("open Browser",true);
	}
	
	@BeforeMethod
	public void loginToApp() 
	{
		Reporter.log("Login to app",true);
	}
	
	@Test
	public void verifyLogo1() 
	{
		Reporter.log("---running verify Logo1 TC--",true);
	}
	
	@Test
	public void verifyLogo2() 
	{
		Reporter.log("---running verify Logo2 TC--",true);
	}
	
	@AfterMethod
	public void logoutFromApp() 
	{
		Reporter.log("logout From App",true);
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		Reporter.log("close Browser",true);
	}
}
