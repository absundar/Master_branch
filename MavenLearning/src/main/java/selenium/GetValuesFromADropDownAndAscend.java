package selenium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetValuesFromADropDownAndAscend {
public static void main(String args[]) throws IOException {
WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?entry_point=login");
driver.manage().window().maximize();
	Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
List<WebElement>	options = dropdown.getOptions();
List<String>values= new ArrayList<String>();
for(WebElement option : options) {
	values.add(option.getText());
}
Collections.sort(values);
System.out.println(values);
	

}
}
