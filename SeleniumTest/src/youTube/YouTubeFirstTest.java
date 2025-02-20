package youTube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeFirstTest {

	public static void main(String[] args) throws Exception {
WebDriver driver = new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
search.sendKeys("Learn Automation Online");
search.submit();
System.out.println("The entered word is" + search.getText());
driver.wait(5000);
driver.quit();
	}

}
