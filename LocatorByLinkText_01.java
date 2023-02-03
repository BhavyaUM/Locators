package locators01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByLinkText_01 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement ForgottenPwdTextField = driver.findElement(By.linkText("Forgotten password?"));
	ForgottenPwdTextField.click();
	
}
}
