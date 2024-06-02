package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f1 = new FileInputStream("D:\\selenium\\class.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(f1);
		XSSFSheet sh = book.getSheetAt(0);
		
		System.out.println(sh.getRow(0).getCell(0));
		System.out.println(sh.getRow(1).getCell(0));
		System.out.println(sh.getRow(2).getCell(0));
		book.close();
		
		
	}

}
