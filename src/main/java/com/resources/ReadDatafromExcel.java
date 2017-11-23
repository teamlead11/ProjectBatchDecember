package com.resources;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatafromExcel {
	static List<HashMap<String, String>> configDetails;
	static List<HashMap<String, String>> guestManagement;
	static List<HashMap<String, String>> propertyList;
	static List<HashMap<String, String>> rateManagment;
	static List<HashMap<String, String>> ConfigurationFinancial; 
	static List<HashMap<String, String>> ConfigInventoryManagement;
	static List<HashMap<String, String>> OOO;
	static List<HashMap<String, String>> PaymentCredentials;
	static List<HashMap<String, String>> GuestFolio;
	static List<HashMap<String, String>> WakeUpcall;
	static List<HashMap<String, String>> ConfigurationReservation;
		
	public static List<HashMap<String, String>> data(String filepath, String sheetName) {
		List<HashMap<String, String>> mydata = new ArrayList<>();
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
				mydata.add(currentHash);
			}
			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mydata;
	}

	public static List<HashMap<String, String>> dataMap(String sheetName) {
		switch (sheetName) {
			case "configDetails":
				configDetails = ReadDatafromExcel.data("src/test/resources/testdata/Examples.xlsx", "Configuration");
				return configDetails;
			case "Availability":
				configDetails = ReadDatafromExcel.data("src/test/resources/testdata/Examples.xlsx", "Availability");
				return configDetails;
			case "GuestManagement":
				guestManagement = ReadDatafromExcel.data("src/test/resources/testdata/Examples.xlsx", "GuestManagement");
				return guestManagement;
			case "PropertyList":
				propertyList = ReadDatafromExcel.data("src/test/resources/testdata/Examples.xlsx", "PropertyList");
				return propertyList;
			case "RateManagment":
				rateManagment = ReadDatafromExcel.data("src/test/resources/testdata/Examples.xlsx", "RateManagment");
				return rateManagment;
			case "ConfigurationFinancial":
				ConfigurationFinancial = ReadDatafromExcel.data("src/test/resources/testdata/Examples.xlsx", "ConfigurationFinancial");
				return ConfigurationFinancial;
			case "ConfigInventoryManagement":
				ConfigInventoryManagement = ReadDatafromExcel.data("src/test/resources/testdata/Examples.xlsx", "ConfigInventoryManagement");
				return ConfigInventoryManagement;
			case "OOO":
				OOO = ReadDatafromExcel.data("src/test/resources/testdata/Examples.xlsx", "OOO");
				return OOO;
			case "PaymentCredentials":
				PaymentCredentials = ReadDatafromExcel.data("src/test/resources/testdata/Examples.xlsx", "PaymentCredentials");
				return PaymentCredentials;
			case "GuestFolio":
				GuestFolio = ReadDatafromExcel.data("src/test/resources/testdata/Examples.xlsx", "GuestFolio");
				return GuestFolio;
			case "WakeUpcall":
				WakeUpcall = ReadDatafromExcel.data("src/test/resources/testdata/Examples.xlsx", "WakeUpcall");
				return WakeUpcall;
			case "ConfigurationReservation":
				ConfigurationReservation = ReadDatafromExcel.data("src/test/resources/testdata/Examples.xlsx", "ConfigurationReservation");
				return ConfigurationReservation;
			default:
				return null;
		}
		
	}
}