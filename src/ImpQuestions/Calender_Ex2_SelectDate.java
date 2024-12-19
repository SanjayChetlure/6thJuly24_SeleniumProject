package ImpQuestions;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Ex2_SelectDate
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
		while (driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().contains("December")==false) 
		{
			Thread.sleep(1000);
			//click on next btn
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
			Thread.sleep(1000);
		}
		
		Thread.sleep(1000);

		//step3: select expected date
		List<WebElement> alldates = driver.findElements(By.xpath("//table//tr/td//a[@class='ui-state-default' or @class='ui-state-default ui-state-highlight']"));
		System.out.println(alldates.size());
		
		
		String date1 = LocalDate.now().toString();    //2024-12-13
		date1=date1.substring(8);    //13
		System.out.println(date1);
		
		for (WebElement date : alldates) 
		{
			if (date.getText().equals("13")) 
			{
				date.click();
				break;
			}
		}		
	}
}
