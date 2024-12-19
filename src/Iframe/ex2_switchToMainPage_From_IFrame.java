package Iframe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex2_switchToMainPage_From_IFrame
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
		//switch to frame
		driver.switchTo().frame("iframeResult");        // String frameName
		
		//click on date & time btn from Iframe
		driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();	
		Thread.sleep(3000);
		
		//switch to main page from iframe
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		//click on OpenMenu link from Main Page
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	}
}
