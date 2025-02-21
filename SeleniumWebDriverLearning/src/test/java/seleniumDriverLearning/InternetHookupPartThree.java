package seleniumDriverLearning;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InternetHookupPartThree {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement infiniteScroll = driver.findElement(By.xpath("//a[@href='/infinite_scroll']"));
		infiniteScroll.click();
		Actions action = new Actions(driver);
		WebElement scroll = driver.findElement(By.xpath("//div[@class='scroll large-8 columns large-centered']"));
//	action.moveToElement(scroll).perform();
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	/*	WebElement shadowDom = driver.findElement(By.xpath("//a[@href='/shadowdom']"));
		shadowDom.click();
		String firstText = driver.findElement(By.xpath("//span[@slot='my-text']")).getText();
				System.out.println("the text is:" + firstText);
				
				driver.navigate().back();
			
				WebElement fileDownload = driver.findElement(By.xpath("//a[@href='/download']"));
				fileDownload.click();
				WebElement firstFile = driver.findElement(By.xpath("//a[@href='download/123abc.txt']"));
				firstFile.click();
				String fileDownloadPath = "C:\\Users\\abhin\\Downloads";
				String fileName = "123abc.txt";
				if(isFileDownload(fileDownloadPath, fileName)) {
					System.out.println("File downloaded successfully");
				}
				else {
					System.out.println("File not found");
				}
//			driver.navigate().back();
//				WebElement fileUpload = driver.findElement(By.xpath("//a[@href='/upload']"));
//				fileUpload.click();
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				WebElement up= driver.findElement(By.xpath("//input[@id='file-upload']"));
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				up.sendKeys("C:\\Users\\abhin\\OneDrive\\Documents\\Home.xlsx");
//				System.out.println("File uploaded successfully");
//				
	}

	private static boolean isFileDownload(String fileDownloadPath, String fileName) {
		File dir= new File(fileDownloadPath);
		File[] dirContents = dir.listFiles();
		for(File file: dirContents) {
			if(file.getName().equals(fileName)) {
				return true;
			}
			}
		return false;
		}*/
	}

}
