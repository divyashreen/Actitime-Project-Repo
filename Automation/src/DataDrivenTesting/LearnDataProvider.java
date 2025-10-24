package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import graphql.language.Selection;

public class LearnDataProvider {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.actitime.com login");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Project']")).click();
		driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("Automation");
		Selection s=new select();
		driver.findElement(By.id("ext-gen98")).s.sendKeys("Hdfc-01");
		driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("Assignment");
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		
		
	}

}
