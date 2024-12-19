package POM_DDF_TestNG_BaseClass_UtilityClass;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabLoginTest extends BaseClass
{
	SwagLabLoginPage login;
	SwagLabHomePage home;
	SwagLabOpenMenuPage menu;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		initializeBrowser();
		
		login=new SwagLabLoginPage(driver);  
		home=new SwagLabHomePage(driver);
		menu=new SwagLabOpenMenuPage(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.inpSwagLabLoginPageUsername(UtilityClass.getTD(0, 0));
		login.inpSwagLabLoginPagePassword(UtilityClass.getTD(0, 1));
		login.clickSwagLabLoginPageLoginBtn();
		Thread.sleep(2000);
	}
		
	@Test
	public void verifyLogo() throws EncryptedDocumentException, IOException 
	{
		String actLogoText=home.getSwagLabHomePageLogoText();
		String expLogoText=UtilityClass.getTD(0, 2);
		Assert.assertEquals(actLogoText, expLogoText,"Failed: - both results are diff:   ");
	}
		
	@AfterMethod
	public void logoutFromApp() throws InterruptedException
	{
		home.clickSwagLabHomePageOpenMenu();
		Thread.sleep(2000);
		menu.clickSwagLabOpenMenuPageLogoutBtn();
		Thread.sleep(2000);
	}
		
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
