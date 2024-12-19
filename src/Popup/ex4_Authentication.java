package Popup;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_Authentication
{	
    public static void main(String[] args) throws IOException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("https://the-internet.herokuapp.com/basic_auth");
    
        //https://username:password@remaingURL
        
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");       
    }
}