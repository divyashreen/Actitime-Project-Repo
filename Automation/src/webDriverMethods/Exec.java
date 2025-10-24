package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exec {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Demo.test(driver);
		WebDriver driver1=new EdgeDriver();
		Demo.test(driver1);
		WebDriver driver2=new FirefoxDriver();
		Demo.test(driver2);

	}

}
