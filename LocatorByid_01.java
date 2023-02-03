package locators01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByid_01 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		//find the user name text field and enter the data
		WebElement usernameTextfield = driver.findElement(By.id("username"));
		Thread.sleep(5000);
		usernameTextfield.sendKeys("admin");
		Thread.sleep(5000); 
		//find the password text field and enter the data
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		Thread.sleep(5000);
		passwordTextField.sendKeys("manager");
		Thread.sleep(5000);
		//find the login button and click to check the address
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		Thread.sleep(5000);
		loginButton.click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
		
	}
	}
