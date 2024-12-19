package HandlingOfMultipleElements;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_getSizeOfAllCheckboxes
{	
    public static void main(String[] args) throws IOException, InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      
        driver.get("file:///D:/6th%20July%202024/Selenium/html%20files/MultipleCheckboxes.html");    
 
//      List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//     int size = allCheckboxes.size();
//     System.out.println(size);
     
//     int size = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
//     System.out.println(size);
     
     System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
           
    }
}