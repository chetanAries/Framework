package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
   public static void main(String [] args) throws Exception
   {
	   File src =new File("C:\\Users\\chetan\\Desktop\\NewStartUpProject\\TOOC\\testData\\registerUserDetail.xlsx");
	   
	   FileInputStream fis = new FileInputStream(src);
	   
	   XSSFWorkbook wb = new XSSFWorkbook(fis);
	   
	   XSSFSheet sheet1 = wb.getSheetAt(0);
	   
	   int rowCount =sheet1.getLastRowNum();
	   
	   for(int i=0; i<rowCount; i++)
	   {
		  String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
		   System.out.println(data0);
	   }
	   
	   wb.close();
   }
}
