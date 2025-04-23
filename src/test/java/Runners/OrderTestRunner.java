package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/Order.feature"},
        glue = {"StepDefinitions"},
        tags = "@Smoke or @Regression",
        dryRun = false,
        plugin = {"pretty"}
)
public class OrderTestRunner {
}
