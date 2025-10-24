package basics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLogin {@FindBy(id="email")
private WebElement email;
@FindBy(id="passContainer")
private WebElement pwd;
@FindBy(name="login")
private WebElement login;


}
