package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleDefinitions {
	WebDriver driver = new ChromeDriver();
	@Given("user is entering google.co.in")
	public void user_is_entering_google_co_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("https://www.google.co.in");
	}

	@When("user is typing the search term {string}")
	public void user_is_typing_the_search_term(String searchTerm) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("q")).sendKeys(searchTerm);
	}

	@When("enters the return key")
	public void enters_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("the user should see the search results")
	public void the_user_should_see_the_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		boolean status = driver.findElement(By.partialLinkText("Ragav")).isDisplayed();
		if(status)
		System.out.println("Result displayed");
		driver.close();
	}
	}


