package CucumberDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsDemo1 {
	
	@Given("Rajesh")
	public void rajesh() {
	     System.out.println("rajesh family");
	}

	@When("Akila")
	public void akila() {
	     System.out.println("rajesh family");

	     
	}

	@Then("Thrishiv")
	public void thrishiv() {
	     System.out.println("rajesh family");

	     
	}

	@Then("Nishavu")
	public void nishavu() {
	     System.out.println("rajesh family");

	     
	}

	@Given("Selva")
	public void selva() {
	     System.out.println("selva family");

	     
	}

	@When("Kokila")
	public void kokila() {
	     System.out.println("selva family");

	     
	}

	@Then("Thrishiv1")
	public void thrishiv1() {
	     System.out.println("selva family");

	     
	}

	@Then("Nishavu1")
	public void nishavu1() {
	     System.out.println("selva family");

	     
	}

	@Given("Anbu")
	public void anbu() {
		
	     System.out.println("Anbu family");

	}
	
	@When("Kokila1")
	public void kokila1() {
	     System.out.println("Anbu family");

	     
	}

	@Then("Pranav")
	public void pranav() {
	     System.out.println("Anbu family");

	     
	}


}
