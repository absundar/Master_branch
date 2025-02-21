package seleniumDriverLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceDemo {
WebDriver driver = new ChromeDriver();
@Test
public void ABrowserLaunch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
	driver.get("https://www.saucedemo.com/");
	System.out.println("Url launched successfully");
	driver.manage().window().maximize();
}
@Test
public void Blogin() throws InterruptedException {
	Thread.sleep(3000);
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	username.click();
	username.sendKeys("standard_user");
	Thread.sleep(3000);
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.click();
	password.sendKeys("secret_sauce");
	Thread.sleep(3000);
	WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
	System.out.println("Logged in successfully");
}
@Test
public void close() {
	driver.close();
	System.out.println("Browser closed successfully");
}
}
