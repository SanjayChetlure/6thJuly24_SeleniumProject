package TestNG;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ex12_MultibrowserTesting 
{
	@Parameters("browserName")
	@Test
	public void verifyLoginTC(String browserName) throws InterruptedException
	{		
		WebDriver driver=null;
		
		if(browserName.equals("chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(browserName.equals("edge"))
		{
			 driver=new EdgeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			 driver=new FirefoxDriver();
		}
				
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		String actTitle = driver.getTitle();
		String expTitle = "Swag Labs";
		if(actTitle.equals(expTitle))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Fail");
		}
		Thread.sleep(3000);
		driver.quit();
	}
	
}
