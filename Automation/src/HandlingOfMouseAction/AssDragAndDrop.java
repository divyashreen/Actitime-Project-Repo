package HandlingOfMouseAction;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssDragAndDrop {

	public static void main(String[] args) throws AWTException, InterruptedException   {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		WebElement webele = driver.findElement(By.xpath("//section[text()='Text Field']"));
		WebElement element = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		
		Actions a=new Actions(driver);Thread.sleep(2000);
		a.moveToElement(webele).perform();
		a.scrollToElement(element).perform();
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		WebElement MobileAccess = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement LaptopAccess = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		 List<WebElement> allele = driver.findElements(By.className("draggable"));
		 int count=allele.size();
		 System.out.println(count);
		 for(WebElement allelements:allele)
		 { String text = allelements.getText();
		 
		 
		 }
		 
	}}
