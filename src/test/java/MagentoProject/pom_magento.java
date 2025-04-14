package MagentoProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_magento {
		public pom_magento(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
		
		@FindBy(xpath = "/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
		public WebElement SignInbtn;
		
		@FindBy(name = "login[username]")
		public WebElement email;
		
		@FindBy(name = "login[password]")
		public WebElement password;
		
		@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]/span[1]")
		public WebElement login;
		
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/a[1]/span[2]")
		public WebElement gear;
		
		@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[2]/dl[1]/dd[1]/ol[1]/li[1]/a[1]")
		public WebElement bag;
		
		@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[2]/div[1]/a[1]/span[1]/span[1]/img[1]")
		public WebElement product;
		
		@FindBy(id = "qty")
		public WebElement quantity;
		
		@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[2]/button[1]/span[1]")
		public WebElement add_to_cart;
		
		@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[5]/div[1]/a[1]/span[1]")
		public WebElement wishlist;
		
		@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/form[1]/div[1]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]")
		public WebElement select_prod;
		
		@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/div[5]/a[1]")
		public WebElement reviews;
		
		@FindBy(id = "Rating_2")
		public WebElement five_stars;
		
		@FindBy(name = "title")
		public WebElement summary;
		
		@FindBy(name = "detail")
		public WebElement final_review;
		
		@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/div[6]/div[2]/div[2]/form[1]/div[1]/div[1]/button[1]/span[1]")
		public WebElement submit_review;
}
