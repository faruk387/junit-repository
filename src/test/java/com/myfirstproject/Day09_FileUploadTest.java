package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day09_FileUploadTest extends TestBase {
    /*
     We use sendkeys functions to upload files if the html is INPUT TYPE=FILE
     If other element is used to upload files, then we can use ROBOT class in JAVA
      */
    @Test
    public void fileUploadTest(){
       // When user goes to https://the-internet.herokuapp.com/upload
       driver.get("https://the-internet.herokuapp.com/upload");

//        to upload a file to this type of element, we should send the path of the file to the input
//        element is TAG = INPUT, TYPE = FILE
//        locate the chose a file element, get the path of teh file, then use send keys function
//    When user selects an image from the desktop

        driver.findElement(By.id("file-upload")).sendKeys(System.getProperty("user.home")+"\\Desktop\\flower.jpg");

       // And click on the upload button
driver.findElement(By.id("file-submit")).click();

        //Then verify the File Uploaded!  Message displayed
String text=driver.findElement(By.xpath("//div[@id='content']//h3")).getText();
        Assert.assertTrue(text.contains("File Uploaded!"));
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']//h3")).isDisplayed());
    }
}
