package com.myfirstproject;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day16_WriteExcel {
    /*
    Create a new class: WriteExcel
Create a new method: writeExcel()
Store the path of the file as string and open the file
Open the workbook
Open the first worksheet
Go to the first row
Create a cell on the 3rd column (2nd index) on the first row
Write “POPULATION” on that cell
Create a cell on the 2nd row 3rd cell(index2), and write 150000
Create a cell on the 3rd row 3rd cell(index2), and write 250000
Create a cell on the 4th row 3rd cell(index2), and write 54000
Write and save the workbook
Close the file
Close the workbook
C
     */
    @Test
    public void writeExcelTest() throws IOException {
//    Store the path of the file as string and open the file
        String path = "resources/Capitals.xlsx";
//    Open the workbook
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
//    Open the first worksheet
        Sheet sheet1 = workbook.getSheet("Sheet1");//getting Sheet1 by name
//    Go to the first row
        Row row1 = sheet1.getRow(0); //index starts at 0
//        NOTE ALL ARE PRE REQUITES SO FAR.
//    Create a cell on the 4th column (3rd index) on the first row
        Cell r1c4 = row1.createCell(3);
//    Write “FAMOUS FOR” on that cell
        r1c4.setCellValue("FAMOUS FOR");
//    Create a cell on the 2nd row 4th cell(index3), and write Liberty Statue
        sheet1.getRow(1).createCell(3).setCellValue("Liberty Statue");
//    Create a cell on the 3rd row 4th cell(index3), and write Eiffel Tower
        sheet1.getRow(2).createCell(3).setCellValue("Eiffel Tower");
//    Create a cell on the 4th row 4th cell(index3), and write London Eye
        sheet1.getRow(3).createCell(3).setCellValue("London Eye");

//    Write and save the workbook
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
//    Close the file
        fileInputStream.close();
        fileOutputStream.close();
//    Close the workbook
        workbook.close();
    }

    /*  NOTE :  WE CAN ADD STYLES WITH CELLSTYLE AND FONT OBJECT
        CellStyle style = workbook.createCellStyle();
        style.getBorderBottom();
        Font font = workbook.createFont();
        font.setBold(true);
 */

}
