package HandlingPopups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandTabsorChilWid {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']"));
		driver.findElement(By.linkText("New Tab")).click();
		driver.findElement(By.xpath("//h2[text()='Watches']/following-sibling::button[text()='view more']")).click();
		
		Set<String> allwid= driver.getWindowHandles();//wid=window id
		Iterator<String> itr = allwid.iterator();
		String pwid=itr.next();//pwid=parent window address
		String cwid=itr.next();//cwid=child window address
		
		driver.switchTo().window(cwid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(pwid);
		driver.close();
		driver.switchTo().window(cwid);
		driver.close();
		//driver.switchTo().window(cwid).close();
	}

}
