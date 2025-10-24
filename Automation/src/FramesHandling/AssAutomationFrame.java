package FramesHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssAutomationFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Register.html");
		 WebElement swtch = driver.findElement(By.className("dropdown-toggle"));
		 swtch.click();
		 Actions a=new Actions(driver);// we create actions class to create object for mouse action.
		 //here we click on switch to and move the cursor till we find elemnt that is frames.
		 a.moveToElement(swtch).perform();
		
		 driver.findElement(By.xpath("//a[text()='Frames']")).click();
		 
		 

	}

}
