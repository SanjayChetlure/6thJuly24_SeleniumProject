package ImpQuestions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Color1_background
{
	public static void main(String[] args) throws InterruptedException 
	{
		String BlueClrHexValue="#0866ff";
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//button[@name='login']"));
		
		String clr =ele.getCssValue("background-color");
		System.out.println(clr);
		
		String hexClr = Color.fromString(clr).asHex();
		System.out.println(hexClr);
		
		if (BlueClrHexValue.equals(hexClr)) 
		{
			System.out.println("Blue color");
		}
		else
		{
			System.out.println("Other color");
		}
		
		//use colour checker website	
	}
}
