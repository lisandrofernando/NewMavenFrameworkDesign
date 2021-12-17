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
        BaseClass.logger.info("Mouse Over The Element");
	}
	public void clickSignInButton() {
		find.getElement("CSS", HomePageElements.signIn).click();
		BaseClass.logger.info("Clicking on a button");

	}

	public void searchItem() {

		find.getElement("ID", HomePageElements.searchBox).sendKeys("MackBook");
		find.getElement("ID", HomePageElements.searchBox).sendKeys(Keys.ENTER);
		BaseClass.logger.info("Entering a text");
	}

	public void selectItem() {
		find.getElement("ID", HomePageElements.searchItems).click();
		BaseClass.logger.info("Selecting an element");
		Select select = new Select(find.getElement("ID", HomePageElements.searchItems));
		select.selectByIndex(4);
	}

}
