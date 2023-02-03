package locators01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByName_01 {
public static void main(String[] args) throws InterruptedException {
 WebDriver driver=new ChromeDriver();
 //instatiate the browser specific application
 //maximize pre condition
 driver.manage().window().maximize();
 //triger the main url of the application
 driver.get("https://demo.actitime.com/");
 //find the UserName Text field in the application and enter the data
 Thread.sleep(5000);
 WebElement UserNameTextfeild = driver.findElement(By.name("username"));
 UserNameTextfeild.sendKeys("bhavya");
 Thread.sleep(5000);
 //minimize post condition and terminate the main application or URL
 driver.manage().window().minimize();
 driver.quit();
}
}
