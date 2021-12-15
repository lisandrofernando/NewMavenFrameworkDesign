package pageEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.HomePageElements;
import utils.BaseClass;
import utils.FindElement;

public class HomePageEvents extends BaseClass {

	public void hoverSignInWindow() {
		Actions action = new Actions(driver);
		FindElement find = new FindElement();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList")));
		action.moveToElement(find.getElement("ID", HomePageElements.signInPopUp)).build().perform();

	}

	public void clickSignInButton() {
		FindElement find = new FindElement();
		find.getElement("CSS", HomePageElements.signIn).click();

	}

}
