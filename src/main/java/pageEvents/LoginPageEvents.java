package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.BaseClass;
import utils.FindElement;

public class LoginPageEvents extends BaseClass {
	FindElement find = new FindElement();

	public void enterEmailBox() {

		find.getElement("XPATH", LoginPageElements.inputEmail).sendKeys("lisandrusfernandus@gmail.com");
	}

	public void clickContinue() {

		find.getElement("ID", LoginPageElements.continueSignIn).click();
		;
	}

}
