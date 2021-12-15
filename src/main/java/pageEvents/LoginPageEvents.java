package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.BaseClass;
import utils.FindElement;

public class LoginPageEvents extends BaseClass {

	public void enterEmailBox() {
		FindElement find = new FindElement();
		find.getElement("XPATH", LoginPageElements.inputEmail).sendKeys("lisandrusfernandus@gmail.com");
	}

	public void clickContinue() {
		FindElement find = new FindElement();
		find.getElement("ID", LoginPageElements.continueSignIn).click();
		;
	}

}
