package POM_with_DDF;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Test class
public class SwagLabInvalidLoginTest
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\6th July 2024\\6thJuly Selenium.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SwagLabLoginPage login=new SwagLabLoginPage(driver);  
		login.inpSwagLabLoginPageUsername(sh.getRow(1).getCell(0).getStringCellValue());  		
		login.inpSwagLabLoginPagePassword(sh.getRow(1).getCell(1).getStringCellValue());
		login.clickSwagLabLoginPageLoginBtn();
		Thread.sleep(1000);
		login.verifySwagLabLoginPageErrorMsg(sh.getRow(1).getCell(2).getStringCellValue());
			
		Thread.sleep(2000);
		driver.quit();	
	}
}
