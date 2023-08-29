package CucumberDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHookDemo {
	
	@Given("print one")
	public void print_one() {
		
		System.out.println("print one");
	    
	}

	@When("print two")
	public void print_two() {
		
		System.out.println("print two");
	     
	}

	@Then("print three")
	public void print_three() {
		
		System.out.println("print three");
	     
	}

	@Then("print four")
	public void print_four() {
		
		System.out.println("print four");
	     
	}

	@Given("print hundred")
	public void print_hundred() {
		
		System.out.println("print hundred");
	     
	}

	@When("print hundred one")
	public void print_hundred_one() {
		
		System.out.println("print hundred one");
	     
	}

	@Then("print hundred two")
	public void print_hundred_two() {
		
		System.out.println("print hundred two");

	    
	}

	@Then("print hundred three")
	public void print_hundred_three() {
		
		System.out.println("print hundred three");

	     
	}

}
