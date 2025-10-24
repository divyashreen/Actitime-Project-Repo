package DataDrivenTesting;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataHandling {

	public static void main(String[] args) {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int row=wb.getSheet("MultipleData").getLastRowNum();
		for(int i=0;i<=row;i++) {
			String data=wb.getSheet("MultipleData").getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		}
		short cell=wb.getSheet("MultipleData").getRow(0).getLastCellNum();
		for(int j=0;j<cell;j++) {
			String data=wb.getSheet("MultipleData").getRow(0).getCell(j).getStringCellValue();
			System.out.println(data);
		}
		int lastRow=wb.getSheet("MultipleData").getLastRowNum();
		for(int i=0;i<=lastRow;i++)
		{
			short lastCell=wb.getSheet("MultipleData").getRow(i).getLastCellNum();
			for(int j=0;j<lastcell;j++)
		{
		String data=wb.getSheet("MultipleData").getRow(i).getCell(j).getStringCellValue();
		System.out.println(data+" ");
			}
			System.out.println();
		}

	}

}
