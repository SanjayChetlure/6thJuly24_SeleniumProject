package HandlingOfAutosugetions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex3_SelectSpecificOptionFrom_Autosugetions
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//enter input
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("redmi");
	
		Thread.sleep(1000);
		
		String expText="redmi 13c";
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li//div[@class='YGcVZO _2VHNef']"));
		
		for(WebElement s1:allOptions)
		{
			String actText = s1.getText();
			System.out.println(actText);
		}
	}
}
