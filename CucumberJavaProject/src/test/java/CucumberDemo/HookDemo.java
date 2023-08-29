package CucumberDemo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookDemo {
	
	 
	
	@Given("Rajesh as a test engineer")
	public void rajesh_as_a_test_engineer() {
		
		System.out.println("Rajesh as a test engineer");
	     
	}

	@When("raj joined the it company")
	public void raj_joined_the_it_company() {
		
		System.out.println("raj joined the it company");
	     
	}

	@Then("he his doing his work")
	public void he_his_doing_his_work() {
		
		System.out.println("he his doing his work");
	     
	}

	@Then("raj get promotion")
	public void raj_get_promotion() {
		
		System.out.println("raj get promotion");
	     
	}

	@Then("finally raj happy")
	public void finally_raj_happy() {
		
		System.out.println("finally raj happy");
	    
	}
	
	 

}
