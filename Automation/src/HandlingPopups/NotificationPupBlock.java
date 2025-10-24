package HandlingPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPupBlock 
{
	public static void main(String[] args) throws AWTException, InterruptedException   {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='Experience the seamless interactions and responsive designs']")).click();
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.xpath("//section[text()='Notifications']")).click();
	driver.findElement(By.id("browNotButton")).click();
	
	Robot r=new Robot(); Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_ENTER);
		

}
}