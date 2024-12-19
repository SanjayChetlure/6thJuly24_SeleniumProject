package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex9_className
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/6th%20July%202024/Selenium/html%20files/className.html");
		
		//enter FN
		driver.findElement(By.className("1234")).sendKeys("abc");
		
		//enter LN
		driver.findElement(By.className("1234")).sendKeys("xyz");
	}
}
