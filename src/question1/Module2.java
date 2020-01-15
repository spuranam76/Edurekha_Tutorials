package question1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;


public class Module2 {

WebDriver driver;
public void invokeBrowser() {

try {
//Initializing the ChromeDriver	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\Selenium_Drivers\\chromedriver.exe");
driver = new ChromeDriver();

//Navigating to Edureka site
driver.get("https://www.edureka.co");
//Maximizing the window
driver.manage().window().maximize();

//Finding the search box by web element id and click on it
driver.findElement(By.id("search-inp3")).click();
//On click search box is navigated to different search window
WebElement SearchBox = driver.findElement(By.id("search-inp-overlay-new"));

//Printing the attribute value of the attribute class of the search box 
String classValue = SearchBox.getAttribute("class");
System.out.println("Value of the class is :" + classValue);
//Printing the attribute value of the attribute id of the search box 
String idValue = SearchBox.getAttribute("id");
System.out.println("Value of the id is :" + idValue);

//Finding the search box by web element id and passing "Selenium Certification Training"
driver.findElement(By.id("search-inp-overlay-new")).sendKeys("Selenium Certification Training");

Thread.sleep(2000);
//Then selecting "Selenium Certification Training" from the list
driver.findElement(By.linkText ("Selenium Certification Training")).click();

//Using the linkText to find the Log In and click on it. Then the log in window need to pop up.
driver.findElement(By.linkText("Log In")).click();
/*
//Finding the search box by web element className and passing "Selenium Certification Training"
driver.findElement(By.className("new-search-inp")).sendKeys("Selenium Certification Training");
Thread.sleep(2000);
driver.findElement(By.linkText ("Selenium Certification Training")).click();

//Finding the search box by web element xpath and passing "Selenium Certification Training"
driver.findElement(By.xpath("//*[@id=\"search-inp-overlay-new\"]")).sendKeys("Selenium Certification Training");
Thread.sleep(2000);
driver.findElement(By.linkText ("Selenium Certification Training")).click();
//Finding the search box by web element cssSelector and passing "Selenium Certification Training"
driver.findElement(By.cssSelector("#search-inp-overlay-new")).sendKeys("Selenium Certification Training");
Thread.sleep(2000);
driver.findElement(By.linkText ("Selenium Certification Training")).click();
//Using the partialLinkText to find the Log In and click on it. Then the log in window need to pop up.
driver.findElement(By.partialLinkText("og I")).click();

*/
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}


public static void main(String[] args) {

Module2 myClass = new Module2();
   myClass.invokeBrowser();



}

}
