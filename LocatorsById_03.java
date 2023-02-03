package locators01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsById_03 {
public static void main(String[] args) {
	//instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//trigger the main URL of the application
	driver.get("https://shop-global.malaicha.com/");
	//find the login/register button in the application and click
	WebElement LoginRegisterButton = driver.findElement(By.id("my-acc-btn"));
	LoginRegisterButton.click();
}
}
