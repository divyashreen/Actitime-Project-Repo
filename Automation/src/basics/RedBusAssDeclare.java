package basics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedBusAssDeclare {
	@FindBy(xpath = "//div[text()='From']")
	private WebElement from;
	
	@FindBy(xpath = "//div[text()='To']")
	private WebElement to;
}
