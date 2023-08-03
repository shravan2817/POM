package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

		public void Facebookpage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		By Username=By.xpath("//input[@id='email']");
		By Password=By.xpath("//input[@id='pass']");
		By Loginbtn=By.xpath("//button[@type='submit']");
		
		public void Username(WebDriver driver) {
			driver.findElement(Username).clear();
			driver.findElement(Username).sendKeys("tester123");
		}
		public void password(WebDriver driver) {
			driver.findElement(Password).clear();
			driver.findElement(Password).sendKeys("tester123");
		}
		public void loginbtnclick(WebDriver driver) {
			driver.findElement(Loginbtn).click();
		}

	}



