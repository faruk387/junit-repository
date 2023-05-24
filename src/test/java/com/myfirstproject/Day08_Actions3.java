package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Day08_Actions3 extends TestBase {
    @Test
    public void scrollUpDown() throws InterruptedException {
       // Go to amazon
        driver.get("https://www.amazon.com/");
        //    Scroll the page down
        /*
        scrolling is mouse or keyboard action, so we should use actions class
        Keys.PAGE_DOWN
        Keys.ARROW_DOWN
        alternatively, we will use javascript executor
         */
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        //We can CHAIN these methods
        actions
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .build()//built is recommended especially after method chains, but it can also be used anytime before perform
                .perform();//execute
        //Scroll the page up
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(3000);
    }


}
