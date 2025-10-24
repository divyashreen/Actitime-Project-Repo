package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Instagram {

		@Test
		public void login() throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.instagram.com/");Thread.sleep(1000);
			String actualTitle=driver.getTitle();
			String expectedTitle="Instagram";
			SoftAssert s=new SoftAssert();
			s.assertEquals(actualTitle, expectedTitle);
			driver.findElement(By.name("username")).sendKeys("whatever");Thread.sleep(1000);
			driver.findElement(By.name("password")).sendKeys("whatever");Thread.sleep(1000);
			WebElement ele=driver.findElement(By.xpath("//button[@type='submit']"));
			boolean enable=ele.isEnabled();
			s.assertTrue(enable);
			driver.quit();
			s.assertAll();
		}
	
		
	}


