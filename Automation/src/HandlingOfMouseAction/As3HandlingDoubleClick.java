package HandlingOfMouseAction;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class As3HandlingDoubleClick {
		public static void main(String[] args) throws AWTException, InterruptedException   {

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();

		driver.findElement(By.xpath("//section [text()='Button']")).click();

		driver.findElement(By.linkText("Double Click")).click();

		Actions a=new Actions (driver);

		WebElement doubleclick = driver.findElement(By.id("btn_a"));

		a.doubleClick(doubleclick).perform();

		boolean displayed=doubleclick.isDisplayed();

		System.out.println(displayed);

	}

}
