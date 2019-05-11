/*This class tests for no. of elements are dispayed as per requirement or not.
 * Bydefault it should be 20*/
package SEWStepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import SEWPageObjects.PageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestNumberOfElementsDisplayed extends Hooks {
	
	PageObjects PO4;
	@Given("^User is on Chrome browser$")
	public void user_is_on_Chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\AUTOMATION TESTING\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();

	    
	}
//This function checking for 10 entries as n=10
	@When("^User is on content\\.example\\.com$")
	public void user_is_on_content_example_com() throws Throwable {
		
		driver.get("content.example.com/`GET /posts?n=10");
		PO4.validateNoOfEntries();
	    
	}

	@Then("^User should able to see (\\d+) entries$")
	public void user_should_able_to_see_entries(int arg1) throws Throwable {
	    PO4.getdefaultSize();
	}



}
