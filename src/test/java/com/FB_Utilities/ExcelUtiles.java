package com.FB_Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtiles {

	private String filePath;
	private String sheetName;

	public ExcelUtiles(String filePath, String sheetName) {
		super();
		this.filePath = filePath;
		this.sheetName = sheetName;

	}

	public String getstringCellData(int rowNum, int colNum) {

		String cellData = null;
		try {
			FileInputStream fis = new FileInputStream(filePath);
			Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell column = row.getCell(colNum);
			cellData = column.getStringCellValue();
			System.out.println(cellData);
			fis.close();

		} catch (IOException | EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cellData;
	}

	public double getNumericCellData(int rowNum, int colNum) {

		double cellData = 0.0;
		try {
			FileInputStream fis = new FileInputStream(filePath);
			Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell column = row.getCell(colNum);
			cellData = column.getNumericCellValue();
			System.out.println(cellData);
			fis.close();

		} catch (IOException | EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cellData;

	}

	public static void main(String[] args) {
		String filePath = "src/test/resources/data.xlsx";
		String sheetName = "sheet1";
		ExcelUtiles ex = new ExcelUtiles(filePath, sheetName);
		ex.getstringCellData(1, 0);
		ex.getstringCellData(1, 1);
		ex.getstringCellData(1, 2);
		ex.getstringCellData(1, 3);
		ex.getstringCellData(1, 4);
		ex.getstringCellData(1, 5);
		ex.getstringCellData(1, 6);
		ex.getstringCellData(1, 7);
		// ex.getstringCellData(1, 8);
	}

}
