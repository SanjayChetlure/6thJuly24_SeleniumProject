package ImpQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Ex1_OpenBrowserInMaxState 
{
	public static void main(String[] args) 
	{			
		ChromeOptions co=new ChromeOptions();
		co.addArguments("start-maximized");
		
		WebDriver driver=new ChromeDriver(co);		
	}
}