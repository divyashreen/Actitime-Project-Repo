package webDriverMethods;

import org.openqa.selenium.WebDriver;

public class Demo {

	public static void test(WebDriver driver)
	{driver.manage().window().maximize();
	driver.get("https://www.google.com");
	String title=driver.getTitle();
	System.out.println(title);
	
	//getpagesource() is used to get the source code of current web.
	
	String pgsrc=driver.getPageSource();
	driver.quit();
	}

}
