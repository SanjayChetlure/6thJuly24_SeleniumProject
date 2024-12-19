package WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex9_navigate
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.youtube.com/watch?v=cbWFebHwZCI");
		
		driver.navigate().to("https://www.youtube.com/watch?v=cbWFebHwZCI");   //Open 1st app
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");           //open 2nd app
		Thread.sleep(3000);
		driver.navigate().back();                     //jump to 1st app
		Thread.sleep(3000);
		driver.navigate().forward();  				 //jump to 2nd app
		Thread.sleep(3000);
		driver.navigate().refresh();		
	}
}
