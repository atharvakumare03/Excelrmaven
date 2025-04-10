package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class assertions {
	static WebElement dash;
public static void login() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	WebElement username1=driver.findElement(By.name("username"));
	username1.sendKeys("Admin");
	WebElement pwd=driver.findElement(By.name("password"));
	pwd.sendKeys("admin123");
	WebElement login=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]"));
	login.click();
	dash=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/span[1]/h6[1]"));
	Assert.assertTrue(dash.isDisplayed(),"login passed");

	
//ASSERTIONS:
	
	//validate the testcases---->
	//Hard,soft
	//Hard assertion will stop the program execution at the failed
	//test case
	//soft assertion--->high light execption or error
	//next test cases will be continued
	//SoftAssert assertobj=new SoftAssert();
	//assertobj.
}
}
