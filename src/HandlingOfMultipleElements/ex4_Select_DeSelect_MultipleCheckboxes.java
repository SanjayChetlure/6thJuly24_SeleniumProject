package HandlingOfMultipleElements;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_Select_DeSelect_MultipleCheckboxes
{	
    public static void main(String[] args) throws IOException, InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      
        driver.get("file:///D:/6th%20July%202024/Selenium/html%20files/MultipleCheckboxes.html");    
 
      List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
      
      for(WebElement s1:allCheckboxes)
      {
    	  s1.click();
    	  Thread.sleep(1000);
      }
      
      for(int i=allCheckboxes.size()-1; i>=0; i--)
      {
    	  allCheckboxes.get(i).click();
    	  Thread.sleep(1000);
      }
    }
}