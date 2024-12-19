package WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_getTitle1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=cbWFebHwZCI");
			
	
//		String title = driver.getTitle();
//		System.out.println(title);
		
		System.out.println(driver.getTitle());		
	}
}
