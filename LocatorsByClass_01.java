package locators01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByClass_01 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//instantiate the browser specific application
	//maximize - pre condition
	driver.manage().window().maximize();
	//trriger the main URL of the application
	driver.get("https://www.actitime.com/");
	//find the Get Started button in application
	WebElement GetStartedButton = driver.findElement(By.className("home-page__button home-page__button--start-trial button"));
	GetStartedButton.click();
	//minimize - post condition and terminate the application
	driver.manage().window().minimize();
	driver.quit();
}
}
