package ActionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ex3_MouseLeftClickAction
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement electronicsLink = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
		
//		act.moveToElement(electronicsLink).perform();
//		act.click().perform();
		
	//	act.moveToElement(electronicsLink).click().perform();
		
		act.click(electronicsLink).perform();
	}
}
