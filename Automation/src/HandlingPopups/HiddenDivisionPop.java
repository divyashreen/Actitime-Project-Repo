package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		
		Select s=new Select(year);
		s.selectByValue("2000");
		
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select s1=new Select(month);
		s1.selectByValue("4");
		
		driver.findElement(By.xpath("//a[@data-date='22']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
		driver.findElement(By.id("renew_policy_submit")).click();
		
		WebElement text = driver.findElement(By.id("policynumberError"));
		//directly or with the help of variable creation
		System.out.println(text.getText());
        driver.quit();

		
	}

}
