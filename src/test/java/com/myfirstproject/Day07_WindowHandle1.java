package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class Day07_WindowHandle1 extends TestBase {

    /*
    Create a new Class Tests package: WindowHandleExample
Method name:windowHandle
Given user is on the https://the-internet.herokuapp.com/windows
Then user verifies the text : “Opening a new window”
Then user verifies the title of the page is “The Internet”
When user clicks on the “Click Here” button
Then user verifies the new window title is “New Window”
Then user verifies the text:  “New Window”
When user goes back to the previous window and then verifies the title : “The Internet”
     */
@Test
    public void windowHandleTest() throws InterruptedException {
   // Given user is on the https://the-internet.herokuapp.com/windows
    driver.get("https://the-internet.herokuapp.com/windows");
    //Then user verifies the text : “Opening a new window”
    Assert.assertEquals("Opening a new window",driver.findElement(By.xpath("//h3")).getText());
    //Then user verifies the title of the page is “The Internet”
Assert.assertEquals("The Internet",driver.getTitle());
    //When user clicks on the “Click Here” button
    driver.findElement(By.xpath("//a[.='Click Here']")).click();
    //Then user verifies the new window title is “New Window”
    String window1Handle=driver.getWindowHandle();
    System.out.println(window1Handle);
    //Driver still on window 1
    Set<String> allWindowHandles=driver.getWindowHandles();
    System.out.println(allWindowHandles);
    for(String eachHandle:allWindowHandles){
        if(!eachHandle.equals(window1Handle)){
            driver.switchTo().window(eachHandle);
            break;
        }
    }
   String window2Handle=driver.getWindowHandle();
    System.out.println(window2Handle);
   Assert.assertEquals("New Window", driver.findElement(By.xpath("//h3")).getText());
    //When user goes back to the previous window and then verifies the title : “The Internet”
    driver.switchTo().window(window1Handle);
    Assert.assertEquals("The Internet",driver.getTitle());
    driver.switchTo().window(window2Handle);
    Thread.sleep(3000);
    driver.switchTo().window(window1Handle);
    Thread.sleep(3000);
    driver.switchTo().window(window2Handle);
    Thread.sleep(3000);

}

}
