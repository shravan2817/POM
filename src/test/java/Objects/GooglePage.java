package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

	By SearchBox=By.xpath("//textarea[@name='q']");
	By Searchbtn=By.name("btnK");
	By FacebookLink=By.xpath("//a//h3[text()='Facebook - log in or sign up']");

	public void GooglPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void  searchcontent(WebDriver driver,String searchinput) {
		

	}
	public void clickFacebookLink(WebDriver driver) {
		driver.findElement(FacebookLink).click();
		
	}

	public void SearchBox(WebDriver driver,String string,String searchinput) {
		driver.findElement(SearchBox).sendKeys(searchinput);
		driver.findElement(Searchbtn).click();
		
		
	}

	public void SearchBox(String string) {
		// TODO Auto-generated method stub
		
	}

}
