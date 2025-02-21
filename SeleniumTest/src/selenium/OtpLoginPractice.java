package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtpLoginPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://practice.expandtesting.com/otp-login");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("practice@expandtesting.com");
	}
	
//public static void otpLogin() {
//
//}
}
