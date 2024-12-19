package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_Tagname 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/6th%20July%202024/Selenium/html%20files/Tagname.html");
		
		//enter FN
		driver.findElement(By.tagName("input")).sendKeys("abc");
		
		//enter LN
		driver.findElement(By.tagName("input")).sendKeys("xyz");
	}
}
