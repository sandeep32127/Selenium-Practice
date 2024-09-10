package com.selemiun.practice;

import java.io.IOException;
import java.util.Arrays;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workBook = new XSSFWorkbook("./Data/Demo1.xlsx");
		XSSFSheet sheet = workBook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		
		System.out.println("The row numbers : " + lastRowNum + "The cell numbers : "+lastCellNum);
		
		String[][] data = new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				data[i-1][j] = cellValue;
			}
		}
		
		System.out.println(Arrays.toString(data));
		workBook.close();
	}
}
