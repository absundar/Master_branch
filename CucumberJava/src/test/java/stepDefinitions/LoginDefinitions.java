package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinitions {
WebDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws InterruptedException {
		Thread.sleep(200);
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(200);
	}

	@When("^the user enters the valid name and password$")
	public void the_user_enters_the_valid_username_and_password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
	@And("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
	}
	@Then("^the user should be able to login successfully$")
	public void the_user_should_be_able_to_login_successfully() throws Throwable {
	boolean dashboard=	driver.findElement(By.xpath("//h6[contains(text(),'Dashboard')]")).isDisplayed();
	if(dashboard) {
		System.out.println("We have logged in successfully");
	}
		driver.close();
	}



}
