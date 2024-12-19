package WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_getAttribute2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		enter UN
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		

		String text = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		System.out.println(text);
	}
}
