package HandlingOfAutosugetions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex4_SelectSpecificOptionFrom_Autosugetions
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//enter input
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("redmi");
	
		Thread.sleep(5000);
		
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul//li//div[@class='YGcVZO _2VHNef']"));
		
		for(WebElement s1:allOptions)
		{
			String actText = s1.getText();
			if(actText.contains("in Mobiles"))
			{
				actText=actText.replace("in Mobiles", "");
			}
						
			System.out.println(actText);
		}
	}
}
