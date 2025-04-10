package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersTestNG {

static WebDriver driver;
	
	@Test
	@Parameters("Browser")
	 public void orangehrm(String browser) {
			if(browser.equalsIgnoreCase("Chrome")) {
				driver= new ChromeDriver();
			}
			
			if(browser.equalsIgnoreCase("Edge")) {
				driver= new EdgeDriver();
			}

}
}
