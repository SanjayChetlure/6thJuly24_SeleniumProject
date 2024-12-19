package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex11_PartialLinkText
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/6th%20July%202024/Selenium/html%20files/LinkText_PartialLinkText.html");
		
		Thread.sleep(3000);
	
		//click on facebook link
		driver.findElement(By.partialLinkText("face")).click();
	}
}
