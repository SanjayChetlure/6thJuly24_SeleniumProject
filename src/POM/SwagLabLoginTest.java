package POM;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Test class
public class SwagLabLoginTest
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SwagLabLoginPage login=new SwagLabLoginPage(driver);     //basic/early initialization
		login.inpSwagLabLoginPageUsername();                                  //late/lazy initialization
		login.inpSwagLabLoginPagePassword();
		login.clickSwagLabLoginPageLoginBtn();
		Thread.sleep(2000);
		
		SwagLabHomePage home=new SwagLabHomePage(driver);
		home.verifySwagLabHomePageLogo();
		Thread.sleep(2000);
		home.clickSwagLabHomePageOpenMenu();
		Thread.sleep(2000);
		
		SwagLabOpenMenuPage menu=new SwagLabOpenMenuPage(driver);
		menu.clickSwagLabOpenMenuPageLogoutBtn();
		
		Thread.sleep(2000);
		driver.quit();	
	}
}
