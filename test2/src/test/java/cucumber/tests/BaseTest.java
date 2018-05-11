package cucumber.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseTest {

	WebDriver driver;
	String baseurl = "http://automationpractice.com";
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@After
	public void firstTest() {
		driver.close();
	}
}
