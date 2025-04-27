package StepDefinitions;

import DriverConfig.DriverManager;
import PageObjects.HomePage;
import PageObjects.ProductSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    private HomePage homePage;
    private ProductSearchPage productSearchPage;

    public LoginSteps() {
        homePage = new HomePage(DriverManager.getInstance().getDriver());
        productSearchPage = new ProductSearchPage(DriverManager.getInstance().getDriver());
    }

    @Given("User lands on the {string} page of the application")
    public void userLandsOnPage(String currPage) throws InterruptedException {
        if (currPage.equalsIgnoreCase("Home")) {
            Assert.assertTrue(homePage.waitForHomePageToLoad());
        } else if (currPage.equalsIgnoreCase("Search")) {
            Assert.assertTrue(productSearchPage.waitForProductSearchPageToLoad());
        }
    }
}
