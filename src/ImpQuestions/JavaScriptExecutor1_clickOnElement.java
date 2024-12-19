package ImpQuestions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1_clickOnElement 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", loginBtn);
	}
}
