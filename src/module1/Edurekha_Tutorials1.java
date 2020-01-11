package module1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
driver.findElement(By.id("email")).sendKeys("saratkumar.puranam");
Thread.sleep(5000);
driver.findElement(By.id("pass")).sendKeys("Oracle9i@");
Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}


/*public void SearchLogin() {


//driver.findElement(By.id("email")).click();
driver.findElement(By.id("u_0_f")).sendKeys("saratkumar.puranam");
}
*/

public static void main(String[] args) {

	Edurekha_Tutorials1 myClass = new Edurekha_Tutorials1();
myClass.invokeBrowser();

}

}
