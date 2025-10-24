package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws IOException {
		//We are converting high level data into low level data here
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");//FIS(string)
		Workbook wb=WorkbookFactory.create(fis);
		//setCellValue(String value) will just identify the data present in the cell in low level.
		wb.getSheet("createCustomer").getRow(1).getCell(1).setCellValue("ABC");
		//In order to set the data to an empty cell create a cell using createCell(int index),
		//use setCellValue(String) for set value
		wb.getSheet("createCustomer").getRow(1).getCell(1).setCellValue("Pass");
		//IN ORDER TO CREATE A NEW sheet we use createSheet(String sheetName), 
		//to create a new row, we use createRow(int index)
		wb.createSheet("Sheet4").createRow(0).createCell(0).setCellValue("RCB");
		//In order to convert Low level langauge to high level we create object of FileOutputStream
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");//FOS(String)
		// To write the high level data into the actual excel file we use write(outPut fos)
		
		wb.write(fos);
		wb.close();

	}
;
}
