package com.myfirstproject.practices.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Q05_DragAndDropCapitals extends TestBase {
    @Test
    public void test(){
        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // Match capitals with countries
        //Locate capitals
WebElement box1=driver.findElement(By.id("box1"));
WebElement box2=driver.findElement(By.id("box2"));
WebElement box3=driver.findElement(By.id("box3"));
WebElement box4=driver.findElement(By.id("box4"));
WebElement box5=driver.findElement(By.id("box5"));
WebElement box6=driver.findElement(By.id("box6"));
WebElement box7=driver.findElement(By.id("box7"));
//Locate Countries
        WebElement country1=driver.findElement(By.id("box101"));
        WebElement country2=driver.findElement(By.id("box102"));
        WebElement country3=driver.findElement(By.id("box103"));
        WebElement country4=driver.findElement(By.id("box104"));
        WebElement country5=driver.findElement(By.id("box105"));
        WebElement country6=driver.findElement(By.id("box106"));
        WebElement country7=driver.findElement(By.id("box107"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(box1,country1).
        dragAndDrop(box2,country2).
        dragAndDrop(box3,country3)
       .dragAndDrop(box4,country4)
        .dragAndDrop(box5,country5)
        .dragAndDrop(box6,country6)
        .dragAndDrop(box7,country7).build().perform();
//Assert they are all dragged


    }
}
