package stepdefination;

import base.Testbase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class LandingStepDef extends Testbase{
	LoginPage lp=new LoginPage(driver);
	  @Given("^user sucessfully loggedIn$")
	    public void user_sucessfully_loggedin() throws Throwable {
		  driver.get("https://profile.w3schools.com/log-in");
	       lp.ApplicationLogin();
	    }

	    @When("^get title$")
	    public void get_title() throws Throwable {
	        
	    }

	    @Then("^verify landing page$")
	    public void verify_landing_page() throws Throwable {
	        
	    }
}
