package basics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class FlipkartDeclar {

	@FindBy(xpath = "//img[contains(@title,'Flipkart')]")
	private WebElement title;
	
	@FindBy(xpath ="//span[text()='Login']")
	private WebElement login;
}

