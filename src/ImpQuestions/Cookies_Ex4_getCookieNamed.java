package ImpQuestions;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Ex4_getCookieNamed
{
	public static void main(String[] args) 
	{		
		ChromeDriver driver=new ChromeDriver();				
		driver.get("https://tutorialsninja.com/demo/");
		
		Cookie s1 = driver.manage().getCookieNamed("currency");
		System.out.println(s1);
		
		driver.quit();		
	}
}
