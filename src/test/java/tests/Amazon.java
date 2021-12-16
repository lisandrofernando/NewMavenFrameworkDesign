package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.BaseClass;

public class Amazon extends BaseClass {
	HomePageEvents home = new HomePageEvents();
	LoginPageEvents event = new LoginPageEvents();
	String Logo = "Amazon";

	@Test
	public void Amazon() {

		home.hoverSignInWindow();
		home.clickSignInButton();
		event.enterEmailBox();
		event.clickContinue();

	}

	@Test
	public void AmazonValidation() {

		home.hoverSignInWindow();
		home.clickSignInButton();
		String ExpectedValue = "Amazon";
		Assert.assertEquals(ExpectedValue, Logo);
		event.enterEmailBox();
		event.clickContinue();

	}
}
