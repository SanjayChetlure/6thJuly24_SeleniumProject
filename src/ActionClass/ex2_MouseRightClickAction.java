package ActionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ex2_MouseRightClickAction
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
//		act.contextClick().perform();
		
//		act.moveToElement(electronicsLink).contextClick().perform();
		
		act.contextClick(electronicsLink).perform();
	}
}
