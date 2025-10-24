package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//We are converting high level data into low level data here
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");//FIS(string)
	//create (input fis) will create Workbook interface type object and
	//also load the low level data into the workbook using fis variable and 
	//also calling static crate method present inside workbookfactory class
	Workbook wb=WorkbookFactory.create(fis);
	//using wb reference we use getSheet(string sheetName) to get the particular sheet.
	//using sheet reference we call getRow(int index) to get the perticular row.
	//using Row reference we call getCell(int index) to get the particular cell.
	//using cell reference we call getStringCellValue() to get th string data.
	String value=wb.getSheet("createCustomer").getRow(1).getCell(2).getStringCellValue();
	System.out.println(value);
	
	

	}

}
