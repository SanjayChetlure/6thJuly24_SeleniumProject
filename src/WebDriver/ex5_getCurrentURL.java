package WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_getCurrentURL
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=cbWFebHwZCI");
			
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
}
