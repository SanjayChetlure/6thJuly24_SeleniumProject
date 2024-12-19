package Framework;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_ExampleWithoutDDF 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//enter UN
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		//click on login btn
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		
		//get Title
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
