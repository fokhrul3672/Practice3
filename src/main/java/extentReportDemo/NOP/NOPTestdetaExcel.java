package extentReportDemo.NOP;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class NOPTestdetaExcel {
	@SuppressWarnings({ "resource", "unused" })
	public  String[] readfile() throws IOException {
		File f = new File("C:\\Users\\fokhrul1755\\eclipse-workspace\\SeleniumBasics\\CucumberFamework\\src\\main\\java\\Utilities\\LoginDominos.xls");
		FileInputStream fis = new FileInputStream(f);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sht = workbook.getSheetAt(0);
		Row r=sht.getRow(0);
		Cell c = r.getCell(0);
		String uname = sht.getRow(1).getCell(0).getStringCellValue();
		 String pwd = sht.getRow(1).getCell(1).getStringCellValue();
		 String uname2 = sht.getRow(2).getCell(0).getStringCellValue();
		 String pwd2 = sht.getRow(2).getCell(1).getStringCellValue();
		 
		String[] data = new String[6];
		data[0]= uname;
		data[1]= pwd;
		data[2]= uname2;
		data[3]= pwd2;
		
		return data;
	}
	
}
