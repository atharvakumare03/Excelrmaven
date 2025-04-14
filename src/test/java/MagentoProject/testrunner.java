package MagentoProject;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(features= {"src/test/resources/Features/magento.feature"},
	glue= {"MagentoProject"},plugin= {"pretty","html:target/htmlreport2.html"})



	public class testrunner extends AbstractTestNGCucumberTests{
		
	}


