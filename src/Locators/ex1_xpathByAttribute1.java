package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_xpathByAttribute1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(locator type)
		//driver.findElement(By.xpath("xpathExpression"))
		
		//enter UN
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz");
		
		//click on login btn
		driver.findElement(By.xpath("//button[@name='login']")).click();	
	}
}
