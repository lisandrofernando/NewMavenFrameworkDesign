package tests;

import org.testng.annotations.Test;

import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.BaseClass;

public class Amazon extends BaseClass {

	@Test
	public void Amazon() {
		HomePageEvents home = new HomePageEvents();
		home.hoverSignInWindow();
		home.clickSignInButton();
		LoginPageEvents event = new LoginPageEvents();
		event.enterEmailBox();
		event.clickContinue();

	}
}
