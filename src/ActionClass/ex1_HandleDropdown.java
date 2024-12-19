package ActionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ex1_HandleDropdown 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//step1: 
		WebElement element = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		
		//step2:
		Actions act=new Actions(driver);
		
		//step3:
		act.moveToElement(element).perform();
		
		Thread.sleep(3000);
		
		//click on orders link
		driver.findElement(By.xpath("(//li[@class='AT0fUR'])[2]")).click();
	}
}
