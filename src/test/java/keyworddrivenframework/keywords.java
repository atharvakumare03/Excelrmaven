package keyworddrivenframework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keywords {

	static WebDriver driver;
	//openbrowser()
	public static void openbrowser()
	
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//gotourl()
	public static void gotourl()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	}	
	//enterusername()
	public static void enterusername() 
	{
		WebElement username1=driver.findElement(By.name("username"));
		username1.sendKeys("Admin");
	}
	
	//enterpassword()
	
	public static void enterpassword() 
	{
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("admin123");
	}
	
	//clicklogin()
	public static void clicklogin() 
	{
		WebElement login=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]"));
		login.click();
		
		System.out.println("run complete");
		
	}

}
