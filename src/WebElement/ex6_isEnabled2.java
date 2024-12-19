package WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_isEnabled2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")).isEnabled();
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
