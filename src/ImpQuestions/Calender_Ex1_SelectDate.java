package ImpQuestions;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Ex1_SelectDate
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		//Step1: open date menu
		driver.findElement(By.cssSelector("input#datepicker")).click();

		Thread.sleep(2000);

		//Step2: navigate to expected month -> Jan
		while (driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().equals("April")==false) 
		{
			Thread.sleep(1000);
			//click on next btn
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
			Thread.sleep(1000);
		}
		
		Thread.sleep(1000);

		//step3: select expected date
		List<WebElement> alldates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));

		for (WebElement date : alldates) 
		{
			if (date.getText().equals("23")) 
			{
				date.click();
				break;
			}
		}		
	}
}
