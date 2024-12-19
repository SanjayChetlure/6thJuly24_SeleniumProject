package Popup;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex3_SwitchToChildWindow
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// click on NewTab link from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child Window ID
		Set<String> allIds = driver.getWindowHandles();   //[mainPageId, childWindowID]
		ArrayList<String> al=new ArrayList<>(allIds);   //[mainPageId(0), childWindowID(1)]
		String childWindowID = al.get(1);
		
		
		//switch to child window
		driver.switchTo().window(childWindowID);    // String childWindowID
		
		//click training link from child window
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	}
}
