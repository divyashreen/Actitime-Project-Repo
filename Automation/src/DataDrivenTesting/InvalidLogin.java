package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url2");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		FileInputStream fis1=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis1);//dont write new workbook because it is interface
		int lastRow=wb.getSheet("invalidLogin").getLastRowNum();
		for (int i=0;i<=lastRow;i++)
		{
			String un=wb.getSheet("invalidLogin").getRow(i).getCell(0).getStringCellValue();//because cell value always 0 here
			String pwd=wb.getSheet("invalidLogin").getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.name("username")).sendKeys(un);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			Thread.sleep(2000);
			
			try {
				driver.findElement(By.className("oxd-userdropdown-taab")).click();
				driver.findElement(By.linkText("Logout")).click();Thread.sleep(2000);
				wb.getSheet("invalidLogin").getRow(i).createCell(2).setCellValue("Pass");
				}
			catch (Exception e) {
				wb.getSheet("invalidLogin").getRow(i).createCell(2).setCellValue("Fail");
				FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
				wb.write(fos);
				wb.close();
			}
			
		}
	}
}
	
		
		

