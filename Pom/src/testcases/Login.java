package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPageObjects;

public class Login {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//WebElement username = driver.findElement(By.name("username"));
//username.sendKeys("Admin");
//WebElement password = driver.findElement(By.name("password"));
//password.sendKeys("admin123");
//WebElement loginBtn = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
//loginBtn.click();

LoginPageObjects loginPageObjects = new LoginPageObjects();
LoginPageObjects.username(driver).sendKeys("Admin");
LoginPageObjects.password(driver).sendKeys("admin123");
LoginPageObjects.loginBtn(driver).click();
	}

}
