package CucumberDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
 
import org.junit.Assert; 

public class BankLoginPage {
	
	static WebDriver driver;
	
	@Given("User navigate to banklogin page")
	public void user_navigate_to_banklogin_page() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/V4/");
		
		
	    
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		
		driver.findElement(By.name("uid")).sendKeys("mngr514797");
		driver.findElement(By.name("password")).sendKeys("tujudan");
	    
	}

	@Then("user click login button")
	public void user_click_login_button() {
		
		driver.findElement(By.name("btnLogin")).click();

	     
	}

	@Then("user goto login page")
	public void user_goto_login_page() {
		
		Assert.assertEquals(driver.findElement(By.xpath("//a[text()='New Customer']")).getText(),"New Customer");
		driver.close();
		System.out.println("success");
	     
	}
	
	public static  boolean isAlertBoxIsOPen()
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	

}
