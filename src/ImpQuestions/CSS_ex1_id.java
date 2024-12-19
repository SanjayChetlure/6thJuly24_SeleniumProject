package ImpQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_ex1_id
{
	//1: Locate Using ID:-  (tag#Id) or (*#ID)  or (#ID)
	
	public static void main(String[] args) 
	{		
		ChromeDriver driver=new ChromeDriver();				
		driver.get("https://www.facebook.com/");
		
		//enter UN
		driver.findElement(By.cssSelector("input#email")).sendKeys("abcd");
		
		//enter PWD
		driver.findElement(By.cssSelector("input#pass")).sendKeys("xyz");		
	}
}
