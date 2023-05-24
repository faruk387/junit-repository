package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day05_RadioButton extends TestBase {

    //https://testcenter.techproeducation.com/index.php?page=radio-buttons
    //Click on Red
    //Click on Football
    @Test
    public void radioButtonTest(){
        driver.get(" https://testcenter.techproeducation.com/index.php?page=radio-buttons");
        WebElement red=driver.findElement(By.id("red"));
        red.click();
        Assert.assertTrue(red.isSelected());
        WebElement football=driver.findElement(By.id("football"));
   football.click();
   Assert.assertTrue(football.isSelected());
    }


}
