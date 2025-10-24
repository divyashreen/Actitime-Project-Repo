package HandlingOfMouseAction;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class As4MyntraMouseEvents {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
	WebElement element=driver.findElement(By.xpath("//div[@class='desktop-navLink']/child::a[text()='Men']"));
	Actions a=new Actions(driver);
	a.moveToElement(element).perform();
	driver.findElement(By.linkText("Sneakers")).click();
	WebElement scrollbar=driver.findElement(By.id("rootRailThumbRight"));
	a.clickAndHold(scrollbar).moveByOffset(-85, 0).release().perform();
	
	driver.findElement(By.xpath("//div[@class='product-productMetaInfo']/child::h4[text()='Men Textured Sneakers']")).click();
	
	Set<String> allwid=driver.getWindowHandles();
	for (String wid:allwid)
	{driver.switchTo().window(wid);
	
	}
	driver.findElement(By.name("pincode")).sendKeys("571426");
	driver.findElement(By.xpath("//input[@type='submit']")).submit();
	String text = driver.findElement(By.xpath("//h4[contains(text(),'Get it by')]")).getText();
	System.out.println(text);
	
	driver.quit();
	
	

	}

}
