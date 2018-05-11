package cucumber.tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class SampleTestStepDefinition {

	WebDriver driver;
	String baseurl = "http://www.automationpractice.com";
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@After
	public void firstTest() {
		driver.close();
	}
	
	@Given("^I click on Contact Us$")
	public void clickOnContactUs() {
		WebElement contactUsLink = driver.findElement(By.cssSelector("#contact-link > a"));
		contactUsLink.click();
		String expectedTitle = driver.getTitle();
		assertEquals("Contact us - My Store", expectedTitle, "Title does not match");
		System.out.println("Title matches");
	}
	
}
