package skeleton;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demowebshop {
	
	WebDriver driver;
	public demowebshop() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Given("The URL of the demo web shop is {string}")
	public void the_URL_of_the_demo_web_shop_is(String url) {
		 driver.get(url);
		 PageFactory.initElements(driver,demowebshoplogin.class);
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String username) {
	   demowebshoplogin.email.sendKeys(username);
	}

	@When("user enter {string} as password")
	public void user_enter_as_password(String password) {
	    demowebshoplogin.password.sendKeys(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    demowebshoplogin.login.click();
	}

	@Then("user is a valid page")
	public void user_is_a_valid_page() {
	    Assert.assertTrue(demowebshoplogin.logout.isDisplayed());
	    demowebshoplogin.logout.click();
	    
	}

}
