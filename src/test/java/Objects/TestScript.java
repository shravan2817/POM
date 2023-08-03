package Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import  Objects.GooglePage;

public class TestScript {
	WebDriver driver;

	@BeforeTest
	public void beforetest() {
		driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	}
	
	@Test
	public void searchcontent(WebDriver driver1) {
		GooglePage page= new GooglePage();
		page.SearchBox("facebook");
	}
	
	@AfterTest
	public void Teardown() {
		driver.quit();
	}


}
