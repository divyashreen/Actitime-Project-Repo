package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfLocation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement element=driver.findElement(By.name("login"));
		element.click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div[contains(text(),'email address')]"));
		
		
		String text=ele.getText();
		System.out.println(text);
		String color1=ele.getCssValue("color");
		System.out.println(color1);
		
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Sign Up']"));
		String attvalue=ele1.getAttribute("title");
		System.out.println(attvalue);
		
		driver.quit();
		
		

	}

}