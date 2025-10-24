package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver() ;
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.get("https://www.facebook.com/");Thread.sleep(2000);
		driver.navigate().refresh();Thread.sleep(2000);
		WebElement ele=driver.findElement(By.name("login"));
		String text=ele.getText();
		String attValue=ele.getAttribute("href");
		System.out.println("Tag text of ele:"+text);
		System.out.println("Attribute value of data-sign up:"+attValue);Thread.sleep(2000);
		driver.quit();
	
			

	}

}
