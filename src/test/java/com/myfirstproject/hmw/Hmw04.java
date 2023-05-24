package com.myfirstproject.hmw;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hmw04 extends TestBase {

//Task03:
    /*
    Go to https://amazon.com
    Print all the options in the 'Departments' dropdown on the left side of the search box
    Search for each first five options and print titles
    */
    @Test
    public void amazonTest(){
        driver.get("https://www.amazon.com");
        WebElement departments=driver.findElement(By.id("searchDropdownBox"));
        Select options=new Select(departments);
for(WebElement w:options.getOptions())   {
    System.out.println(w.getText());
}
for(int i=0; i<5;i++){
    options.selectByIndex(i);
}
    }

}
