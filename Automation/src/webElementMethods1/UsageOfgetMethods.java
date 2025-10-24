package webElementMethods1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fb.com");
		driver.navigate().refresh();
		WebElement ele=driver.findElement(By.name("email"));
		String tagName=ele.getTagName();
		String text=ele.getText();
		String attValue=ele.getAttribute("hreef");//not present
		String fontsize=ele.getCssValue("fond-size");
        System.out.println("Tagname of an ele:"+ tagName);
        System.out.println("Tag text of an ele:"+ text);
        System.out.println("Attribute value of data-test id:"+ attValue );
        System.out.println("Fontsize of an element:"+ fontsize);
        driver.quit();
        
	}

}
