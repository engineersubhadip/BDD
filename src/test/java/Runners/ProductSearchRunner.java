package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"StepDefinitions", "Hooks"},
        tags = "@Regression",
        dryRun = false,
        plugin = {"pretty"}
)
public class ProductSearchRunner {
}
