package StepDefinitions;

import DriverConfig.DriverManager;
import PageObjects.CartPage;
import Utility.BrowserUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ShoppingCartSteps {

    private CartPage cartPage;

    public ShoppingCartSteps() {
        cartPage = new CartPage(DriverManager.getInstance().getDriver());
    }

    @When("User updates the quantity to {string}")
    public void updateProductQuantity(String updatedCount) throws InterruptedException {
        Thread.sleep(1500);
        cartPage.enterProductCount(updatedCount);
    }

    @When("User clicks on Refreshes button")
    public void hitUpdateButton() throws InterruptedException {
        Thread.sleep(1500);
        cartPage.clickOnUpdateButton();
    }

    @Then("User verifies the total price of the items")
    public void verifyTotalPriceAmount() throws InterruptedException {
        Thread.sleep(1500);
        Assert.assertTrue(cartPage.verifyTotalPrice());
    }
}
