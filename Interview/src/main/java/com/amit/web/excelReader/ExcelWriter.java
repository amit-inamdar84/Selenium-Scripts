package com.amit.web.excelReader;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
//When interacting with excel we first use workbook, then sheet, the row and next cell
	//Declare instance variables from XSSF POI library
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	public void writeXLS(String sheetName) {
		//Create object of workbook
		workbook = new XSSFWorkbook();
		//On workbook object call the createSheet method to create a new sheet.
		sheet = workbook.createSheet(sheetName);
		
        //Create a treemap to store key value pair.
		//This treemap is of type string and object array which can hold data of any type and multiple values.
		//If we use string data type for values it will hold only one value and only string data. If we use string array it will hold multiple value of string type
		//Likewise object array allows to hold multiple values of any type.
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] { "ID", "Name", "Lastname" });
		data.put("2", new Object[] { "1", "Amit", "Inamdar" });
		data.put("3", new Object[] { "2", "Test", "Final" });
		data.put("4", new Object[] { "3", "Amit1", "Inamdar" });
		data.put("5", new Object[] { "4", "TCE", "Gadag" });
        
		//keySet method provides a set view of keys
		Set<String> keySet = data.keySet();
		//rowNum is required to create 1,2..nth row.
		int rowNum = 0;
		//loop through keys one by one using for each loop
		for (String key : keySet) {
			//create nth row on reference of sheet and increment i.
			row = sheet.createRow(rowNum++);
			//We have row now. We need column data and need to create multiple cells under the nth row.
			//Using get method fetch value of a key and assign to object array since value is of type object array.
			Object[] objArr = data.get(key);
			//colNum is required to create 1,2..nth column/cell.
			int colNum = 0;
			//For each object in object array loop through
			for (Object obj : objArr) {
				//Create a new cell on reference of nth row and colNum and increment it.
				cell = row.createCell(colNum++);
				//If object in the array is an instance of String class, set the cells value to String type.
				if (obj instanceof String) {
					cell.setCellValue((String) obj);
				}
				if (obj instanceof Integer) {
					cell.setCellValue((int) obj);
				}
			}
			try {
				//Create a file output stream to connect code with excel. Provide the path where new file should be created.
				FileOutputStream out = new FileOutputStream(new File("D:\\Git\\Interview\\src\\main\\java\\com\\amit\\web\\testData\\writeData.xlsx"));
				workbook.write(out);
				out.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Data written to excel sheet successfully");
	}

	public static void main(String[] args) {
		//Create object of class, call method and pass sheet name.
		ExcelWriter xls = new ExcelWriter();
		xls.writeXLS("Test");
	}

}
