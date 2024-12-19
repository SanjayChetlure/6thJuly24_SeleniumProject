package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//POM class 1
import org.openqa.selenium.WebElement;
public class SwagLabLoginPage1 
{
	//Step1: declaration
	private WebElement UN;  			
	private WebElement PWD;				
	private WebElement loginBtn;    

	
	//step2: initialization
	public SwagLabLoginPage1(WebDriver driver)
	{
		UN=driver.findElement(By.xpath("//input[@name='user-name']"));
		PWD=driver.findElement(By.xpath("//input[@id='password']"));
		loginBtn= driver.findElement(By.xpath("//input[@name='login-button']"));
	}
	
	//step3: usage
	public void enterUsername() 
	{
		UN.sendKeys("standard_user");             //late initialization
	}
	
	public void enterPassword() 
	{
		PWD.sendKeys("secret_sauce");
	}
	
	public void clickOnLogin()
	{
		loginBtn.click();
	}
}
