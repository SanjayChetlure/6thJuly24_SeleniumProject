package ImpQuestions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Ex4_DisableNotification
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		op.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://useinsider.com/");			
	}
}