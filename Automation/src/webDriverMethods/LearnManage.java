package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnManage {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//Options opt=driver.manage();
	//Window win=opt.window();
	
	//driver.manage().window().maximize();Thread.sleep(2000);
	driver.get("https://www.fb.com");
	driver.manage().deleteAllCookies();Thread.sleep(2000);
	driver.manage().window().fullscreen();Thread.sleep(2000);
	driver.manage().window().setSize(new Dimension(200,100));Thread.sleep(2000);
	driver.manage().window().setPosition(new Point(100,100));
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.quit();
	
	
	
		

	}

}
