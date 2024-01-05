package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.Test;

public class DataFromPropertiesAndExcel {
	public String propertiesFileData(String key) throws Throwable
	{
		//fetching Data From Properties File
		File file = new File(IpathConstant.propertiesPath);
		FileInputStream fis = new FileInputStream(file);
		Properties pr = new Properties();
		pr.load(fis);
		String value = pr.getProperty(key);
		return value;
		
	}
	public String excelFileData(String sheetName,int rowNum,int colNum) throws Throwable
	{
		//Fetching Data From Excel File
		File file = new File(IpathConstant.excelPath);
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(colNum);
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(cell);
		return value;
	}
	
	public Object[][] accessAllAddress() throws Throwable
	{
		
		File file = new File(IpathConstant.excelPath);
		FileInputStream fis = new FileInputStream(file);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet("Sheet1");
		Object[][] ref = new Object[sheet.getLastRowNum()][9];
		DataFormatter form = new DataFormatter();
		int count=0;
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
			{
				ref[count][j]=form.formatCellValue(sheet.getRow(i).getCell(j));
			}
			count++;
		}
		return ref;
	}

}
