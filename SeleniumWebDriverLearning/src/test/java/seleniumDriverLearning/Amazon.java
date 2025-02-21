package seleniumDriverLearning;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Amazon {
	WebDriver driver = new ChromeDriver();
//@Test(groups = {"Group A"})
	@BeforeMethod
	//@Test
	public void setup() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\chromedriver.exe");
driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5km84u9k2k_e&adgrpid=155259813113&hvpone=&hvptwo=&hvadid=674842289479&hvpos=&hvnetw=g&hvrand=12889245026600928314&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9183535&hvtargid=kwd-304880464215&hydadcr=14450_2316420&gad_source=1");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	@Test(priority = 1)
	public void login() throws InterruptedException  {
	WebElement hello = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	hello.click();
	WebElement ph= driver.findElement(By.xpath("//input[@name='email']"));
	ph.sendKeys("6380058706");
	WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
	continueButton.click();
	WebElement password = driver.findElement(By.id("ap_password"));
	password.sendKeys("pillayaR27?");
	WebElement signinButton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	signinButton.click();
	Thread.sleep(3000);
System.out.println("logged in successfully");
	}
	@Test(priority = 2, dependsOnMethods = "login")
	public void search() throws InterruptedException, IOException {
		Thread.sleep(3000);
	WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchBox.sendKeys("tv stand");
	WebElement find = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	find.click();
	Thread.sleep(3000);
	WebElement sortBy= driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']"));
	sortBy.click();
	WebElement lowHigh = driver.findElement(By.xpath("//a[@id='s-result-sort-select_1']"));
	lowHigh.click();
	System.out.println("Sorted by low to high");
	Thread.sleep(3000);
	List<WebElement> count = driver.findElements(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']"));
	int size = count.size();
	System.out.println("The counts are :" + size);
	}
	@Test(priority = 3, dependsOnMethods = "search")
	public void getScreenshot() throws IOException {
Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
ImageIO.write(screenshot.getImage(), "PNG", new File("C:\\Users\\abhin\\Downloads\\amazonss.png"));
System.out.println("Page is scrolled");
	}
	@Test(priority = 4, dependsOnMethods = "getScreenshot")
	public void WebsiteClose() {
driver.close();
	}

}
