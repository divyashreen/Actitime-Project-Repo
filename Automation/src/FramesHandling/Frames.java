package FramesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/USER/Desktop/username.html");
        WebElement un = driver.findElement(By.id("un"));Thread.sleep(2000);
        un.sendKeys("admin");
        driver.switchTo().frame("single_frame");
        WebElement pwd = driver.findElement(By.id("pwd"));Thread.sleep(2000);
        pwd.sendKeys("manager");
driver.switchTo().frame(0);
WebElement email = driver.findElement(By.id("email"));Thread.sleep(2000);
email.sendKeys("admin");
	driver.switchTo().parentFrame();Thread.sleep(2000);
	pwd.sendKeys("@456");
	WebElement nestedframe = driver.findElement(By.name("nested_frame"));
	driver.switchTo().frame(nestedframe);Thread.sleep(2000);
	email.sendKeys("@gmail.com");
	driver.switchTo().defaultContent();Thread.sleep(2000);
	un.sendKeys("123");
driver.quit();
	


	}

}
