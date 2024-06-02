package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_multiplecell_rows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f1 = new FileInputStream("D:\\selenium\\class.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(f1);
		XSSFSheet sh = book.getSheet("Sheet1");
		
		//using iterator method to read all the rows and column
		
		Iterator<Row> iterator = sh.rowIterator();
		
		while(iterator.hasNext())
		{
			
			Row row = iterator.next();		
			
			for(int i=0; i<row.getPhysicalNumberOfCells();i++)
			{
				Cell cell = row.getCell(i);
				
				// print the cell value 
				
				System.out.println(i + " "+cell);
			}
			
			
		}
		
		book.close();
		
	}
}