package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class FWUtil {
	
	// store a screenshot 
	public static void getphoto(WebDriver driver, String path) {
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File(path);
		Files.copy(srcFile,destFile);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
    // write data into excel sheet
	public static void setXLData(String path, String sheet, int r, int c, int v) {
		try {
			 Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			 wb.getSheet(sheet).getRow(r).getCell(c).setCellValue(v);
			 wb.write(new FileOutputStream(path));
			  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
    // read data from excel sheet
	public static String getXLData(String path, String sheet, int r, int c) {
	  String v="";
	  try {
		  Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		  wb.getSheet(sheet).getRow(r).getCell(c).toString();
		  
	  }
		catch(Exception e) {
		}	
		return v;
	}
	// row count from excel sheet
	public static int getXLRowCount(String path , String sheet) {
		int count=0;
		try {
			
		 Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		 count=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		return count;
		}

	}



