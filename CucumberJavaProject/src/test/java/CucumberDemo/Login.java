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

public class Login {
	
	WebDriver driver;
	@Given("Am navigate to banklogin page")
	public void am_navigate_to_banklogin_page() {
      WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/V4/");
	}

	@When("Am enter valid {string} and {string} password")
	public void am_enter_valid_and_password(String string, String string2) {
		driver.findElement(By.name("uid")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	}

	@Then("Am click login button")
	public void am_click_login_button() {
		driver.findElement(By.name("btnLogin")).click();

	}

	@Then("Am goto login page")
	public void am_goto_login_page() {
		Assert.assertEquals(driver.findElement(By.xpath("//a[text()='New Customer']")).getText(),"New Customer");
		driver.close();
	}


}
