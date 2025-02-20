package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook  {

public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
//driver.switchTo().frame(0);

WebElement createAccount = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
createAccount.click();

//driver.switchTo().frame(0);

//WebElement firstName = driver.findElement(By.id("//*[@id='u_4_b_KN']"));
//firstName.sendKeys("Abhi");
//
//WebElement surname = driver.findElement(By.xpath("//input[@name='lastname' and @id='u_4_d_ym']"));
//surname.sendKeys("Sundar");
//
////WebElement phoneNumber = driver.findElement(By.xpath("//input[@type='text' and @name= 'reg_email__']"));
////phoneNumber.

WebElement radioButton = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
radioButton.click();
driver.quit();
}
}

