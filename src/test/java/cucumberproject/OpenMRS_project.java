package cucumberproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OpenMRS_project {

	static WebDriver driver;
	static cucumber cucumber;
		@Given("Open the browser")
		public void open_the_browser() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			cucumber = new cucumber(driver);
			driver.get("https://o2.openmrs.org/openmrs/login.htm");
		
		}
		
		@Then("Enter Username {string}")
		public void enter_username(String uname) {
			cucumber.username.sendKeys(uname);
		    
		}
		@Then("Enter Password {string}")
		public void enter_password(String pass) {
			cucumber.password.sendKeys(pass);
		}
		@Then("Select Location")
		public void select_location() {
			cucumber.location.click();
		}
		@Then("Click on login button")
		public void click_on_login_button() {
			cucumber.loginBtn.click();
		}
		
		@Then("Click on Capture Vitals")
		public void click_on_capture_vitals() {
		    cucumber.capture_vitals.click();
		}
		@Then("Search for patient")
		public void search_for_patient() {
		   cucumber.find_patient.click();
		}

		@Then("Record the vitals")
		public void record_the_vitals() {
		   cucumber.record_vitals.click();
		}
		@Then("Enter the height {string}")
		public void enter_the_height(String h) {
		   cucumber.height.sendKeys(h);
		   cucumber.nextbutton1.click();
		}
		@Then("Enter the weight {string}")
		public void enter_the_weight(String w) {
		   cucumber.weight.sendKeys(w);
		   cucumber.nextbutton2.click();
		}
		@Then("Enter the nextButton")
		public void enter_the_nextButton() {
		  cucumber.nextbutton3.click();
		}
		@Then("Enter the Temperature {string}")
		public void enter_the_temperature(String t) {
		    cucumber.temperature.sendKeys(t);
		    cucumber.nextbutton4.click();
		}
		@Then("Enter the pulse {string}")
		public void enter_the_pulse(String p) {
		    cucumber.pulse.sendKeys(p);
		    cucumber.nextbutton5.click();
		}
		@Then("Enter the Respiratory Rate {string}")
		public void enter_the_respiratory_rate(String rr) {
		    cucumber.respiratory_rate.sendKeys(rr);
		    cucumber.nextbutton6.click();
		}
		@Then("Enter the Blood Pressure {string} and {string}")
		public void enter_the_blood_pressure(String systolic, String diastolic) {
		    cucumber.bp1.sendKeys(systolic);
		    cucumber.bp2.sendKeys(diastolic);
		    cucumber.nextbutton7.click();
		}
		@Then("Enter the Arterial Blood {string}")
		public void enter_the_arterial_blood(String ab) {
		    cucumber.blood_oxygen.sendKeys(ab);
		    cucumber.nextbutton8.click();
		}
		@Then("Click on Save")
		public void click_on_save() {
		    cucumber.nextbutton9.click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
