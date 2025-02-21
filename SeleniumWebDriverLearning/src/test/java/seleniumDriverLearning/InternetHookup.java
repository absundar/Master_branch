package seleniumDriverLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InternetHookup {
	WebDriver driver = new ChromeDriver();


@Test(description = "This is for selenium practice")
public void checkbox() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\chromedriver.exe");
	driver.get("https://the-internet.herokuapp.com/");
//WebElement	ar = driver.findElement(By.xpath("//a[@href='/add_remove_elements/']"));
//	ar.click();

//WebElement bi = driver.findElement(By.xpath("//a[contains(text(),'Broken Images')]"));
//bi.click();
//WebElement image = driver.findElement(By.xpath("//img[@src='asdf.jpg']"));
//image.

WebElement checkbox = driver.findElement(By.xpath("//a[@href='/checkboxes']"));
checkbox.click();
WebElement cb1 = driver.findElement(By.xpath("//form[@id=\"checkboxes\"]/input[1]"));
if(cb1.isSelected()) {
System.out.println("The checbox is selected");
	}
else {
	System.out.println("The checbox is not selected");
}
WebElement cb2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
if(cb2.isSelected()) {
	System.out.println("The checkbox is selected");
}
else {
	System.out.println("The checkbox is not selected");
}
	}
@Test(dependsOnMethods = {"checkbox"})
public void dragAndDrop() {

 driver.navigate().back();
 
 WebElement dd = driver.findElement(By.xpath("//a[@href='/drag_and_drop']"));
 dd.click();
 WebElement a = driver.findElement(By.id("column-a"));
 a.click();
 WebElement b = driver.findElement(By.id("column-b"));
Actions actions = new Actions(driver);
actions.dragAndDrop(a, b).perform();
System.out.println("drag and drop is performed successfully");

}
@Test(dependsOnMethods = {"checkbox","dragAndDrop"})
public void close() {
	driver.close();
}
}
