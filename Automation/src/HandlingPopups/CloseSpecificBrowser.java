package HandlingPopups;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

final class CloseSpecificBrowser {

	public static void main(String[] args) throws InterruptedException {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the title");
    String text=s.next();
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://secure.indeed.com/");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	Thread.sleep(2000);
	
	Set<String> allWid = driver.getWindowHandles();
	for(String wid:allWid)
	{
		driver.switchTo().window(wid);//accepts one address at a time
		String title=driver.getTitle();
		System.out.println(driver.getTitle());
		
if(title.contains(text))
		{
    driver.close();//It will close the specific window
    break;//It will transfer the control to the specific window

}

}
	System.out.println(driver.getTitle());
	}
}
