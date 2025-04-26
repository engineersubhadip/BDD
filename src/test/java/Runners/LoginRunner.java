package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"StepDefinitions","Hooks"},
        tags = "@Smoke",
        dryRun = false,
        plugin = {"pretty"}
)
public class LoginRunner {

}
