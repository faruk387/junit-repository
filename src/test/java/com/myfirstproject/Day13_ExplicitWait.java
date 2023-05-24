package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Day13_ExplicitWait extends TestBase {
    /*
    Create a class:ExplicitWait
Create a method: explicitWait
Go to https://the-internet.herokuapp.com/dynamic_loading/1
When user clicks on the Start button
Then verify the ‘Hello World!’ Shows up on the screen
     */
    @Test
    public void explicitWaitTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']//button"));
        startButton.click();
        //Wait after buttin click
        //Trying hard wait
        //Thread.sleep(10000);//solve the wait issue but not recommendet because it is not dynamic
        //Trying extra imlicit wait
       //river.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// didnt solve the issue

        //Trying explicit wait
        //1. Create webdriver wait object
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        //2. use that wait object to handle the wait issue
        WebElement helloWorld=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='finish']//h4"))));
        Assert.assertEquals("Hello World!",helloWorld.getText());
         //Fails
        //WebElement helloWorld=driver.findElement(By.xpath("//div[@id='finish']//h4"));
        //Assert.assertEquals("Hello World!",helloWorld.getText());



    }

    @Test
    public void explicitWaitTest3(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']//button"));
        startButton.click();
//        WAIT FOR ELEMENT USING EXPLICIT WAIT
//        THIS IS RECOMMENDED. WE SHOULD USE REUSABLE METHODS IN AUTOMATION
        WebElement helloWorld = waitForVisibility(driver.findElement(By.xpath("//div[@id='finish']//h4")),20);
        Assert.assertEquals("Hello World!",helloWorld.getText());
    }
}