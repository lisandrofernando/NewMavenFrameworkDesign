package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.BaseClass;

public class StepDefinition extends BaseClass{
	 HomePageEvents home = new HomePageEvents();
	 LoginPageEvents event = new LoginPageEvents();
	 
	 @Given("^User is on landing page and hover the element$")
	    public void user_is_on_landing_page_and_hover_the_element() throws Throwable {
		 home.hoverSignInWindow();
	    }

	    @When("^User click on login button$")
	    public void user_click_on_login_button() throws Throwable {
	    	home.clickSignInButton();
	    }

	    @When("^User lands on singin page and enter email$")
	    public void user_lands_on_singin_page_and_enter_email() throws Throwable {
	    	event.enterEmailBox();
	    }
	    @Then("^User click on continue button$")
	    public void user_click_on_continue_button() throws Throwable {
			event.clickContinue();
	    }


}
