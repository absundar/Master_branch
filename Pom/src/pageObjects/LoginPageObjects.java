package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}
	public static WebElement loginBtn(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
	}
}
