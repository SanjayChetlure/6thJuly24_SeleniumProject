package Popup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex1_HiddenDivisionPopup 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mobikwik.com/");
		
		Thread.sleep(2000);
		
		//click on login btn from main page
		driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click();
		
		Thread.sleep(2000);
		
		//enter mob no in hidden division popup
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9999999999");	
	}
}
