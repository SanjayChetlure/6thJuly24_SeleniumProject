package HandlingOfDynamicElements;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex2_getReviewsFromFlipkartApp 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//search mobile
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("redmi 13c 5g");
	
		//click on search icon
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		String review = driver.findElement(By.xpath("((//div[@class='tUxRFH'])[1]//span)[8]")).getText();
		System.out.println(review);
	}
}
