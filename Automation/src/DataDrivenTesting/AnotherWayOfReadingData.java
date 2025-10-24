package DataDrivenTesting;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AnotherWayOfReadingData {

	public static void main(String[] args) {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		s=wb.getSheet("createCustomer").

	}

}
