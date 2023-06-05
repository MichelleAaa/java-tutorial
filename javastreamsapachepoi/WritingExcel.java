package javastreamsapachepoi;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//This requires some jar files to be downloaded and added to the project

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//creating work book
		XSSFWorkbook workbook = new XSSFWorkbook();
		//create sheet on the workbook , the HSSFSheet have private constructor
		XSSFSheet sheet0 = workbook.createSheet("first sheet");
		
		//create row in sheet1
		Row row0 = sheet0.createRow(0);
		
		//create cell in row 0
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		
		//setting cell value
		cellA.setCellValue("First cell");
		cellB.setCellValue("Second cell");

//		Or instead, you could loop over the cells:
		for(int rows = 0; rows < 10; rows++) {
			Row row = sheet0.createRow(rows);
			for(int cols=0; cols<10; cols++){
				Cell cell = row.createCell(cols);
				cell.setCellValue((int)Math.random()*100);
			}
		}
		
		//creating file stream
		File f = new File("c:\\filewriting\\new.xlsx");
		
		//chaining output stream to path
		FileOutputStream fo = new FileOutputStream(f);
		
		//Writing workbook to output stream
		workbook.write(fo);
		
		//closing stream
		fo.close();
		
		System.out.println("excel file created");

	}

}
