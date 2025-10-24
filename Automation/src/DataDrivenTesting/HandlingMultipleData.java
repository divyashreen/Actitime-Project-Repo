package DataDrivenTesting;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingMultipleData {

	public static void main(String[] args) {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		//getLastRowNum() is used to get the index of the last row containing
		int lastRow=wb.getSheet("invalidData").getLastRowNum();
		for(int i=0;i<=lastRow;i++)
		{//In order to iterate rows in the sheet
			short lastCell=wb.getSheet("invalidData").getRow(i).getLastCellNum();
			for(int j=0;j<lastCell;j++)
			{// Inorder to iterate cell in a row
				String data=wb.getSheet("invalidData").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		
		

	}

}
