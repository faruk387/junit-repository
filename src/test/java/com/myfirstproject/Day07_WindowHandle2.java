package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class Day07_WindowHandle2 extends TestBase {
    @Test
    public void newTabTest() throws InterruptedException {
        //amazon title test
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
String amazonHandle=driver.getWindowHandle();
Thread.sleep(3000);
        //linkedin title test
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");
        Assert.assertTrue(driver.getTitle().contains("LinkedIn"));
        String LinkedInHandle=driver.getWindowHandle();
        Thread.sleep(3000);
        //ebay title test
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.ebay.com");
        Assert.assertTrue(driver.getTitle().contains("eBay"));
        String ebayHandle=driver.getWindowHandle();
        Thread.sleep(3000);
        driver.switchTo().window(amazonHandle);
        System.out.println("AmazonTitle: "+driver.getTitle());
        Thread.sleep(3000);
        driver.switchTo().window(LinkedInHandle);
        System.out.println("LinkedIn Title: "+driver.getTitle());
        Thread.sleep(3000);
        driver.switchTo().window(ebayHandle);
        System.out.println("eBayTitle: "+driver.getTitle());
        Thread.sleep(3000);


    }
    @Test
    public void newWindowTest() throws InterruptedException {
        //amazon title test
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        String amazonHandle=driver.getWindowHandle();
        Thread.sleep(3000);
        //linkedin title test
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        Assert.assertTrue(driver.getTitle().contains("LinkedIn"));
        String LinkedInHandle=driver.getWindowHandle();
        Thread.sleep(3000);
        //ebay title test
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.ebay.com");
        Assert.assertTrue(driver.getTitle().contains("eBay"));
        String ebayHandle=driver.getWindowHandle();
        Thread.sleep(3000);
        driver.switchTo().window(amazonHandle);
        System.out.println("AmazonTitle: "+driver.getTitle());
        Thread.sleep(3000);
        driver.switchTo().window(LinkedInHandle);
        System.out.println("LinkedIn Title: "+driver.getTitle());
        Thread.sleep(3000);
        driver.switchTo().window(ebayHandle);
        System.out.println("eBayTitle: "+driver.getTitle());
        Thread.sleep(3000);


    }
}
