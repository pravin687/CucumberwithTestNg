package stepdefination;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import base.Testbase;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;


public class LoginTest extends Testbase{
	
	LoginPage lp=new LoginPage(driver);

	
	@Given("Navigate to W3schhol url")
	public void navigate_to_W3schhol_url() {
		driver.get("https://profile.w3schools.com/log-in");
	}
	
	@When("insert username and passwprd and click on loginButton")
	public void insert_username_and_passwprd_and_click_on_loginButton() {
		lp.setemail("rtoor204@gmail.com");
		lp.setPassword("Abcde@12345");
		lp.loginButton();
	}
	 
	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		String actual=driver.getTitle();
		System.out.println(actual);
		//assert.assertTrue(actual);
		Assert.assertEquals(actual,"Log in - W3Schools");
		
	}
	
	@When("insert  wrong username and passwprd and click on loginButton")
	public void insert_wrong_username_and_passwprd_and_click_on_loginButton() {
		lp.setemail("rtoorom");
		lp.setPassword("Abc5");
		lp.loginButton();
	}
	
	@Then("We should get a wrong credentails message")
	public void We_should_get_a_wrong_credentails_message() {
		String message=lp.incorrectcredmessage();
		Assert.assertEquals(message, "Looks like you forgot something");
	}
	
	@But("user should see login page")
	public void user_should_see_login_page() {
		driver.getTitle();
	}
}
