package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsAssign1 {
	public static void main(String [] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().to("https://facebook.com");
	Thread.sleep(2000);
	List<WebElement> allElements=driver.findElements(By.xpath("//a[@href]"));
	for(WebElement WebElements:allElements)
	{
		System.out.println(WebElements.getText());
	
	}
	int count=allElements.size();
	System.out.println(count);
	driver.quit();
	}
		
		

}
