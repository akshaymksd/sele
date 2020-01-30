package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;
	@Given("user must login to {string}")
	public void user_must_login_to(String url) {
	   System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	}

	@When("user enters {string} as Username")
	public void user_enters_as_Username(String uname) {
		driver.findElement(By.id("userName")).sendKeys("akshaym");
	    
	}

	@When("user enters {string} as Password")
	public void user_enters_as_Password(String string) {
		driver.findElement(By.id("password")).sendKeys("123456789");
	}
	@Then("user must login in home page")
	public void user_must_login_in_home_page() {
	    driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

}
