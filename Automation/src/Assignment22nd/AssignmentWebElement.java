package Assignment22nd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWebElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.navigate().refresh();
		
		WebElement element=driver.findElement(By.linkText("Create a Page") );
		
		String tagName=element.getTagName();
		System.out.println(tagName);
			
		String tagText=element.getText();
		System.out.println(tagText);
		
		String href=element.getAttribute("href");
		System.out.println(href);
		
		String fontWeigh=element.getCssValue("font-weight");
		System.out.println(fontWeigh);
		
		
		
		
	}

}
