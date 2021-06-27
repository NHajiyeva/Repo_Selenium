package Utils;
import cucumber.api.CucumberOptions;


import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            // Path to the feature files
            features = {"src/test/resources/features"},

            // Specify the step definition package name
            glue = {"StepDefinition", "DriverWrapper"},

            // Specify tags to be executed
            tags = {"@login1"},

            // This create a default cucumber report
            plugin = {"pretty", "html:Reports/Default/"}
    )

    public class TestRunner {
    }
