package javastreamsapachepoi;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


//This requires some downloaded jar files to be added to the project.

public class ReadingExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		//input file stream
		File f = new File("c:\\new.xls");
		
		//connecting to input stream
		FileInputStream fi = new FileInputStream(f);
		
		//connecting workbook to input stream
		Workbook workbook = WorkbookFactory.create(fi);
		
		//get the first sheet
//		org.apache.poi.ss.usermodel.Sheet sheet0 = workbook.getSheetAt(0); // If you weren't listing the import at the top, you could list it like this instead.
		Sheet sheet0 = workbook.getSheetAt(0);
		
		//get the first row
		Row row0 = sheet0.getRow(0);
		
		//get the first cell
//		Cell cell0 = row0.getCell(0);
//		Cell cell1 = row0.getCell(1);
//		Cell cell2 = row0.getCell(2);
//		
//		System.out.println("cell 0 is=--> "+cell0+" cell 1 is -->"+cell1
//		+" cell 2 is -->" + cell2);
		
//		This is an enhanced for loop:
		for(Row row : sheet0) {
			for(Cell cell: row) {
				switch(cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.println("Blank Cell"+"\t");
					break;
				}
			}
			
//			System.out.println();
		}

	}

}
