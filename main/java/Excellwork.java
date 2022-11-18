import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellwork {

	public static void main(String[] args) throws IOException {
		File f = new File ("C:\\Excell\\facebookuser.xlsx");
		FileInputStream in = new FileInputStream(f);
		Workbook W = new XSSFWorkbook(in);
		Sheet s=W.getSheet("Sheet1");
		Row r=s.getRow(1);
		Cell cell = r.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
		// TODO Auto-generated method stub

	}

}
