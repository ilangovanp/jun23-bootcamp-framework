package com.bootcamp.framework.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static String[][] readExcelData(String fileName) {
		String[][] data = null;
		XSSFWorkbook workBook;
		try {
			workBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
			XSSFSheet sheet = workBook.getSheetAt(0);
			int rowCount = sheet.getLastRowNum();
			int colCount = sheet.getRow(0).getLastCellNum();
			data = new String[rowCount][colCount];
			for (int i = 1; i < rowCount+1; i++) {
				for (int j = 0; j < colCount; j++) {
					data[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				}
			}
			workBook.close();
		} catch (IOException e) {
			throw new RuntimeException("Unable to find the give "+fileName+" file in the Bootcamp-Framework/data folder due to "+e.getMessage());
		}
		return data;
	}

}