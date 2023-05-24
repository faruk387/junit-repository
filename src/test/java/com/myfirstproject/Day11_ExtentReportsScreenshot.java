package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Day11_ExtentReportsScreenshot extends TestBase {
    /*
    create extentReportsScreenshot method
    copy the code from extentReportsTest class and paste here
    So far, we can capture screenshot of the entire page and save under test output folder
    So far, we can capture the screenshot of specific elements and save under test output folder
    NOW WE WILL ATTACH SOME SCREENSHOTS ON THE EXTENT REPORTS
     */
    @Test
    public void extentReportsTest() throws IOException, InterruptedException {
        //Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
        extentTest.pass("Taking screenshot of the home page")
                .assignDevice("Samsung","Chrome").assignCategory("Smoke","Regression","Integration").assignAuthor("Faruk Özacar")
                .addScreenCaptureFromPath(takeScreenshotOfTheEntirePageAsString());
        //        When user type “uni” in the search box
        //TAKE SCREENSHOT
        takeScreenshotOfTheEntirePage();
        driver.findElement(By.id("myCountry")).sendKeys("uni");
        Thread.sleep(2000);
//        And select the ‘United Kingdom’ from the suggestions
        //TAKE SCREENSHOT
        extentTest.pass("Selecting the United Kingdom Option").addScreenCaptureFromPath(takeScreenshotOfTheEntirePageAsString());
        takeScreenshotOfTheEntirePage();

//        TAKING SCREENSHOT OF ONLY UNITED KINGDOM ELEMENT
        takeScreenshotOfThisElement(driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//*[.='United Kingdom']")));

        driver
                .findElement(By.xpath("//div[@id='myCountryautocomplete-list']//*[.='United Kingdom']"))
                .click();
        Thread.sleep(2000);
//        And click on submit button
        //TAKE SCREENSHOT
        takeScreenshotOfTheEntirePage();
        extentTest.pass("Clicking on The Submit Button").addScreenCaptureFromPath(takeScreenshotOfTheEntirePageAsString());
        driver.findElement(By.xpath("//input[@type='button']")).click();
        Thread.sleep(2000);
        //TAKE SCREENSHOT
//        Then verify the result contains ‘United Kingdom’
        takeScreenshotOfTheEntirePage();

//        TAKING THE SCREENSHOT OF THE RESULT ELEMENT
        extentTest.pass("Taking the screenshot of result element").addScreenCaptureFromPath(takeScreenshotOfTheEntirePageAsString());
        WebElement result = driver.findElement(By.id("result"));
        takeScreenshotOfThisElement(result);
        extentTest.pass("Asserting the result contains United Kingdom").addScreenCaptureFromPath(takeScreenshotOfTheEntirePageAsString());
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("United Kingdom"));
    }

    @Test
    public void extentReportsScreenshot(){
        String text="selenium";
        if(text.contains("e")){
            extentTest.pass("PASS : "+text+" Contains e");
        }else{
            extentTest.fail("FAILED : "+text+" Doesn't contains e");
        }
        //        pass is used in the lines that we are expecting to pass. this is used a lot
        extentTest.pass("PASSED");
        //        fail is used in the lines that we are expecting to fail such as else condition above
        extentTest.fail("FAILED");
        extentTest.info("INFO");
        extentTest.skip("SKIP");
        extentTest.warning("WARNING");

    }




}
