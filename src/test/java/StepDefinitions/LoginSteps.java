package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginSteps {

    @Given("^User lands on the (.+) of the application$")
    public void userLandOnPage(String targetPage) {
        System.out.println("Given Keyword : User Lands on" + targetPage);
    }

    @When("^User enters (.+) as the email address$")
    public void userEntersLoginEmail(String userEmail) {
        System.out.println("When Keyword "+"User enters email "+userEmail);
    }

    @When("^User enters (.+) as the password$")
    public void userEntersLoginPassword(String userPassword) {
        System.out.println("When keyword "+"user enters password "+userPassword);
    }

    @When("User clicks on the login button")
    public void userClicksOnLoginButton() {
        System.out.println("When Keyword "+"User clicks on Login button");
    }

    @When("User clicks on the logout button")
    public void userClicksOnLogoutButton() {
        System.out.println("When Keyword "+"User clicks on Logout button");
    }

}
