package webElementMethods1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocator3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/users/qspid/Desktop/Demo.html");
		WebElement ele=driver.findElement(By.tagName("a"));
		ele.click();
		driver.navigate().back();
		WebElement ele1=driver.findElement(By.id("d2"));
		ele1.click();
		driver.navigate().back();
		WebElement ele2=driver.findElement(By.name("n1"));
		ele2.click();
		driver.navigate().back();
		driver.findElement(By.className("c2")).click();
		//WebElement ele3=driver.findElement
		         //    ele3.click();
		driver.quit();
	
		

	}

}
