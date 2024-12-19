package ImpQuestions;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Ex3_deleteCookieNamed
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();				
		driver.get("https://tutorialsninja.com/demo/");
		
		System.out.println("-----Before delete any Coockie------");
		Set<Cookie> allCookies = driver.manage().getCookies();
		for(Cookie s1: allCookies)
		{
			System.out.println(s1);
		}
				
		//delete specific Cookie
		driver.manage().deleteCookieNamed("currency");
		
		System.out.println("------After deleting specific coockie-----");
		Set<Cookie> allCookies1 = driver.manage().getCookies();
		for(Cookie s1: allCookies1)
		{
			System.out.println(s1);
		}
		
		driver.quit();
	  }
}
