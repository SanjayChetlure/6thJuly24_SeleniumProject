package HandlingOfCustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex1_SelectOption
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//step1
		WebElement element = driver.findElement(By.xpath("//div[text()='Select Option']"));
		
		//step2
		Actions act=new Actions(driver);
		
		//step3:
		act.click(element).perform();
		
		Thread.sleep(2000);
		
		//step4: 
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ENTER).perform();
		
	}
}
