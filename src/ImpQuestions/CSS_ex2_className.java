package ImpQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_ex2_className
{
	//2: Locate Using className:-   (tag.className) or (.className) or (tag.c1.c2.c3) or (.c1.c2.c3)  or (tag#ID.c1.c2.c3) 
	
	public static void main(String[] args) 
	{		
		ChromeDriver driver=new ChromeDriver();				
		driver.get("https://www.facebook.com/");
		
		//enter UN
		driver.findElement(By.cssSelector("input#email")).sendKeys("abcd");
		
		//enter PWD
		driver.findElement(By.cssSelector("*#pass")).sendKeys("xyz");		
	}
}
