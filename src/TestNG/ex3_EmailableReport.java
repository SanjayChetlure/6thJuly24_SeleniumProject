package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
//Test Class
public class ex3_EmailableReport 
{
	@Test
	public void TC3()       //Test case or test method
	{
		Reporter.log("--running TC3---");     //className.methodName("msg", true)
	}
	
	@Test
	public void TC1()     //Test case or test method
	{
		Reporter.log("--running TC1---",false);  
	}
	
	@Test
	public void TC2()       //Test case or test method
	{
		Reporter.log("--running TC2---",true);  
	}
}
