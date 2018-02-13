package com.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Create Workbook/sheet and write data at run time
 * 
 * @author SG0301030
 * 
 */	
public class CreateWriteAndReadDataInExcel {
	File file = null;
	XSSFWorkbook workbook = null;
	XSSFSheet sheet = null;

	public Map<String, Object[]> dataToWriteMap = null;

	public Map<String, Object[]> getDataToWriteMap() {
		return dataToWriteMap;
	}

	public void setDataToWriteMap(Map<String, Object[]> dataToWriteMap) {
		this.dataToWriteMap = dataToWriteMap;
	}

	public void setDataInMap(String key, Object[] value) throws IOException
	{
		dataToWriteMap.put(key,value);
		
	}	
	public void setFile(String fileName) throws IOException {
	//	System.out.println("setFile called...");

		if (StringUtils.isNotBlank(fileName)) {
			file = new File("C:\\DynamicScenario\\" + fileName + ".xlsx");			
			if (!file.exists()) {
				boolean dirFlag = file.getParentFile().mkdir();
				if (dirFlag) {
					//System.out.println("Directory is created!");
					file.createNewFile();
					workbook = new XSSFWorkbook();
					//System.out.println("file_name---------" + file.getName());
				} else {
					//System.out.println("Failed to create directory!");
					file.createNewFile();
					workbook = new XSSFWorkbook();
					//System.out.println("else file_name-------" + file.getName());
				}
			} else {
				//System.out.println("Directory already exists ...");		

			}
		}
	}

	public File getFile() {
		return file;
	}

	public void getExistingWorkbook() {
		//System.out.println("getExistingWorkbook called....");
		try {
			FileInputStream fis = new FileInputStream(getFile());
			workbook = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public XSSFSheet getSheet() {
		return sheet;
	}

	public void setSheet(XSSFSheet sheet) {
		this.sheet = sheet;
	}

	public void writeData(Map<String, Object[]> data) throws IOException {
		//System.out.println("WriteData called...");
		int rowIndex = 0;
		if (workbook != null && data != null) {
			if (getSheet() == null) {
				//System.out.println("New Sheet....");
				this.setSheet(workbook.createSheet("sheet1"));
			} else {
				//System.out.println("Old Sheet....");
				this.setSheet(workbook.getSheetAt(0));				
			}

			this.data(data, this.getSheet(), rowIndex);

			try {
				FileOutputStream out = new FileOutputStream(getFile());
				workbook.write(out);
				out.close();
				//System.out.println("Excel written successfully..");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {

			}
		}
	}

	public void data(Map<String, Object[]> mydata, XSSFSheet sheet, int rowIndex) {

	//	System.out.println("data called....rowIndex" + rowIndex);
		XSSFCell cell = null;
		dataToWriteMap = mydata;
		Set<String> keyset = dataToWriteMap.keySet();

		for (String key : keyset) {
			XSSFRow row = sheet.createRow(rowIndex++);
			//System.out.println("key is " + key);
			Object[] objArr = dataToWriteMap.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				cell = row.createCell(cellnum++);
				if (obj instanceof Date) {
					cell.setCellValue((RichTextString) obj);
				} else if (obj instanceof Boolean) {
					cell.setCellValue((Boolean) obj);
				} else if (obj instanceof String) {
					cell.setCellValue((String) obj);
				} else if (obj instanceof Double) {
					cell.setCellValue((Double) obj);
				} else if (obj instanceof Integer) {
					cell.setCellValue((Integer) obj);
				}
			}
		}
	}

	public Object[] getdata(String key) {

		Object[] objArr = null;
		if (dataToWriteMap != null && dataToWriteMap.containsKey(key)) {
			if (dataToWriteMap.get(key) != null) {
			//	System.out.println("specific key is " + dataToWriteMap.get(key).toString());

				objArr = dataToWriteMap.get(key);
			}

		}
		//System.out.println("in getdata method");
		return objArr;
	}

	public void createSheetAndwriteData(Map<String, Object[]> data, String fileName) throws IOException {
		this.setFile(fileName);
		this.writeData(data);
	}

	public void WriteDataInExistingSheet(Map<String, Object[]> data) throws IOException {
		this.getExistingWorkbook();
		this.writeData(data);
	}

	/*public void getkeys() {
		Set<String> keyset = dataToWriteMap.keySet();
		System.out.println("complete key set is ");
		for (String key : keyset) {
			System.out.println("keys " + key);
		}
	}*/
}
