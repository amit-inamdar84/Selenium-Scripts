package com.amit.web.testscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public FileInputStream fis;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;

	public ReadDataFromExcel(String string) throws IOException {
		fis = new FileInputStream(string);
		workbook = new XSSFWorkbook(fis);
	}

	@SuppressWarnings("deprecation")
	public void readXLSData() {
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Iterator rows = sheet.rowIterator();
		while (rows.hasNext()) {
			row = (XSSFRow) rows.next();

			// Iterating all the cells of the current row
			Iterator cells = row.cellIterator();

			while (cells.hasNext()) {
				cell = (XSSFCell) cells.next();

				if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
					System.out.print(cell.getStringCellValue() + " ");
				} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					System.out.print((int)cell.getNumericCellValue() + " ");
				} else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
					System.out.print(cell.getBooleanCellValue() + " ");

				} else { // //Here if require, we can also add below methods to
							// read the cell content
							// XSSFCell.CELL_TYPE_BLANK
							// XSSFCell.CELL_TYPE_FORMULA
							// XSSFCell.CELL_TYPE_ERROR
				}
			}
			System.out.println();
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		ReadDataFromExcel xls = new ReadDataFromExcel("D:\\Git\\Interview\\Test Data.xlsx");
		xls.readXLSData();

	}

}
