package HandlingOfCustomizedListbox;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex3_SelectJunOption_usingHomeKey
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Actions act=new Actions(driver);
		
		act.click(month).perform();
		Thread.sleep(2000);
		
		//Jump to 1st option using Home Key
		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(1000);
	
		//navigate to june Option
		for(int i=1; i<=5; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		Thread.sleep(2000);
				
		//select option using enter key
		act.sendKeys(Keys.ENTER).perform();
	}
}
