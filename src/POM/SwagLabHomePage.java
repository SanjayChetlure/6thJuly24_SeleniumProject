package POM;
import org.openqa.selenium.WebDriver;
//POM class 2
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SwagLabHomePage 
{
	//step1: declaration
	@FindBy(xpath = "//div[@class='app_logo']")  private WebElement logo;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement openMenu;
	
	
	//step2: initialization
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3:
	public void verifySwagLabHomePageLogo() 
	{
		String actLogoText = logo.getText();
		String expLogoText="Swag Labs";
		if (actLogoText.equals(expLogoText))
		{
			System.out.println("Pass");
		} 
		else 
		{
			System.out.println("Fail");
		}
	}
	
	public void clickSwagLabHomePageOpenMenu() 
	{
		openMenu.click();
	}

}
