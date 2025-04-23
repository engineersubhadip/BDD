package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {

    @Given("User is on the {string} Page")
    public void landOnLoginPage(String currentPage) {
        System.out.println("Step 1 User is on the "+currentPage+" Page");
    }

    @When("User enters the {string} as user email")
    public void userEntersEmail(String email) {
        System.out.println("Step 2 User enters the email "+email);
    }

    @When("User enters the {string} as user password")
    public void userEntersPassword(String password) {
        System.out.println("Step 3 User enters the password "+password);
    }

    @When("User clicks on the Amazon login button")
    public void clickOnAmazonLoginButton() {
        System.out.println("Step 4 User clicks on the Login Button");
    }

    @When("User navigates to the Orders page")
    public void navigateToOrdersPage() {
        System.out.println("Step 5 User navigates to Orders Page");
    }

    @When("User navigates to the Cancelled order tab")
    public void navigateToCancelledTab() {
        System.out.println("Step 6 User navigates to the Cancelled Orders tab");
    }

    @Then("User checks all the {string} details")
    public void userChecksOrderDetails(String orderDetails) {
        System.out.println("Step 7 User checks all the "+orderDetails+" details");
    }
}
