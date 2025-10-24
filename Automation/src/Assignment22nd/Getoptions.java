package Assignment22nd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoptions {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();	
	driver.get("https://demoapps.qspiders.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	driver.findElement(By.xpath("//a[linkText()='Multi Select']")).click();
	 
	WebElement options=driver.findElement(By.id("select-multiple-native"));
	Select s=new Select(options);
	List<WebElement> allEle=s.getOptions();
	
	int count=allEle.size();
	for(int i=0;i<=count-1;i++) {
		s.selectByIndex(i);
	}
	for(int i=count-1;
			i>=0;i--)
	{s.deselectByIndex(i);
	}
	driver.quit();
	}
}
	
	
