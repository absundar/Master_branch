package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenGoogle {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://practice.expandtesting.com/");
driver.manage().window().maximize();

//Add/Remove elements
WebElement firstActivity= driver.findElement(By.xpath("//*[contains(text(),'Add/Remove Elements')]"));
firstActivity.click();
driver.findElement(By.xpath("//*[@class='btn btn-primary mt-3']")).click();
driver.findElement(By.xpath("//*[@class='added-manually btn btn-info']")).click();
WebElement Home=driver.findElement(By.xpath("//*[contains(text(),'Home')]"));
Home.click();
//driver.close();

//Notification Message
driver.findElement(By.xpath("//*[contains(text(),'Notification Message')]")).click();
driver.findElement(By.xpath("//*[contains(text(),'Click here')]")).click();
driver.findElement(By.xpath("//*[contains(text(),'Home')]")).click();

//Dynamic table
driver.findElement(By.xpath("//*[contains(text(),'Dynamic Table')]")).click();
driver.findElement(By.xpath("//*[contains(text(),'Home')]")).click();

//My Browser information
driver.findElement(By.xpath("//*[contains(text(),'My Browser Information')]")).click();
driver.findElement(By.xpath("//*[@id='browser-toggle']")).click();
driver.findElement(By.xpath("//*[contains(text(),'Home')]")).click();

//radio buttons
driver.findElement(By.xpath("(//*[contains(text(),'Radio Buttons')])[1]")).click();
driver.findElement(By.xpath("//*[contains(text(),'Yellow')]")).click();
driver.findElement(By.xpath("//*[@id='football']")).click();
//driver.wait(5);

//drag and drop
driver.findElement(By.xpath("//*[contains(text(),'Home')]")).click();
driver.findElement(By.xpath("(//*[contains(text(),'Drag and Drop')])[1]")).click();
Actions actions =new Actions(driver);
WebElement from= driver.findElement(By.xpath("//*[@id='column-a']"));
WebElement to= driver.findElement(By.xpath("//*[@id='column-b']"));
actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
//actions.dragAndDrop(from, to).build().perform();
//Collections.
//FileUtils.
//drag and drop circles
driver.findElement(By.xpath("//*[contains(text(),'Home')]")).click();
driver.findElement(By.xpath("(//*[contains(text(),'Drag and Drop Circles')])[1]")).click();
WebElement fromRed= driver.findElement(By.xpath("//*[contains(text(),'red')]"));
WebElement fromGreen= driver.findElement(By.xpath("//*[contains(text(),'green')]"));
WebElement fromBlue= driver.findElement(By.xpath("//*[contains(text(),'blue')]"));
WebElement toElement= driver.findElement(By.xpath("//*[@id='target']"));
actions.clickAndHold(fromRed).moveToElement(toElement).release(toElement).build().perform();
actions.clickAndHold(fromGreen).moveToElement(toElement).release(toElement).build().perform();
actions.clickAndHold(fromBlue).moveToElement(toElement).release(toElement).build().perform();
driver.findElement(By.xpath("//*[contains(text(),'Home')]")).click();
driver.close();
}

	}


