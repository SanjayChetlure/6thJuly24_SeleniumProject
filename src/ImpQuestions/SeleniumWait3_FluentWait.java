package ImpQuestions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class SeleniumWait3_FluentWait 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		FluentWait wait = new FluentWait(driver);
		
		//Specify the timout of the wait
		wait.withTimeout(Duration.ofSeconds(5));
		
		//Sepcify polling time
		wait.pollingEvery(Duration.ofSeconds(1/2));
		
		//Specify what exceptions to ignore
		wait.ignoring(NoSuchElementException.class);

		//This is how we specify the condition to wait on.
		wait.until(ExpectedConditions.alertIsPresent());

		
		
	}

}
