package locators01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsById_02 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	//instantiate the browser specific application
	//maximixe pre condition
	driver.manage().window().maximize();
	//triger the main URL of the application
	driver.get("https://demo.actitime.com/");
	//find the login button in application and click
	Thread.sleep(5000);
	WebElement LoginButton = driver.findElement(By.id("loginButton"));
	LoginButton.click();
	Thread.sleep(5000);
	//minimize post condition and terminate the application
	driver.manage().window().minimize();
	driver.quit();
}
}
