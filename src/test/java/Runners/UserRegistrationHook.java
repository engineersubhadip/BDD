package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/UserRegistration.feature"},
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {"pretty"}
)
public class UserRegistrationHook {
}
