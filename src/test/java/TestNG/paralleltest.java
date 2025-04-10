package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paralleltest {

	WebDriver driver; // no need for static

	@Test
	public void orangehrm() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.quit(); // better than close
	}

	@Test
	public void facebook() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.quit(); // close entire browser instance
	}
}
