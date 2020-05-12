package RegisterPage.Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver","C:\\THUSHARA\\ECLIPSEPROJECTS\\Register\\src\\main\\java\\exefiles\\chromedriverU.exe");
    	WebDriver driver=new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.get("http://newtours.demoaut.com/mercuryregister.php");
        driver.findElement(By.name("firstName")).sendKeys("First");
        driver.findElement(By.name("lastName")).sendKeys("last");
        driver.findElement(By.name("phone")).sendKeys("9874563210");
        driver.findElement(By.id("email")).sendKeys("email");
        
        driver.findElement(By.name("address1")).sendKeys("address");
        driver.findElement(By.name("city")).sendKeys("city");
        driver.findElement(By.name("state")).sendKeys("state");
        driver.findElement(By.name("postalCode")).sendKeys("code");
        Select country=new Select(driver.findElement(By.name("country")));
        country.selectByVisibleText("ALGERIA");
        country.selectByIndex(1);
        
        driver.findElement(By.name("email")).sendKeys("email");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.name("confirmPassword")).sendKeys("confirm");
        }
}
