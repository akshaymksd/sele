package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs {
	WebDriver driver;
	@Given("The URL of the app is {string}")
	public void the_URL_of_the_app_is(String url) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("user enters {string} as UserName")
	public void user_enters_as_UserName(String uname) {
		driver.findElement(By.id("userName")).sendKeys("akshaym12");
	}

	@When("user enters {string} as FirstName")
	public void user_enters_as_FirstName(String fname) {
		driver.findElement(By.id("firstName")).sendKeys("akshay");
	}

	@When("user enters {string} as LastName")
	public void user_enters_as_LastName(String lname) {
		driver.findElement(By.id("lastName")).sendKeys("m");
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String pwd) {
		driver.findElement(By.id("password")).sendKeys("1234567891");
	}

	@When("user enters {string} as confirmpassword")
	public void user_enters_as_confirmpassword(String cpwd) {
		driver.findElement(By.id("pass_confirmation")).sendKeys("1234567891");
	}

	@When("user selects {string} as gender")
	public void user_selects_as_gender(String gen) {
		driver.findElement(By.xpath("//input[@value='Male'and @type='radio']")).click();
	    
	}
	@When("user enters {string} as email")
	public void user_enters_as_email(String emailAddress) {
		driver.findElement(By.id("emailAddress")).sendKeys("123@gmail.com");
	}

	@When("user enters {string} as mobilenumber")
	public void user_enters_as_mobilenumber(String mobilenumber) {
		driver.findElement(By.id("mobileNumber")).sendKeys("1234567891");
	}

	@When("user enters {string} as dob")
	public void user_enters_as_dob(String dob) {
		driver.findElement(By.id("dob")).sendKeys("12/01/1996");
	}

	@When("user enters {string} as address")
	public void user_enters_as_address(String address) {
		driver.findElement(By.id("address")).sendKeys("bangalore");
	}

	@When("user enters {string} as security question")
	public void user_enters_as_security_question(String question) {
		driver.findElement(By.name("securityQuestion")).sendKeys("what is your birth place");
		
	}

	@When("user enters {string} as answer")
	public void user_enters_as_answer(String answer) {
		driver.findElement(By.name("answer")).sendKeys("ksd");
		
	}

	@When("user clicks on register page")
	public void user_clicks_on_register_page() {
	    driver.findElement(By.name("Submit")).click();
	}

	@Then("registered successfully")
	public void registered_successfully() {
	    Assert.assertTrue(driver.findElement(By.name("Registered successfully")).isDisplayed());
	}

}
