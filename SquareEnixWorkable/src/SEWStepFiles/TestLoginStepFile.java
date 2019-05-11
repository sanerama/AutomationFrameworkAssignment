/*This class is checking for the following
 * 1.Login functionality with
 * 	a.Valid username and password
 * 	b.No username and password
 * 	c.Invalid usename,valid password
 * 	d.Valid username invalid password
 * And
 * 2.Checks for assert Value*/


package SEWStepFiles;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.SessionId;

import SEWPageObjects.PageObjects;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestLoginStepFile extends Hooks {
	
	PageObjects PO1;
	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		
		PO1 = new PageObjects(driver);
		PO1.enterLogIn();
	    
	}
	@Test
	@When("^User Enters valid username as'Johnny(\\d+)'$")
	public void user_Enters_valid_username_as_Johnny(int arg1) throws Throwable {
		
		PO1.enterValidUsername();
	   
	}

	@When("^User Enters valid password as 'qwerty'$")
	public void user_Enters_valid_password_as_qwerty() throws Throwable {
		
		PO1.enterValidPassword();
	    
	}

	@When("^User Submits details$")
	public void user_Submits_details() throws Throwable {
		
		PO1.submitDetails();
	    
	}

	@Then("^User navigates to user's homepage$")
	public void user_navigates_to_user_s_homepage() throws Throwable {
		
		/* SessionId session =((ChromeDriver)driver).getSessionId();

		System.out.println("Session id: " + session.toString());*/
		
		/*todo: get session info from and validate.
		 * Need to get the token by correlating from previous request where it
		 * Contains authentication id and then use it while posting*/
		
		
	}
	
	
	@When("^User Enters no username as''$")
	public void user_Enters_no_username_as() throws Throwable {
		
		PO1.enterNoUsername();
	   
	}

	@When("^User Enters no password as ''$")
	public void user_Enters_no_password_as() throws Throwable {
		PO1.enterNoPassword();
	    
	}

	@Then("^User is represented with error msg$")
	public void user_is_represented_with_error_msg() throws Throwable {
		
		PO1.errorMsg();
	    
	}
	
	@When("^User Enters invalid password$")
	public void user_Enters_invalid_password() throws Throwable {
	   
		PO1.InvalidPassword();
	}

	@When("^User Enters Invalid username$")
	public void user_Enters_Invalid_username() throws Throwable {
	  
		PO1.InvalidUsername();
	}


}
