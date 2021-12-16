package pageEvents;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pageObjects.HomePageElements;
import utils.BaseClass;
import utils.FindElement;

public class HomePageEvents extends BaseClass {

	FindElement find = new FindElement();

	public void hoverSignInWindow() {
		Actions action = new Actions(driver);
		action.moveToElement(find.getElement("ID", HomePageElements.signInPopUp)).build().perform();

	}

	public void clickSignInButton() {
		find.getElement("CSS", HomePageElements.signIn).click();

	}

	public void searchItem() {

		find.getElement("ID", HomePageElements.searchBox).sendKeys("MackBook");
		find.getElement("ID", HomePageElements.searchBox).sendKeys(Keys.ENTER);
	}

	public void selectItem() {
		find.getElement("ID", HomePageElements.searchItems).click();
		;
		Select select = new Select(find.getElement("ID", HomePageElements.searchItems));
		select.selectByIndex(4);
	}

}
