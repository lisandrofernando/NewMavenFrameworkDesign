package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElement {

	public WebElement getElement(String identifierType, String identifierValue) {

		switch (identifierType) {
		case "ID":
			return BaseClass.driver.findElement(By.id(identifierValue));
		case "CSS":
			return BaseClass.driver.findElement(By.cssSelector(identifierValue));
		case "XPATH":
			return BaseClass.driver.findElement(By.xpath(identifierValue));
		case "CALSSNAME":
			return BaseClass.driver.findElement(By.className(identifierValue));
		case "LINKTEXT":
			return BaseClass.driver.findElement(By.linkText(identifierValue));
		case "TAGNAME":
			return BaseClass.driver.findElement(By.tagName(identifierValue));
		default:
			return  null;

		}
	}

	public List<WebElement> getListOfElements(String identifierTypes, String identifierValue) {

		switch (identifierTypes) {
		case "ID":
			return BaseClass.driver.findElements(By.id(identifierValue));
		case "CSS":
			return BaseClass.driver.findElements(By.cssSelector(identifierValue));
		case "XPATH":
			return BaseClass.driver.findElements(By.xpath(identifierValue));
		case "CALSSNAME":
			return BaseClass.driver.findElements(By.className(identifierValue));
		case "LINKTEXT":
			return BaseClass.driver.findElements(By.linkText(identifierValue));
		case "TAGNAME":
			return BaseClass.driver.findElements(By.tagName(identifierValue));
		default:
			return null;

		}
	}
}
