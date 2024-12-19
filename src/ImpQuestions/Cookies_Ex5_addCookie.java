package ImpQuestions;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Ex5_addCookie
{
	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();				
		driver.get("https://tutorialsninja.com/demo/");
		
		Cookie c=new Cookie("CookieName", "CookieValue");
		driver.manage().addCookie(c);
		
		driver.quit();		
	}
}
