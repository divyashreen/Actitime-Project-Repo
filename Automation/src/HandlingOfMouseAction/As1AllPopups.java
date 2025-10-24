package HandlingOfMouseAction;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class As1AllPopups {public static void main(String[] args) {

ChromeOptions notify=new ChromeOptions();

notify.addArguments("disable-notifications");
 WebDriver driver = new ChromeDriver(notify);

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://pib.gov.in");

WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));

wait.until(ExpectedConditions.alertIsPresent());

WebElement ele = driver.findElement(By.linkText("Ministry of Education"));

driver.switchTo().alert().accept();

Actions a= new Actions(driver);

a.scrollToElement(ele).perform();

ele.click();

driver.switchTo().alert().accept();

Set<String> allwindows= driver.getWindowHandles();

for (String allwin:allwindows) {

driver.switchTo().window(allwin);


String title= driver.getTitle();

if(!title.contains("Home"))

System.out.println(title);

}
}
}
