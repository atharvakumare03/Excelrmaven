package cucumberframework;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Features/login.feature"},
glue= {"cucumberframework"},plugin= {"pretty","html:target/htmlreport.html"})



public class Testrunner extends AbstractTestNGCucumberTests{
	
}

/*package cucumberframework;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {
        "src/test/resources/Features/login.feature",
        "src/test/resources/Features/openmrs.feature"
    },
    glue = {"cucumberframework", "cucumberproject"},
    plugin = {
        "pretty",
        "html:target/htmlreport.html",
        "html:target/htmlreport1.html"
    }
)
public class Testrunner extends AbstractTestNGCucumberTests {
}
*/