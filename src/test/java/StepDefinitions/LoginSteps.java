package StepDefinitions;

import Pages.DashBoardPage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginSteps {

    private static final Logger log = LoggerFactory.getLogger(LoginSteps.class);
    WebDriver driver;
    LoginPage loginPage;
    DashBoardPage dashBoardPage;

    public LoginSteps() {
        driver = Hooks.driver;
        loginPage = new LoginPage(driver);
        dashBoardPage = new DashBoardPage(driver);
    }

    @Given("^User lands on the (.+) of the application$")
    public void userLandOnPage(String targetPage) {
        System.out.println("Current Page : "+targetPage);
        if (targetPage.equalsIgnoreCase("LoginPage")) {
            boolean status = loginPage.waitForLoginPageToLoad();
            System.out.println("Status is : "+status + " Driver "+driver);
            Assert.assertTrue(status);
        } else if (targetPage.equalsIgnoreCase("DashboardPage")) {
            boolean status = dashBoardPage.waitForDashboardPageToLoad();
            Assert.assertTrue(status);
        } else {
            throw new RuntimeException("Please enter a valid Page");
        }
    }

    @When("^User enters (.+) as the email address$")
    public void userEntersLoginEmail(String userEmail) {
        loginPage.enterUserEmail(userEmail);
    }

    @When("^User enters (.+) as the password$")
    public void userEntersLoginPassword(String userPassword) {
        loginPage.enterUserPassword(userPassword);
    }

    @When("User clicks on the login button")
    public void userClicksOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @When("User clicks on the logout button")
    public void userClicksOnLogoutButton() {
        dashBoardPage.clickLogoutLink();
    }

}
