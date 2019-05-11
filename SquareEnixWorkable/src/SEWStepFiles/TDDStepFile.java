
/*This class is written for future TDD development*/
package SEWStepFiles;

import SEWPageObjects.PageObjects;
import cucumber.api.java.en.Then;

public class TDDStepFile extends Hooks{
	
	PageObjects PO5;
	/*Writting test script for bio field only 
	 * Will add @Test tag after development is completed*/

	@Then("^User can see additional boi field$")
	public void user_can_see_additional_boi_field() throws Throwable {
		
		PO5 = new PageObjects(driver);
		PO5.tddBioField();
	   }
//To write similar APIs for other fields
}

