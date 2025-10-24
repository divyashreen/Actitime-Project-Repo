package webElementMethods1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocator1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/users/qspid/Desktop/Demo.html");
		WebElement ele=driver.findElement(By.tagName("a"));
		ele.click();
		

	}

}
