package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(dryRun = true,
        plugin = "json:target/cucumber-report.json",
        features = {"src/test/resources/Calculator.feature"},
        glue = {"steps"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
