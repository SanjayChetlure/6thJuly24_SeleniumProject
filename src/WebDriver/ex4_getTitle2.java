package WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_getTitle2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=cbWFebHwZCI");
			
	
		String actTitle = driver.getTitle();
		String expTitle ="Reverse String Java Program | Hindi | AutomationBySanjay - YouTube";
		
		if (actTitle.equals(expTitle)) 
		{
			System.out.println("Pass:- Navigate to correct webpage");
		} 
		else 
		{
			System.out.println("Fail:- Navigate to wrong webpage");
		}		
	}
}
