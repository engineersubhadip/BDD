package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingSteps {

    @Given("User is on the Billing Page")
    public void userLandsOnBillingPage() {
        System.out.println("User is on the Billing Page");
    }

    @When("User enters {string} amount {double}")
    public void userEntersAmount(String type , Double amount) {
        System.out.println("User enters "+amount+ " as type "+type);
    }

    @When("User clicks on Calculate Button")
    public void clickCalculateButton() {
        System.out.println("User clicks on Calculate button");
    }

    @Then("User sees the {double} in the UI")
    public void checkAmount(Double amount) {
        System.out.println("User sees "+amount+" on screen");
    }

}
