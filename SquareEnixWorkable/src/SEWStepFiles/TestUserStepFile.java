/*This class checks after login if additional user info is displayed or not*/

package SEWStepFiles;

import SEWPageObjects.PageObjects;
import cucumber.api.java.en.Then;

public class TestUserStepFile extends Hooks {
	
	
	PageObjects PO2;
	
	@Then("^User can see Additional two Fields as Address and Email$")
	public void user_can_see_Additional_two_Fields_as_Address_and_Email() throws Throwable {
	
		PO2.showUserInfo();
	}

}


