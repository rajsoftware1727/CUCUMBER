package CucumberDemo;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleDemo {
	
	WebDriver driver;
	
	@Given("I navigate to banklogin page")
	public void i_navigate_to_banklogin_page() {
      WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/V4/");
	}

	@When("I enter valid {string} and valid {string}")
	public void i_enter_valid_and_valid(String uname, String pwd) {
		driver.findElement(By.name("uid")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@Then("I click login button")
	public void i_click_login_button() {
		driver.findElement(By.name("btnLogin")).click();

	}

	@Then("I goto login page")
	public void i_goto_login_page() {
		
		driver.switchTo().alert().accept();
 		driver.close();
	}

}
