package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CabBookingSteps {

    @Given("^I am on the Uber Application$")
    public void uberPageLand() {
        System.out.println("Step 1 : Land on the Uber Page");
    }

    @When("I am selecting a {string} option")
    public void selectCarType(String carType) {
        System.out.println("Step 2 : You are selecting "+carType);
    }

    @When("I am selecting {string} as Pickup location and {string} as Drop location")
    public void selectPickUpDropOff(String pickUp, String dropOff) {
        System.out.println("Step 3 : "+"Pick Up : "+pickUp+" Drop Off : "+dropOff);
    }

    @Then("Driver is able to accept my request")
    public void driverAcceptRide() {
        System.out.println("Step 4 : "+"Driver accepts the Ride");
    }
}
