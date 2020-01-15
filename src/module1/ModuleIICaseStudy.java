
package module1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModuleIICaseStudy {

WebDriver driver;

public void invokeBrowser() {
	try {
		//Setting the Chrome Driver path in the local machine
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\Selenium_Drivers\\chromedriver.exe");
		//Initializing the Chrome Browser
		driver = new ChromeDriver();
		// Opening the website  https://www.edureka.co"
		driver.get("https://www.edureka.co");
		//Maximizing the browser window
		driver.manage().window().maximize();
		Thread.sleep(3000);//Used to load the contents of the web page
		
		
		driver.findElement(By.id("search-inp-overlay-new")).sendKeys("Search for a Course");
		driver.findElement(By.name("user_v1[query]")).sendKeys("Search for a Course");
		driver.findElement(By.xpath("//*[@id=\"search-inp3\"]")).sendKeys("Search for a Course");
		driver.findElement(By.className("search_inp")).sendKeys("Search for a Course");
		driver.findElement(By.cssSelector("#search-inp3")).sendKeys("Search for a Course");
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.partialLinkText("og I")).click();
		driver.findElement(By.xpath("//*[@id=\"search-inp3\"]")).getAttribute("attr_name");
		List<WebElement> List = driver.findElements(By.tagName("Div"));
		System.out.println(List.size());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void main(String[] args) {

	ModuleIICaseStudy myClass = new ModuleIICaseStudy();
    myClass.invokeBrowser();

}

}
