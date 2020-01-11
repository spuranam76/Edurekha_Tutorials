package module1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.safari.SafariDriver;


public class Edurekha_Tutorials1 {

WebDriver driver;


public void invokeBrowser() {

try {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\Selenium_Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com");
	Thread.sleep(5000);
	driver.findElement(By.id("u_0_f")).sendKeys("SaratKumar");
	Thread.sleep(5000);
	driver.findElement(By.name("lastname")).sendKeys("Puranam");
	driver.findElement(By.id("u_0_k")).sendKeys("saratkumar.puranam@gmail.com");
	Thread.sleep(10000);
	driver.findElement(By.id("u_0_n")).sendKeys("saratkumar.puranam@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.id("u_0_p")).sendKeys("Welcome1@");
	Select months = new Select (driver.findElement(By.id("month")));
	months.selectByIndex(12);
	Select days = new Select (driver.findElement(By.id("day")));
	days.selectByVisibleText("20");
	Select years = new Select (driver.findElement(By.id("year")));
	years.selectByVisibleText("1976");
	driver.findElement(By.id("u_0_a")).click();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
public static void main(String[] args) {

Edurekha_Tutorials1 myClass = new Edurekha_Tutorials1();
myClass.invokeBrowser();

}

}
