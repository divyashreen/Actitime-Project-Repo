package HandlingPopups;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssChilorTab {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://online.actitime.com/tyss/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[@onclick='openHelpAndSupportMenu(event)']")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Read Service Agreement"))).click();
		
		Set<String> allwid = driver.getWindowHandles();
		//40-44 lines can write like this
		Iterator<String> itr = allwid.iterator();
		String pwid = itr.next();
		String cwid = itr.next();
		driver.switchTo().window(cwid);
		driver.findElement(By.xpath("//button[contains(text(),' Accept')]")).click();//==to accept cookies
		
		//for(String wid:allwid)
		//	{
		//driver.switchTo().window(wid);
		//}
	//System.out.println(driver.getTitle());
	
	 List<WebElement> allHeadings = driver.findElements(By.tagName("h2"));
	 
	 int count=allHeadings.size();
	 
	 for (int i=count-1;i>0;i--)
	 {
		 //String headings = allHeadings.get(i).getText();
		 //System.out.println(headings);
		 
		 
		 WebElement each=allHeadings.get(i);
		 System.out.println(each.getText());
	}
		
		}
}
