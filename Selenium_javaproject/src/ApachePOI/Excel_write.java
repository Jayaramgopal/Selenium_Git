package ApachePOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("D:\\selenium\\class.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sh = book.getSheetAt(2);
		
		Row row = sh.createRow(1);
		Cell cell = row.createCell(3);
		cell.setCellValue("Write in excel");
		
		Row row1 = sh.createRow(2);
		Cell cell1 = row1.createCell(3);
		cell1.setCellValue("Jayaram");
	
		
		FileOutputStream fos = new FileOutputStream("D:\\\\selenium\\\\class.xlsx");
		fos.close();
		book.close();
		
		
		
		
	}

}
