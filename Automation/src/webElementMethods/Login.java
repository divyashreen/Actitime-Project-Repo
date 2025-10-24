package webElementMethods;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/ssandeep/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		for(int i=0;i<1000;i++)
		{
			//2.Inorder to perform the action until the line will not throw exception.
			try {//1.Inorder to handle the exception and continue the execution.
				driver.findElement(By.id("logoutLink")).click();
				break;//3.To stop the execution after the action has been peformed.line next to abnormal statement only executes when there is no exception.
			}
			catch(NoSuchElementException e)
			//4.import NoSuchElement exception from java.util
			{System.out.println(i);
			
			}
			

	}
	}
}
