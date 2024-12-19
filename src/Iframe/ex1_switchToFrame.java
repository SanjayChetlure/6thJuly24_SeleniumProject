package Iframe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex1_switchToFrame
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
		//switch to frame
	//	driver.switchTo().frame("iframeResult");        // String frameName
	//	driver.switchTo().frame("iframeResult");        //String FrameID
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));    //Frame WebElement
		//driver.switchTo().frame(FrameIndex);          //int FrameIndex
		
		
		//click on date & time btn
		driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();	
	}
}
