package com.orange.excellibrary;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class LoginExcel 
{
	private FileInputStream fin;
	private Workbook workbook;
	private Sheet sheet;
	public LoginExcel(String excelFilePath,String sheetName)
	{
		try
		{
			fin=new FileInputStream(excelFilePath);
			workbook=WorkbookFactory.create(fin);
			sheet=workbook.getSheet(sheetName);
		}
		catch(Throwable e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void setExcelFilePath(String newFilePath) throws FileNotFoundException
	{
		fin=new FileInputStream(newFilePath);
	}
	public void setSheetName(String newSheetName) throws FileNotFoundException
	{
		sheet=workbook.getSheet(newSheetName);
	}
	public String getData(int rowNumber,int cellNumber)
	{
		try
		{
			return sheet.getRow(rowNumber).getCell(cellNumber).toString();
		}
		catch(NullPointerException e)
		{
			return "";
		}
	}
}
