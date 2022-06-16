package com.actitime.tyss.datadriventesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet 
{
   public static void main(String[] args) throws Throwable {
	FileInputStream fis= new FileInputStream("./src/test/resources/testcasespecific.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("Sheet1");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(2);
	String url = cell.getStringCellValue();
	System.out.println(url);
	workbook.close();
}
}
