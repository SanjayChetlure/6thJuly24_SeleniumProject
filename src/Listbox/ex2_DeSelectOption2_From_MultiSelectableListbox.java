package Listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ex2_DeSelectOption2_From_MultiSelectableListbox
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/6th%20July%202024/Selenium/html%20files/Sample4_Listbox.html");
				
		Thread.sleep(2000);
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='abc123']"));
		
		Select s=new Select(selectCountry);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		
		s.deselectAll();	
	}
}