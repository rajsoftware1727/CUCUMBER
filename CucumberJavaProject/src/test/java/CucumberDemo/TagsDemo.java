package CucumberDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TagsDemo {
	
	@Given("goto home page")
	public void goto_home_page() {
		
		System.out.println("goto home page");
	     
	}

	@Then("print something")
	public void print_something() {
		
		System.out.println("this is rajesh");
	     
	}

	@Given("goto1 home1 page1")
	public void goto1_home1_page1() {
		
		System.out.println("goto home page1");

		
	    
	}

	@Then("print1 something1")
	public void print1_something1() {
		
		System.out.println("this is akila");

	     
	}

	@Given("goto2 home2 page2")
	public void goto2_home2_page2() {
		
		System.out.println("goto home page2");

	    
	}

	@Then("print2 something2")
	public void print2_something2() {
		
		System.out.println("this is nishavu");

	     
	}

}
