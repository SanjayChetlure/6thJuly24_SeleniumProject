package ImpQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor2_EnterValueInTextField
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement UN = driver.findElement(By.xpath("//input[@name='email']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].value='abc'", UN);
	}
}
