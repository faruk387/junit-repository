package com.myfirstproject;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Day15_ReadExcel {
    @Test
    public void readExcelTest() throws IOException {
        String path="resources/Capitals.xlsx";
        //Open the file
        FileInputStream fileInputStream=new FileInputStream(path);
       //open the work book using fileinpustream
        Workbook workbook= WorkbookFactory.create(fileInputStream);
       //open the först worksheet
        Sheet sheet1=workbook.getSheet("Sheet1");
        //workbook.getSheetAt(0);//Alternatively getting sheet1 by index
        //go to first row
        Row row1=sheet1.getRow(0);//index starts att 0
        //go to first cell on that first row and print
        Cell cell=row1.getCell(0);
        System.out.println(cell);
       Cell c2r1=row1.getCell(1);
        System.out.println(c2r1);
        Cell c1r2=sheet1.getRow(1).getCell(0);
        System.out.println(c1r2.toString().toLowerCase());
        Cell c2r3=sheet1.getRow(2).getCell(1);
        System.out.println(c2r3);
        //find number of row
       int totalRowCount= sheet1.getLastRowNum()+1;
        System.out.println(totalRowCount);
        //find number of used row
        int usedRowCount=sheet1.getPhysicalNumberOfRows();
        System.out.println(usedRowCount);//index stars at 1
        //Print country,capital key value pairs as map object
        //create a map,use a loop to add all countries as key and capitals as value
Map<String ,String> capitals=new HashMap<>();
for(int rowNum=1;rowNum<totalRowCount;rowNum++){//iterate the rows 1 to end
    String country=sheet1.getRow(rowNum).getCell(0).toString();
    String capital=sheet1.getRow(rowNum).getCell(1).toString();
    capitals.put(country,capital);

}
        System.out.println(capitals);

    }
}
