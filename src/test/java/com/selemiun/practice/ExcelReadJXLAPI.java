package com.selemiun.practice;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReadJXLAPI {

	public static void main(String[] args) {
		
		File file = new File("./Data/Demo2.xls");
		
		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(file);
		} catch (BiffException | IOException e) {
			e.printStackTrace();
		}
		
		Sheet sheet = workbook.getSheet(0);
		int rows = sheet.getRows();
		int columns = sheet.getColumns();
		
		HashMap<String, HashMap<String, String>> result = new HashMap<String, HashMap<String,String>>(rows-1);
		
		for (int i = 1; i < rows; i++) {
			HashMap<String, String> testData = new HashMap<String, String>();
			for (int j = 0; j < columns; j++) {
				testData.put(sheet.getCell(j, 0).getContents(), sheet.getCell(j, i).getContents());
			}
			result.put(sheet.getCell(0, i).getContents(), testData);
		}
		
		System.out.println(result);

	}

}
