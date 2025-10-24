import java.io.Closeable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();Thread.sleep(2000);	
driver.close();}

}
