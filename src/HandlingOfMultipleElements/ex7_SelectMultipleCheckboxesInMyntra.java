package HandlingOfMultipleElements;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex7_SelectMultipleCheckboxesInMyntra
{	
    public static void main(String[] args) throws IOException, InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      
        driver.get("https://www.myntra.com/dresses?f=Gender%3Amen%20women%2Cwomen");
        Thread.sleep(5000);
        
	     List<WebElement> allLinks = driver.findElements(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']/input"));
	     
	     for(WebElement s1:allLinks)
	     {
	    	 s1.click();
	    	 Thread.sleep(1000);
	     }
    }
}