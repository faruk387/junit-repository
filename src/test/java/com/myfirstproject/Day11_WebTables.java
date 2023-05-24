package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Day11_WebTables extends TestBase {
    @Test
    public void test(){

//https://the-internet.herokuapp.com/tables
        driver.get("https://the-internet.herokuapp.com/tables");
        //Task 1 : Print the entire table
        extentTest.pass("PRINT ENTIRE TABLE");
String entireTable=driver.findElement(By.id("table1")).getText();
        System.out.println(entireTable);
        //Alternatively
     List<WebElement> elements= driver.findElements(By.xpath("//table[@id='table1']//td"));
     for(WebElement w:elements){
         System.out.println(w.getText());
         extentTest.pass(w.getText());
     }
     // Get specific indexed elements
        System.out.println("6th Data in the table ==> "+elements.get(6).getText());




    }
    @Test
    public void printAllRows(){
        //Task 2 : Print All Rows
        driver.get("https://the-internet.herokuapp.com/tables");
List<WebElement> allRows=driver.findElements(By.xpath("//table[@id='table1']//tr"));
int rowNum=1;
for(WebElement w:allRows){
    System.out.println(rowNum+" : "+w.getText());
    rowNum++;
}
        System.out.println("2nd row data :" +allRows.get(1).getText());
        //Task 3 : Print Last row data only
        System.out.println("Last row data : "+allRows.get(allRows.size()-1).getText());
    }

@Test
    public void printColumns(){
    //Task 4 : Print column 5 data in the table body
    driver.get("https://the-internet.herokuapp.com/tables");
    List<WebElement> col5Data=driver.findElements(By.xpath("//table[@id='table1']//tr//td[5]"));
    int colNum=1;
    for(WebElement w:col5Data){
        System.out.println(colNum+" : "+w.getText());
        colNum++;
    }
}


    //Task 5 : Write a method that accepts 2 parameters

    //Parameter 1 = row number

    //Parameter 2 = column number

    //printData(2,3); => prints data in 2nd row 3rd column

}
