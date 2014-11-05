package qa.classes.jbehave.steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class MySteps {
	@Given("I am a pending step")
	public void givenIAmAPendingStep() {
	  // PENDING
	}

	@Given("I am still pending step")
	@Alias("I am still pending")
	public void bla_bla_vasja() {
	  // PENDING
	}

	@When("a good soul will implement me")
	@Pending
	public void whenAGoodSoulWillImplementMe() {
	  // PENDING
	}

	@Then("I shall be happy")
	public void thenIShallBeHappy() {
	 System.out.println("I'm happy");
	}
}
