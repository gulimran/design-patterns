package imran.acceptance.step;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SingletonSteps {

    @Given("^a class based on singleton design pattern$")
    public void aGiven() {
        System.out.println("given");
    }

    @When("^I request an instance of this class$")
    public void aWhen() {
        System.out.println("when");
    }

    @Then("^I get an object instance of this class")
    public void aThen() {
        System.out.println("then");
    }
}



