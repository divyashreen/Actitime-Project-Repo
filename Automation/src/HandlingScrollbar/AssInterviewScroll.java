package HandlingScrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssInterviewScroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Point ele = driver.findElement(By.xpath("//h2[text()='About redBus']")).getLocation();
		Thread.sleep(2000);
		int yaxis=ele.getY();
		js.executeScript("window.scrollTo(0,"+yaxis+")");
			
		

	}

}
