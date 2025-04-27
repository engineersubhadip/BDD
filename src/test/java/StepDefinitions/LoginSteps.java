package StepDefinitions;

import DriverConfig.DriverManager;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import PageObjects.ProductSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.Driver;

public class LoginSteps {

    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private HomePage homePage;
    private ProductSearchPage productSearchPage;

    public LoginSteps() {
        loginPage = new LoginPage(DriverManager.getInstance().getDriver());
        myAccountPage = new MyAccountPage(DriverManager.getInstance().getDriver());
        homePage = new HomePage(DriverManager.getInstance().getDriver());
        productSearchPage = new ProductSearchPage(DriverManager.getInstance().getDriver());
    }

    @Given("User lands on the {string} page of the application")
    public void userLandsOnPage(String currPage) throws InterruptedException {
        if (currPage.equalsIgnoreCase("Login")) {
            Assert.assertTrue(loginPage.waitForLoginPageToLoad());
            Thread.sleep(2000);
        } else if (currPage.equalsIgnoreCase("My Account")) {
            Assert.assertTrue(myAccountPage.waitForMyAccountPageToLoad());
        } else if (currPage.equalsIgnoreCase("Home")) {
            Assert.assertTrue(homePage.waitForHomePageToLoad());
        } else if (currPage.equalsIgnoreCase("Search")) {
            Assert.assertTrue(productSearchPage.waitForProductSearchPageToLoad());
        }
    }

    @When("User enters the {string} as the email")
    public void userEntersEmail(String userEmail) throws InterruptedException {
        loginPage.enterUserEmail(userEmail);
        Thread.sleep(2000);
    }

    @When("User enters the {string} as the password")
    public void userEntersPassword(String userPassword) throws InterruptedException {
        loginPage.enterUserPassword(userPassword);
        Thread.sleep(2000);
    }

    @When("User clicks on the Login Button")
    public void userEntersLoginButton() throws InterruptedException {
        loginPage.clickLoginButton();
        Thread.sleep(2000);
    }
}
