package ImpQuestions;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Ex2_getCookies
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();				
		driver.get("https://tutorialsninja.com/demo/");
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		
		System.out.println(allCookies.size());

		for(Cookie s1:allCookies)
		{
			System.out.println(s1);
		}
		
		driver.quit();		
	}
}
