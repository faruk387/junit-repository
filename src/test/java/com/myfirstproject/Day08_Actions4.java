package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day08_Actions4 extends TestBase {
    @Test
    public void dragAndDropTest(){
        //Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");
        //And user moves the target element(Drag me to my target) in to destination(Drop here)
        driver.switchTo().frame(0);
        WebElement draggable=driver.findElement(By.id("draggable"));
        WebElement droppable=driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(draggable,droppable).perform();


    }
    @Test
    public void dragAndDropByTest(){
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(source,401,138).perform();
    }
    @Test
    public void clickAndHoldTest(){
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);

        actions
                .clickAndHold(source)
                .moveToElement(target)
                .build().perform();

    }

}
