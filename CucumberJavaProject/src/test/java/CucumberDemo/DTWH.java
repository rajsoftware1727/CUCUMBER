package CucumberDemo;

import java.time.Duration;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DTWH {
	
	WebDriver driver;
	
	@Given("Raj goto Home page")
	public void raj_goto_home_page() {
		
WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/V4/");
	     
	}

	@When("Raj enter valid uname and valid pwd")
	public void raj_enter_valid_uname_and_valid_pwd(DataTable dataTable) {
		
		Map<String,String> data=dataTable.asMap();
		String uname=data.get("username");
		String pwd=data.get("password");
		
		
		driver.findElement(By.name("uid")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
	     
	}

	@Then("Raj enter login button")
	public void raj_enter_login_button() {
		
		driver.findElement(By.name("btnLogin")).click();

	     
	}

	@Then("Raj goto login page")
	public void raj_goto_login_page() {
		
		Assert.assertEquals(driver.findElement(By.xpath("//a[text()='New Customer']")).getText(),"New Customer");
		driver.close();
	     
	}


}
