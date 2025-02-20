package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefnWithData {
	WebDriver driver;

	@Given("^user is on login page of HRM$")
	public void user_is_on_login_page_of_hrm() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^the user enters the valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_the_valid_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@And("^the user clicks on login button$")
	public void the_user_clicks_on_login_button() {
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();

	}
	@Then("^the user should be navigated to home page$")
	public void the_user_should_be_navigated_to_home_page() {
		boolean dashboard=	driver.findElement(By.xpath("//h6[contains(text(),'Dashboard')]")).isDisplayed();
		if(dashboard) {
			System.out.println("We have logged in successfully");
		}
			driver.close();
		}
	}

