package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Day12_JSExecutor extends TestBase {


    @Test
    public void scrollIntoViewTest() throws IOException {
        driver.get("https://www.amazon.se/");
      driver.findElement(By.id("a-autoid-0")).click();
        WebElement footer=driver.findElement(By.id("nav-bb-footer-logo"));
        scrollIntoViewJS(footer);
        Assert.assertTrue(footer.isDisplayed());
        takeScreenshotOfTheEntirePage();






    }
    @Test
    public void scrollIntoViewTest1() throws IOException {
        driver.get("https://www.amazon.com");
//        Location footer element on amazon page
        WebElement footer = driver.findElement(By.xpath("//div[@id='navFooter']//tbody"));
//        scroll into that element
        scrollIntoViewJS(footer);
//        assert if that footer is exists on the page
        Assert.assertTrue(footer.isDisplayed());
//        take a screenshot of the page
        takeScreenshotOfTheEntirePage();
        //        locate the search box
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//        and scroll into that element
        scrollIntoViewJS(searchBox);
//        then verify the element is displayed
        Assert.assertTrue(searchBox.isDisplayed());
//        then take screenshot
        takeScreenshotOfTheEntirePage();



    }
    @Test
    public void scrollAllTheWayUppAndDown() throws IOException, InterruptedException {
        driver.get("https://www.amazon.com");
        //Scrolll all the way down and take screen shot
        scrollAllTheWayDownJS();
        takeScreenshotOfTheEntirePage();
        Thread.sleep(3000);
        scrollAllTheWayUppS();
        takeScreenshotOfTheEntirePage();


    }
    @Test
    public void clickByJSTest() throws IOException {
//        search porcelain tea set on amazon
        driver.get("https://www.amazon.com");
//        location search box
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//        typing porcelain tea set
        searchBox.sendKeys("porcelain tea set");
        takeScreenshotOfTheEntirePage();
//        locating search button and clicking on it with js executor
        WebElement searchIcon = driver.findElement(By.id("nav-search-submit-button"));
        clickByJS(searchIcon);
        takeScreenshotOfTheEntirePage();
    }
    @Test
    public void locateElementByJSTest() throws IOException, InterruptedException {
//        search porcelain tea set on amazon
        driver.get("https://www.amazon.com");
//        location search box
        WebElement searchBox = locateElementByJS("twotabsearchtextbox");
//        typing porcelain tea set
        searchBox.sendKeys("porcelain tea set");
        Thread.sleep(3000);
        takeScreenshotOfTheEntirePage();
//        locating search button and clicking on it with js executor
        WebElement searchIcon = locateElementByJS("nav-search-submit-button");
        clickByJS(searchIcon);
        takeScreenshotOfTheEntirePage();
    }
    @Test
    public void typeWithJs() throws IOException {
        driver.get("https://www.amazon.com");
        WebElement searchBox = locateElementByJS("twotabsearchtextbox");
        //type the search box by using js
        setValueByJS(searchBox,"porcelain tea set");
        WebElement searchIcon = locateElementByJS("nav-search-submit-button");
        clickByJS(searchIcon);
        takeScreenshotOfTheEntirePage();





    }
}
