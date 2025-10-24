package HandlingPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopu {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		//we have to release control other it gives different behaviour with the combination of functional key.
		Thread.sleep(2000);
		//To synchronize it is mandatory to add sleep here
		r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
		//To synchronize it is mandatory to add sleep here
		r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
		//To synchronize it is mandatory to add sleep here
		
		for(int i=0;i<4;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
			
		}
		r.keyPress(KeyEvent.VK_1);Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_MINUS);Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_2);Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		
	}

}
