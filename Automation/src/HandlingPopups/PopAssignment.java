package HandlingPopups;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PopAssignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		driver.findElement(By.id("fullName")).sendKeys("Divyashree");
		driver.findElement(By.id("emailId")).sendKeys("Divyashree@STUDENT");
		driver.findElement(By.id("password")).sendKeys("Divyananjesh@05");
		driver.findElement(By.id("mobile")).sendKeys("7899636406");
		WebElement city=driver.findElement(By.id("city"));
		
		Select s=new Select(city);
		s.selectByValue("bg");
		
		File f= new File("./Resume/Divyashree Resume..pdf");
		String absPath=f.getAbsolutePath();
		driver.findElement(By.id("resume")).sendKeys(absPath);
		
		WebElement skills=driver.findElement(By.xpath("//label[text()='Enter your skills']/following::select"));
		Select s1
		=new Select(skills);
		List<WebElement> allopt=s1.getOptions();
		
		int count=allopt.size();
		for(WebElement alloptions:allopt)
		{
			alloptions.click();
		}
		driver.findElement(By.id("alert")).click();
		driver.findElement(By.xpath("//button[text()='Create Profile']")).click();
		
		driver.quit();

	}

}
