package cucumberproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class cucumber {

	public cucumber(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(name = "username")
	   public WebElement username;
	
	   @FindBy(name = "password")
	   public WebElement password;
	   
	   @FindBy(id = "loginButton")
	   public WebElement loginBtn;
	   
	   @FindBy(id = "Inpatient Ward")
	   public WebElement location;
	   
	   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[3]/div[1]/a[3]/i[1]")
	   public WebElement capture_vitals;

	   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[1]")
	   public WebElement find_patient;
	   
	   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[3]/div[1]/button[1]/i[1]")
	   public WebElement record_vitals;
	   
	   @FindBy(id = "w8")
	   public WebElement height;
	   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[4]/form[1]/div[3]/button[2]/icon[1]")
	   public WebElement nextbutton1;
	   
	   @FindBy(id = "w10")
	   public WebElement weight;
	   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[4]/form[1]/div[3]/button[2]")
	   public WebElement nextbutton2;
	   
	   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[4]/form[1]/div[3]/button[2]/icon[1]")
	   public WebElement nextbutton3;
	   
	   @FindBy(id = "w12")
	   public WebElement temperature;
	   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[4]/form[1]/div[3]/button[2]")
	   public WebElement nextbutton4;
	   
	   @FindBy(id = "w14")
	   public WebElement pulse;
	   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[4]/form[1]/div[3]/button[2]")
	   public WebElement nextbutton5;
	   
	   @FindBy(id = "w16")
	   public WebElement respiratory_rate;
	   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[4]/form[1]/div[3]/button[2]/icon[1]")
	   public WebElement nextbutton6;
	   
	   @FindBy(id = "w18")
	   public WebElement bp1;
	   @FindBy(id = "w20")
	   public WebElement bp2;
	   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[4]/form[1]/div[3]/button[2]")
	   public WebElement nextbutton7;
	   
	   @FindBy(id = "w22")
	   public WebElement blood_oxygen;
	   @FindBy (xpath = "/html[1]/body[1]/div[1]/div[3]/div[4]/form[1]/div[3]/button[2]")
	   public WebElement nextbutton8;
	   
	   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[4]/form[1]/div[2]/div[1]/p[1]/button[1]")
	   public WebElement nextbutton9;
}