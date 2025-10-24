/**
 * 
 */
package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * It is a generic class where we have generic methods to read data from property filr and read and write data into excel file.
 * @author ADMIN
 */
public class FileLib {
	/**
	 * It is a generic method to fetch the data from property file.
	 * @param Key
	 * @return the valuse based on the mentioned key name.
	 * @throws IOException 
	 * @throws IOException
	 */

	public String readPropertyData(String Key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String data=p.getProperty(Key);
	return data;
	}
	/**
	 * It is a generic method to read data from excel file.
	 * @param sheetName @param row @param cell
	 * @return the String data present in the mentioned sheetName, row index and cell index
	 * @throws IOException 
	 * @throws EncryptedDocumentException @throws IOException.
	 */
	
	public String readExcelData(String sheetName,int row,int cell) throws IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
	}
	
	
	/**
	 * It is a generic method to write data into excel file based on the mentioned value to the
	 *  representive sheet,row,cell
	 *  @param sheetName
	 *  @param row
	 *  @param cell
	 *  @param value 
	 * @throws IOException 
	 *  @throws EncryptedDocumentException
	 */
	

public void WriteDataIntoExcel(String sheetName,int row,int cell,String value) throws IOException {
FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(value);
FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
wb.write(fos);
wb.close();

}
}
	
