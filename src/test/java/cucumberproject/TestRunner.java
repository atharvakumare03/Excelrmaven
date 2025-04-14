package cucumberproject;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {
        "src/test/resources/Features/openmrs.feature"
    },
    glue = {"cucumberproject"},
    plugin = {
        "pretty",
        "html:target/htmlreport1.html"
    }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
