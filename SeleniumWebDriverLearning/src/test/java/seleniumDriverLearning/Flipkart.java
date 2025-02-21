package seleniumDriverLearning;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Flipkart {
	WebDriver driver = new ChromeDriver();
	@BeforeSuite()
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\chromedriver.exe");
	}
	@BeforeTest
	public void launch() {
	driver.get("https://www.flipkart.com/");
	System.out.println("Url is launched successfully");
	driver.manage().window().maximize();
	System.out.println("Screen is maximized");
}
	@BeforeClass
	//@Test(timeOut = 1)
	//@Test(priority = 4)
	public void search() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		searchBox.click();
		searchBox.sendKeys("shoe rack");
		WebElement searchIcon = driver.findElement(By.xpath("//button[@class='_2iLD__']"));
		searchIcon.click();
		System.out.println("Search is entered");
	}
	@BeforeMethod
//	@Test(timeOut = 1)
	//@Test(priority = 3)
	public void filters() {
		WebElement lowtohigh = driver.findElement(By.xpath("//div[contains(text(),'Price -- Low to High')]"));
		lowtohigh.click();
		System.out.println("P1 Sorted by low to high");
	}
	//@Test(groups = {"SmokeTest"})
	@Test
	//@Test(priority = 2)
	public void getCount() {
		List<WebElement> count = driver.findElements(By.xpath("//a[@class='VJA3rP']"));
	int size=	count.size();
	System.out.println("P2 The count is :" + size);
	}
	@AfterMethod
	//@Test(priority =1)
	public void priceRange() throws InterruptedException {
		WebElement minClick = driver.findElement(By.xpath("//div[@class='suthUA']"));
		minClick.click();
		WebElement minValue = driver.findElement(By.xpath("//option[@value='300']"));
		minValue.click();
		Thread.sleep(3000);
		WebElement maxValue = driver.findElement(By.xpath("//option[@value='1000']"));
		maxValue.click();
		System.out.println("Price range is selected");
	}
	@AfterClass
	//@Test(priority = 5)
	public void discountsAndRatings() throws InterruptedException {
		//Actions action = new Actions(driver);
		Thread.sleep(3000);
		WebElement discountOption = driver.findElement(By.xpath("//div[contains(text(),'Discount')]"));
		//action.moveToElement(discountOption);
		Thread.sleep(3000);
		discountOption.click();
		WebElement off = driver.findElement(By.xpath("//div[@class='XqNaEv']"));
		off.click();
		System.out.println("50% discount is applied");
		Thread.sleep(3000);
		WebElement customRatings = driver.findElement(By.xpath("//div[contains(text(),'Customer Ratings')]"));
		Thread.sleep(3000);
		WebElement star = driver.findElement(By.xpath("//div[contains(text(),'4★ & above')]"));
		star.click();
		System.out.println("4* is selected");
	}
	@AfterTest
	public void TVUnitsAndWadrobe() throws InterruptedException {
		Thread.sleep(3000);
		WebElement homeFurni = driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(homeFurni);
		homeFurni.click();
		Thread.sleep(3000);
		WebElement TVUnits = driver.findElement(By.xpath("//a[@title='TV Units']"));
		actions.moveToElement(TVUnits);
		TVUnits.click();
		System.out.println("TV Units is selected");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(homeFurni);
		homeFurni.click();
		Thread.sleep(3000);
		WebElement wadrobe = driver.findElement(By.xpath("//a[@title='Wardrobes']"));
		wadrobe.click();
		System.out.println("Wadrobe is selected");
	}
	@AfterSuite
	public void getScreenshotAndClose() throws IOException {
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "PNG", new File("C:\\Users\\abhin\\Downloads\\flipkartss.png"));
		System.out.println("Screenshot is captured");
		driver.close();
		System.out.println("Browser is closed");
	}
}
