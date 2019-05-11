/* This class is checking for 
 * 1.Id,name ,avtar Fields are displayed or not
 * 2.Checking for arrays of user's*/

package SEWStepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SEWPageObjects.PageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestUsersStepFile extends Hooks{
	
	PageObjects PO;
	@Given("^User is on blog\\.example\\.com on Chrome browser$")
	public void user_is_on_blog_example_com_on_Chrome_browser() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\AUTOMATION TESTING\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://blog.example.com");

	   
	}

	@When("^User navigates on blog\\.example\\.com/users$")
	public void user_navigates_on_blog_example_com_users() throws Throwable {
		
		driver.get("http://blog.example.com/users");
	    
	}

	@Then("^User can see id,name,Avtar$")
	public void user_can_see_id_name_Avtar() throws Throwable {
		PO = new PageObjects(driver);
		PO.checkInvalidElements();
	    
	}

	@Then("^not able to see other user information$")
	public void not_able_to_see_other_user_information() throws Throwable {
		
		PO.checkInvalidElements();
	    
	}
	
	@Then("^Array of users should get displayed$")
	public void array_of_users_should_get_displayed() throws Throwable {
	    
		PO.checkArray();
	}


}
