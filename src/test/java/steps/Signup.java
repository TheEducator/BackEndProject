package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Common;

public class Signup extends Common{
	
	@Given("User is on main page and clicks sign up button and verifys new user sign up visible")
	public void user_is_on_main_page_and_clicks_sign_up_button_and_verifys_new_user_sign_up_visible() {
	  setUp();
	}

	@Given("User enters credentials and clicks sign up button")
	public void user_enters_credentials_and_clicks_sign_up_button() {
	 
	}

	@When("User verifys enter account visible and fills rest of the credientials")
	public void user_verifys_enter_account_visible_and_fills_rest_of_the_credientials() {
	
	}

	@When("User selects checkboxes for newsletter and special offers")
	public void user_selects_checkboxes_for_newsletter_and_special_offers() {
	    
	}

	@Then("User clicks create account button and verifys account created is visible")
	public void user_clicks_create_account_button_and_verifys_account_created_is_visible() {
	
	}

	@Then("User clicks continue button and verifys loged in as user is visible")
	public void user_clicks_continue_button_and_verifys_loged_in_as_user_is_visible() {
	   
	}

	@Then("User clicks delete account button and verifys that account deleted and click continue button")
	public void user_clicks_delete_account_button_and_verifys_that_account_deleted_and_click_continue_button() {
	   
	}

}
