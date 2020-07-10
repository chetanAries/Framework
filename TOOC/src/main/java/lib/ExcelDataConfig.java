package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExcelDataConfig 
{
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ExcelDataConfig(String excelPath)
	{
		try {
			File src =new File(excelPath);

			FileInputStream fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}



	public String getData(int sheetIndex, int row , int column)
	{
		sheet1 = wb.getSheetAt(sheetIndex);
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		
		
	//	Cell cell=sheet1.getRow(row).getCell(column);

//		DataFormatter formatter = new DataFormatter(); 
//		 data = formatter.formatCellValue(cell);
//		 System.out.println(data);
		
return data;
	}


	public int getRowCount(int sheetIndex)
	{
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
	}







}
