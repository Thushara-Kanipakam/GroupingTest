package MavenProject.First;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login 
{
public static void main(String[] args) throws Exception
{
System.setProperty("webdriver.chrome.driver","C:\\THUSHARA\\ECLIPSEPROJECTS\\New\\src\\main\\java\\exefies\\chromedriverU.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://newtours.demoaut.com/");
driver.findElement(By.name("userName")).sendKeys("username");
driver.findElement(By.name("password:")).sendKeys("password");
driver.findElement(By.name("login")).click();
}
}



