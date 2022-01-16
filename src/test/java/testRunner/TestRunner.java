package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        tags = "@test-01",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-html", "json:target/cucumber.json"}
)
public class TestRunner {
}
