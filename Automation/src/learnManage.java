
import org.openqa.selenium.chrome.ChromeDriver;

public class learnManage {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver=new ChromeDriver();Thread.sleep(2000);
		driver.manage().window().maximize(); Thread.sleep(2000);
		driver.get("https;//www.fb.com");
		driver.manage().deleteAllCookies();Thread.sleep(2000);
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		driver.quit();
	
	}

}
