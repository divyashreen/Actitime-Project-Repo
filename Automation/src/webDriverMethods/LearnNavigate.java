package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNavigate {

	public static void main(String[] args) {
		 
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.fb.com");
			driver.navigate().to("https://www.instagram.com");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			driver.close();
			//driver.quit();
			
				

			}

	

}
