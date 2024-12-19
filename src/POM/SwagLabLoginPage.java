package POM;
import org.openqa.selenium.WebDriver;
//POM class 1
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SwagLabLoginPage 
{
	//Step1: declaration
	@FindBy(xpath = "//input[@name='user-name']") private WebElement UN;  			 // private WebElement UN=driver.findElement(By.xpath(""));
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;				 // private WebElement PWD=driver.findElement(By.xpath(""));
	@FindBy(xpath = "//input[@name='login-button']") private WebElement loginBtn;    // private WebElement loginBtn=driver.findElement(By.xpath(""));

	
	//step2: initialization
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);   //className.methodName(WebDriverObject, this);
	}
	
	//step3: usage
	public void inpSwagLabLoginPageUsername() 
	{
		UN.sendKeys("standard_user");             //late initialization
	}
	
	public void inpSwagLabLoginPagePassword() 
	{
		PWD.sendKeys("secret_sauce");
	}
	
	public void clickSwagLabLoginPageLoginBtn()
	{
		loginBtn.click();
	}
}
