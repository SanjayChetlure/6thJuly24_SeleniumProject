package WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_isEnabled1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		System.out.println(result);
		
		if (result) 
		{
			System.out.println("Element is Enabled");
		}
		else
		{
			System.out.println("Element is disabled");
		}
	}
}
