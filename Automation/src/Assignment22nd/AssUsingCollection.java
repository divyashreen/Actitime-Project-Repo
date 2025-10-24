package Assignment22nd;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssUsingCollection {

	public static void main(String[] args, Object value) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.navigate().refresh();
		driver.findElement(By.linkText("Create new account")).click();
		WebElement month=driver.findElement(By.id("month"));
		
		Select s=new Select(month);
		List<WebElement> allopts=s.getOptions();
		List<String> alloptInList=new ArrayList<String>();
		int count=allopts.size();
		//s.select(ByIndex(count-2);
		for(int i=0;i<count;i++)
		{WebElement ele=allopts.get(i);
		String text=ele.getText();
		//ele has address
		if(text.equals(value))
		{
		System.out.println(text+"is present");
		}
		
		alloptInList.add(text);
		}
		Collections.sort(alloptInList);
		for(String text:alloptInList)
		{System.out.println(text);
		
		}
	}

}
