package utilites;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
	static	XSSFSheet sheet ;
	static	XSSFWorkbook workBook;
	public	static String locatorname;
	public static String locatorValue;
	public static int totalrows;
	public static String keywordclmValue;
	public static String dataclmValue;
	public  void  readExcelFile(String location) throws IOException {


		//String filePath2 = "C:\\Users\\Administrator\\eclipse-workspace\\KeyWordDrivenProject\\targets\\keyword.xlsx";

		//String filePath2 = "C:\\Users\\Administrator\\eclipse-workspace\\KeyWordDrivenProject\\target\\keyword.ods";

		FileInputStream file = new FileInputStream(location);
		workBook = new XSSFWorkbook(file);
		sheet = workBook.getSheet("Sheet1");
		 totalrows=sheet.getLastRowNum();}

	public static void getLocatorsKeywordAndData(int row, int locatorclm, int keywordclm, int Dataclm) {

		String locatorclmValue	= sheet.getRow(row).getCell(locatorclm).toString().trim();
		//System.out.println(locatorclmValue);
		if(!locatorclmValue.contains("NA")) {
			String[] splittedlocator = locatorclmValue.split(":");
			locatorname =splittedlocator[0];
			locatorValue =splittedlocator[1];}
		else {
			System.out.println("The locator column value is NA");
		}
		 keywordclmValue =sheet.getRow(row).getCell(keywordclm).toString().trim();
		 dataclmValue = sheet.getRow(row).getCell(Dataclm).toString().trim();
		/*
		 * XSSFCell cellNo = sheet.getRow(locator).getCell(clm); String cellvalue =
		 * cellNo.getStringCellValue();
		 */
		//System.out.println("Locator Name : "+ locatorname +" Locator Value : "+ locatorValue);
		//System.out.println("keyword : "+ keywordclmValue );
	//	System.out.println("Data value : "+ dataclmValue );

		// return cellvalue;
	}



}

