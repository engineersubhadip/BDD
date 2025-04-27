package StepDefinitions;

import DriverConfig.DriverManager;
import PageObjects.HomePage;
import PageObjects.ProductSearchPage;
import Utility.BrowserUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductSearchSteps {

    private HomePage homePage;
    private ProductSearchPage productSearchPage;

    public ProductSearchSteps() {
        homePage = new HomePage(DriverManager.getInstance().getDriver());
        productSearchPage = new ProductSearchPage(DriverManager.getInstance().getDriver());
    }

    @When("User enters {string} in the search bar")
    public void enterUserProduct(String userProduct) throws InterruptedException {
        homePage.enterProductName(userProduct);
    }

    @When("User clicks on the search button of the application")
    public void clickOnSearchButton() {
        homePage.clickSearchButton();
    }

    @Then("User is able to see {string} in the search results")
    public void validateProduct(String userProduct) {
        Assert.assertTrue(productSearchPage.validateSearchResults(userProduct));
    }

    @When("User clicks on Add to Cart button for {string}")
    public void clickAddtoCart(String userProduct) {
        productSearchPage.addToCart(userProduct);
    }

    @When("User clicks on Shopping cart icon")
    public void clickOnShoppingCart() {
        productSearchPage.clickOnShoppingCartIcon();
    }

    @Then("User verifies the success message")
    public void userVerifiesSuccessMessage() {
        Assert.assertTrue(productSearchPage.waitForSuccessMessageToAppear());
    }
}
