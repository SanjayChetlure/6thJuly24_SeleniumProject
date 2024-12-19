package POM;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Test class
public class SwagLabLoginSimplePOMTest
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SwagLabLoginPage1 login=new SwagLabLoginPage1(driver);  //complete initialization   
		login.enterUsername();                                    
		login.enterPassword();
		login.clickOnLogin();
		Thread.sleep(2000);
		
		
	}
}
