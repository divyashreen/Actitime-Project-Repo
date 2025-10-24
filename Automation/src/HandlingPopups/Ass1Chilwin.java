package HandlingPopups;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1Chilwin {public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the title:");
	String titletext=s.next();
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();       
	driver.findElement(By.xpath("//h2[text()='Laptop']/following-sibling::button")).click();
	Set<String> allwin = driver.getWindowHandles();
	for(String allwindows:allwin)
	{driver.switchTo().window(allwindows);

	String title=driver.getTitle();
	if(title.contains(titletext)) {
		driver.close();
	}
	System.out.println(title);
	}

}
}