package basics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHmPg {
@FindBy(id="twotabsearchtextbox")
private WebElement Sertbx;
@FindBy(id="nav-logo-sprites")
private WebElement logo;
@FindBy(xpath = "//div[text()='Get to Know Us']")
private WebElement bottom;
@FindBy(xpath = "//div[text()='Connect with Us']")
private WebElement btm2;
@FindBy(xpath = "//div[text()='Make Money with Us']")
private WebElement btm3;
@FindBy(xpath = "//div[text()='Let Us Help You']")
private WebElement btm4;

}
