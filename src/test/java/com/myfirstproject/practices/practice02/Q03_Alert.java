package com.myfirstproject.practices.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Q03_Alert extends TestBase {


    @Test
    public void test(){

//Given
  //  Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"

driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

//When
   // Click "CLICK ME" of JavaScript Alert
driver.findElement(By.id("button1")).click();

//And
  //  Get the Alert text
String alertText=driver.switchTo().alert().getText();

//Then
    //Verify that message is "I am an alert box!"

        Assert.assertEquals("I am an alert box!",alertText);
//When
    //Accept Alert
        driver.switchTo().alert().accept();

    }
}
