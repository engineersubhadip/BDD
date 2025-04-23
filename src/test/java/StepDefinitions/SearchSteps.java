package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

    @Given("^User is on the Amazon Search Page$")
    public void landInAmazonSearchPage() {
        System.out.println("Step 1 : User is on the Amazon search Page");
    }

    @When("User enters {string} in the search bar")
    public void enterProduct(String userProduct) {
        System.out.println("Step 2 : User searches for "+userProduct+" in the search bar");
    }

    @When("^User clicks on the search button$")
    public void clickSearchButton() {
        System.out.println("Step 3 : User clicks on the search button");
    }

    @Then("User should see {string} in the search results")
    public void getSearchResult(String searchResult) {
        System.out.println("Step 4 : User is seeing "+searchResult+" on the list of results");
    }
}
