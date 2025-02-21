package seleniumDriverLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InternetHookupPartTwo {
	WebDriver driver = new ChromeDriver();
	@Test
	public void Ainternet() throws InterruptedException {
		Thread.sleep(3000);
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\chromedriver.exe");
		driver.get("https://the-internet.herokuapp.com/");
Thread.sleep(3000);
driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("//a[@href='/dropdown']"));
		dropdown.click();
		Thread.sleep(3000);
		WebElement option = driver.findElement(By.xpath("//select[@id='dropdown']"));
		option.click();
		Thread.sleep(3000);
		WebElement selectOption = driver.findElement(By.xpath("//option[@value='2']"));
		Thread.sleep(3000);
		selectOption.click();
		System.out.println("Element is successfully selected");
		Thread.sleep(3000);
		driver.navigate().back();
	}
	@Test
	public void Balert() throws InterruptedException {
		Thread.sleep(3000);
	Actions action = new Actions(driver);
		WebElement jsAlert = driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]"));
		//action.scrollToElement(jsAlert);
		action.moveToElement(jsAlert);
		jsAlert.click();
		Thread.sleep(3000);
		WebElement cjsAlert= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		cjsAlert.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("Print the result:" + result);
	
		Thread.sleep(3000);

		WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		jsConfirm.click();
		Thread.sleep(3000);
		alert.dismiss();
		String resultTest = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("Print the result:" + resultTest);
		Thread.sleep(3000);
		WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		jsPrompt.click();
		//jsPrompt.sendKeys("test");
		alert.accept();
		String resultPrompt = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("The result is: " + resultPrompt);
	}
	@Test
		public void close() {
		driver.close();
	}
}
	
