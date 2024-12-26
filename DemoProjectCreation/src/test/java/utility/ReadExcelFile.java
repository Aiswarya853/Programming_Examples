package utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  class  ReadExcelFile {

	//C:\Users\Administrator\git\NewMavenProject\MavenProject\DemoProjectCreation\TestDatas\DATA SHEET.xlsxorkBook
	public static XSSFWorkbook workBook;
	public static XSSFSheet excelSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	static String FilePath;
	public static String getCellValue(String fileName,String sheetName, int rowNo, int cellNo){
		
		try
		{
			FileInputStream inputStream= new FileInputStream(FilePath);
			workBook= new XSSFWorkbook(inputStream);
			excelSheet=workBook.getSheet(sheetName);
			cell=excelSheet.getRow(rowNo).getCell(cellNo);
			 	workBook.close();
			
			return cell.getStringCellValue();
		}
		
		catch(Exception e)
		{
			return "";
		}
	}
	public  static int getRowCount(String fileName, String SheetName) {
		
		try {
			FileInputStream inputStream= new FileInputStream(FilePath);
			workBook= new XSSFWorkbook(inputStream);
			excelSheet=workBook.getSheet(SheetName);
			int totalrows = (excelSheet.getLastRowNum())+1;
			return totalrows;	
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println( );
			return 0;
		}
		
	}

	public static int getcolumnCount(String fileName, String SheetName) {
		
		try {
		FileInputStream inputStream= new FileInputStream(FilePath);
			workBook= new XSSFWorkbook(inputStream);
			excelSheet=workBook.getSheet(SheetName);
			int totalcells = excelSheet.getRow(0).getLastCellNum();
			
			return totalcells;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}
	public static String getStringData(int Sheetindex, int rowNo, int columnNo ) {
		String data = workBook.getSheetAt(Sheetindex).getRow(rowNo).getCell(columnNo).getStringCellValue();
		 
		return data;
	}
	
	public static String getStringData(String SheetName, int rowNo, int columnNo ) {
		String data1 = workBook.getSheet(SheetName).getRow(rowNo).getCell(columnNo).getStringCellValue();
		 
		return data1;
}
	public static double getNumericData(String SheetName, int rowNo, int columnNo ) {
		double data1 = workBook.getSheet(SheetName).getRow(rowNo).getCell(columnNo).getNumericCellValue();
		 
		return data1;}
}