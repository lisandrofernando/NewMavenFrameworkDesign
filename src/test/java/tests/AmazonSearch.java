package tests;

import org.testng.annotations.Test;

import pageEvents.HomePageEvents;

import utils.BaseClass;
import utils.JavascriptUtil;

public class AmazonSearch extends BaseClass {
	HomePageEvents home = new HomePageEvents();

	@Test
	public void AmazonSearch() {

		home.searchItem();
		JavascriptUtil.javascriptScrool(driver);
	}

	@Test
	public void selectItem() {

		home.selectItem();
	}

}
