package MagentoProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class magento {
	static WebDriver driver;
	static pom_magento pom_magento;
		@Given("Open the browser")
		public void open_the_browser() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			pom_magento = new pom_magento(driver);
			driver.get("https://magento.softwaretestingboard.com/");
		
		}


		@Then("Click on SignIN button")
		public void click_on_sign_in_button() {
		 pom_magento.SignInbtn.click();
		}
		@Then("Enter Email {string}")
		public void enter_email(String e) {
		  pom_magento.email.sendKeys(e);
		}
		@Then("Enter Password {string}")
		public void enter_password(String p) {
		    pom_magento.password.sendKeys(p);
		}
		@Then("Click on SignIn")
		public void click_on_sign_in() {
		    pom_magento.login.click();
		}
		@Then("Click on Gear")
		public void click_on_gear() {
		    pom_magento.gear.click();
		}
		@Then("Click on Bags")
		public void click_on_bags() {
		    pom_magento.bag.click();
		}
		@Then("Select the product")
		public void select_the_product() {
		    pom_magento.product.click();
		}
		@Then("Change the quantity {string}")
		public void change_the_quantity(String cq) {
		    pom_magento.quantity.sendKeys(cq);
		}
		@Then("Click on Add to cart")
		public void click_on_add_to_cart() {
		    pom_magento.add_to_cart.click();
		}
		
		@Then("Click on Wishlist")
		public void click_on_wishlist() {
			pom_magento.wishlist.click();
			;
		}
		
		@And("Select prod")
		public void select_prod() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			pom_magento.select_prod.click();
		}
		
		@Then("Click on Reviews")
		public void click_on_reviews() {
			pom_magento.reviews.click();
		}
		
		@Then("Give Ratings")
		public void give_ratings() {
			pom_magento.five_stars.click();
		}


		@Then("Give Summary {string}")
		public void give_summary(String s) {
			pom_magento.summary.sendKeys(s);
		}

		@Then("Give Review {string}")
		public void give_review(String g) {
			pom_magento.final_review.sendKeys(g);
		}
		
		@And("Click on Submit")
		public void click_on_submit() {
			pom_magento.submit_review.click();
		}




}




