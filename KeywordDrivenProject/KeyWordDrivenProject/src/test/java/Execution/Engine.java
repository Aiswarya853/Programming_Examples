package Execution;

import java.io.IOException;

import org.openqa.selenium.By;

import pages.TestCase01;
import utilites.ExcelFile;
import utilites.Locators;
import utilites.methodsListcall;

public class Engine  {
	static String filePath1 = "C:\\Users\\Administrator\\eclipse-workspace\\KeyWordDrivenProject\\target\\keyword.xlsx";
	public static String keyword;
	public static By locatoruh;
	public static void getlocatortobeused() {
		switch (ExcelFile.locatorValue) {
		case "id": 
			locatoruh =	Locators.getId(ExcelFile.locatorname);
			break;
		case "name":
			locatoruh= Locators.getName(ExcelFile.locatorname);
			break;
		case "className":
			locatoruh=Locators.getClassName(ExcelFile.locatorname);
			break;
		case "xpath":
			locatoruh=Locators.getXpath(ExcelFile.locatorname);
			break;
		case "tagName":
			locatoruh=Locators.gettagName(ExcelFile.locatorname);
			break;
		case "LinkText":
			locatoruh=	Locators.getlinkText(ExcelFile.locatorname);
			break;
		case "PartialLinkText":
			locatoruh=Locators.getPartialLinkText(ExcelFile.locatorname);
			break;
		case "CSSSelector":
			locatoruh=	Locators.getCssSelector(ExcelFile.locatorname);
			break;}
		
		
		 
	}
	
	public static void main(String[] args) throws Exception {
		ExcelFile run = new ExcelFile();
		run.readExcelFile(filePath1);
		
		int locatorclm=2;
		int keywordclm = locatorclm+1;
		int dataclm = locatorclm+2;
		
		for(int row=1; row<= ExcelFile.totalrows; row++) {
			//keyword=	
					ExcelFile.getLocatorsKeywordAndData(row, locatorclm, keywordclm, dataclm);
					
					Engine.getlocatortobeused();
					methodsListcall.keyordsAndMethodcall();
					
					
			//methodsListcall.getmethodslistfrmTestCase01();
			
				//methodsListcall.keyordsAndMethodMatch();
			

			/*
			 * if (keyword.equals("openBrowser")) { TestCase01.openBrowser();} else if
			 * (keyword.equals("NavigatetoURL")) { TestCase01.NavigatetoURL();} else if
			 * (keyword.equals("userNameSend")) { TestCase01.userNameSend();} else if
			 * (keyword.equals("pswdNameSend")) { TestCase01.pswdNameSend();} else if
			 * (keyword.equals("loginClick")) { TestCase01.loginClick();} else if
			 * (keyword.equals("myinfoClick")) { TestCase01.myinfoClick();} else if
			 * (keyword.equals("emergencyDetailsAdd")) { TestCase01.emergencyDetailsAdd();}
			 * else if (keyword.equals("submitclick")) { TestCase01.submitclick();} else if
			 * (keyword.equals("quitBrowser")) { TestCase01.quitBrowser();} else {
			 * System.out.println("No keywords to invoke....!"); }
			 */
		}
		

	}}


