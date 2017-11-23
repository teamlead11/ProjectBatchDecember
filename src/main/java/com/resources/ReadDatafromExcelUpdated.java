package com.resources;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatafromExcelUpdated {
	static List<HashMap<String, String>> configDetails;
	static List<HashMap<String, String>> guestManagement;
	static List<HashMap<String, String>> propertyList;
	static List<HashMap<String, String>> rateManagment;

	public static HashMap<String, HashMap<String, String>> data(String filepath, String sheetName) {
		HashMap<String ,HashMap<String, String>> mydata = new HashMap<String, HashMap<String,String>>();
		try {
			FileInputStream fs = new FileInputStream(filepath);
 			XSSFWorkbook workbook = new XSSFWorkbook(fs);
 			XSSFSheet sheet = workbook.getSheet(sheetName);
 			Row HeaderRow = sheet.getRow(0);
 			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
 				Row currentRow = sheet.getRow(i);
 				HashMap<String, String> currentHash = new HashMap<String, String>();
 				for (int j = 0; j <HeaderRow.getPhysicalNumberOfCells() ; j++) {
					Cell currentCell = currentRow.getCell(j);
					try {
							currentCell.getCellType();
							switch (currentCell.getCellType()) {
								case Cell.CELL_TYPE_STRING:
									currentHash.put(HeaderRow.getCell(j).getStringCellValue(),
									currentCell.getStringCellValue());
									break;
								case Cell.CELL_TYPE_NUMERIC:
									currentHash.put(HeaderRow.getCell(j).getStringCellValue(),String.valueOf(currentCell.getNumericCellValue()));
									break;
								case Cell.CELL_TYPE_BLANK:
									currentHash.put(HeaderRow.getCell(j).getStringCellValue(),"null");
									break;
							}
						} catch (NullPointerException e) {
								currentHash.put(HeaderRow.getCell(j).getStringCellValue(), "null");
					}
				}
				mydata.put("test", currentHash);
			}
			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mydata;
	}

}