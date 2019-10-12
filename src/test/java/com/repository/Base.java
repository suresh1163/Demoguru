package com.repository;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import com.stepdefinition.Hook;



public class Base {
		
	public static void launch(String url)
	{
		Hook.driver.get(url);
	}
	public static void type(WebElement e,String value)
		{
		e.sendKeys(value);
	}
	public static void click(WebElement e1)
	{
		e1.click();
	}
	public static List<HashMap<String,String>> readvalue()
	{
		List<HashMap<String,String>> mapdatalist=new ArrayList<HashMap<String,String>>();
		try {
		File loc=new File("E:\\Java\\workspace\\DemoGuru\\Testdata\\demogurudata.xlsx");
		String s="Sheet1";
		FileInputStream f=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(f);
		Sheet sheet=w.getSheet(s);
		Row headerRow = sheet.getRow(0);
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row currentRow = sheet.getRow(i);
			HashMap<String,String> mapDatas=new HashMap<String,String>();
			for (int j=0;j<headerRow.getPhysicalNumberOfCells();j++)
			{
				Cell currentcell=currentRow.getCell(j);
				switch(currentcell.getCellType())
				{
			case Cell.CELL_TYPE_STRING:
			mapDatas.put(headerRow.getCell(j).getStringCellValue(),currentcell.getStringCellValue());
			break;
			case Cell.CELL_TYPE_NUMERIC:
			mapDatas.put(headerRow.getCell(j).getStringCellValue(),String.valueOf(currentcell.getNumericCellValue()));
			break;
				}
			}
			mapdatalist.add(mapDatas);
		}
		} catch (Throwable e) {
			e.printStackTrace();
		}
			return mapdatalist;
	}

}
