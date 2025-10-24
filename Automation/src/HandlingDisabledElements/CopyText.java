package HandlingDisabledElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("file:///C:/Users/USER/Desktop/UN.html");//copy the path from html created using notepad
		driver.findElement(By.id("un")).sendKeys("admin");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('pwd').value='manager'");
		

	}

}
//create html first, validate in console,//result in html UN PWD