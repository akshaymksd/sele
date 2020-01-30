package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	
	WebDriver driver;
	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.linkText("SignIn")).click();;
	}

	@When("user enters valid credential and perform login")
	public void user_enters_valid_credential_and_perform_login() {
	    driver.findElement(By.id("userName")).sendKeys("akshaym");
	    driver.findElement(By.id("password")).sendKeys("123456789");
	    driver.findElement(By.xpath("//input[@name='Login']")).click();
	    Assert.assertEquals("Home",driver.getTitle());
	}

	@When("clicks the search button and type the first four letters")
	public void clicks_the_search_button_and_type_the_first_four_letters() {
	    driver.findElement(By.id("myInput")).sendKeys("Head");
	}

	@When("select on the produc from the drop down")
	public void select_on_the_produc_from_the_drop_down() {
	    driver.findElement(By.xpath("//div[contains(text(),'Headphone')]")).click();
	}

	@When("clicks on the find details")
	public void clicks_on_the_find_details() {
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/input[1]")).click();
	    
	}

	@When("adds the product to cart")
	public void adds_the_product_to_cart() {
	    driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/center[1]/a[1]")).click();
	}

	@Then("user should be in add to cart page")
	public void user_should_be_in_add_to_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
