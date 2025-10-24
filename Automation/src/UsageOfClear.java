import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClear {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opensourcebilling.org/en/portal/clients/sign-in");
		driver.findElement(By.xpath("//label[text()='keep me signed in']")).click();
		driver.findElement(By.id("email")).clear();
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
	

	}

}
