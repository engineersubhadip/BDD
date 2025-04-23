package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class UserRegistrationSteps {

    @Given("User is on the Registration page")
    public void landOnRegistrationPage() {
        System.out.println("User is on the registration page");
    }

    @When("User enters the following details")
    public void setRegistrationDetail(DataTable table) {
        List<List<String>> data =  table.asLists(String.class);

            for (int i=0; i<data.size(); i++) {
                List<String> currData = data.get(i);
                StringBuilder sb = new StringBuilder();
                for (int j=0; j<currData.size(); j++) {
                    sb.append(currData.get(j));
                    sb.append(" || ");
                }
                String ans = sb.toString();
                System.out.println(ans);
            }
    }

    @When("User enters the following details with columns")
    public void setRegistrationDetailWithColumn(DataTable table) {
        List<Map<String, String>> userList =  table.asMaps(String.class, String.class);

        for (Map<String, String> currUser : userList) {
            System.out.println(currUser);
            System.out.println(currUser.get("firstName"));
        }
    }

    @Then("User should be successfully registered")
    public void performRegistration() {
        System.out.println("User successfully registered");
    }
}
