package extentReportPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExtentReports {
	ExtentReports extentReports;
	
	@Test
	public void OpenGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://practice.expandtesting.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
	@Test
	public void OpenFacebook() {
		ExtentReports extentReports = new ExtentReports();
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		driver.quit();
}
@Test
public void OpenOrange() {
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	//driver.switchTo().frame(0);
	driver.quit();
}
}
