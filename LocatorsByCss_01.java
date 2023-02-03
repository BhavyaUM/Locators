package locators01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByCss_01 {
public static void main(String[] args) throws InterruptedException {
	//instantiate the browser specific class
	WebDriver driver= new ChromeDriver();
	//maximize the window pre condition
	//triger the main url of the application
	driver.manage().window().maximize();
	driver.get("https://shop-global.malaicha.com/login");
	//find the sign in button in the application
	WebElement SigninButton = driver.findElement(By.cssSelector("button[type='submit']"));
	SigninButton.click();
	Thread.sleep(5000);
	//minimize pre condtion
	driver.manage().window().minimize();
	//terminate the window as well as API
	driver.quit();
}
}
