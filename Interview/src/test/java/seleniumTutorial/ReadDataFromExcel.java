package seleniumTutorial;
//Logic: Create object of current class and pass file path as argument to its parameterized constructor.
//Define instance variables.
//Invoke constructor and initialize object of FileInputStream class and pass FileInputStream object to XSSFWorkbook class constructor.
//Now call the function from main method
//Call getSheet() method on workbook and pass sheet name as argument.
//Call rowIterator method on sheet and iterate through rows.
//Store the first row reference in XSSF row variable.
//On first row call cell iterator on XSSF row variable and iterate on each cell in that row.
//Store the first cell reference in XSSF cell variable.
//Compare the cell value using getCellType method of XSSFCell class with CELL_TYPE_STRING variable of CELL interface. Note: XSSFCell implements CELL interface
//Print value for string, numeric and boolean values.
//Print a new line after all cells are iterated in that row.
//Iterate through next row and repeat till all rows are complete.

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
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
		Iterator<Row> rowsitr = sheet.rowIterator();
		while (rowsitr.hasNext()) {
			row = (XSSFRow) rowsitr.next();

			// Iterating all the cells of the current row
			Iterator<Cell> cellsitr = row.cellIterator();

			while (cellsitr.hasNext()) {
				cell = (XSSFCell) cellsitr.next();

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
