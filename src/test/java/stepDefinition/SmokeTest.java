package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

WebDriver driver;

	@Given("^Open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
	   System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	   driver= new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("http://www.facebook.com");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String uname, String upass)throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.id("email")).sendKeys(uname);
	    driver.findElement(By.id("pass")).sendKeys(upass);
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
        Thread.sleep(10000);
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

	
	
	
}
