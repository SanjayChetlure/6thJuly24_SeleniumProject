package HandlingOfMultipleElements;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_getSizeOfAllLinksFromWebpage
{	
    public static void main(String[] args) throws IOException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      
        driver.get("https://www.facebook.com/");    
        
//	     List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
//	     int size = allLinks.size();
//	     System.out.println(size);
        
       int size = driver.findElements(By.xpath("//a")).size();
	   System.out.println(size);
	   
	  // System.out.println(driver.findElements(By.xpath("//a")).size());
	     
    }
}