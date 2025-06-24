package com.utility;

import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static String readParticularCellData(int rowvalue, int cellvalue) {
		String data = null;
		
		try {
			File file = new File("C:\\Users\\selfl\\OneDrive\\Documents\\DataDriven_JAN.xlsx");
			Workbook book = new XSSFWorkbook(file);
			Sheet sheet = book.getSheet("Sheet2");
			Row row = sheet.getRow(rowvalue);
			Cell cell = row.getCell(cellvalue);
			DataFormatter dataformat = new DataFormatter();
			data = dataformat.formatCellValue(cell);
			System.out.println(data);
						
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return data;
	}
	
	public static void main(String[] args) {
		readParticularCellData(0, 0); // Example call
	}
}
