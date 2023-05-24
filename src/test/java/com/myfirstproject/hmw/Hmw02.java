package com.myfirstproject.hmw;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Hmw02 extends TestBase {
    @Test
    public void ebay() throws InterruptedException {
   // Go to ebay page
        driver.get("https://www.ebay.com");
    //Click on electronics section

driver.findElement(By.partialLinkText("Electronics")).click();
        // Click on all the images with a Width of 225 and a Length of 225
List<WebElement> img=driver.findElements(By.xpath("//img[@class='b-img']"));
        // Print the page title of each page
for(WebElement w:img){
    w.click();
    Thread.sleep(3000);
    System.out.println(driver.getTitle());
    driver.navigate().back();
    Thread.sleep(3000);
}

        //  Close the page


    }
}
