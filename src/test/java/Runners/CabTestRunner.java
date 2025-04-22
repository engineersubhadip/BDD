package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/Cab.feature"},
        glue = {"StepDefinitions"},
        tags = "not @Smoke",
        dryRun = false,
        plugin = {"pretty","html:test-output"}
)
public class CabTestRunner {
}
