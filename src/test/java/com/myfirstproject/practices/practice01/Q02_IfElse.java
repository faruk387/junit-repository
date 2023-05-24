package com.myfirstproject.practices.practice01;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02_IfElse {
    public static void main(String[] args) throws InterruptedException {

        // Set Driver Path
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
// Create chrome driver object
        WebDriver driver=new ChromeDriver();
// Maximize the window
        driver.manage().window().maximize();
// Open google home page https://www.google.com/
        driver.get("https://www.google.com/");
// Wait for 3 seconds
        Thread.sleep(3000);
// Go to the "https://techproeducation.com/"
        driver.get("https://techproeducation.com/");
// Get the title and URL of the page
        driver.getTitle();
        driver.getCurrentUrl();
// Check if the title contains the word "Bootcamps" print console "Title contains Bootcamps" or "Title does not contain Bootcamps"
        if(driver.getTitle().contains("Bootcamps")){
            System.out.println("Title contains Bootcamps");
        }else{
            System.out.println("Title does not contain Bootcamps");
        }
// Check if the URL contains the word "Courses" print console "URL contains Courses" or "URL does not contain Courses"
        if(driver.getCurrentUrl().contains("Courses")){
            System.out.println("URL contains Courses");
        }else{
            System.out.println("URL does not contain Courses");
        }
// Then go to "https://medunna.com/"
        driver.get("https://medunna.com/");
// Get the title and check if it contains the word "MEDUNNA" and print "Title contains MEDUNNA" or "Title does not contain MEDUNNA"
        if(driver.getTitle().contains("MEDUNNA")){
            System.out.println("Title contains MEDUNNA");
        }else{
            System.out.println("Title does not contains MEDUNNA");
        }
// Navigate Back to the previous webpage
        driver.navigate().back();
// Refresh the page
        driver.navigate().refresh();
// Navigate to forward
        driver.navigate().forward();
// Wait for 3 seconds
        Thread.sleep(3000);
// Close the browser
        driver.quit();
    }
}
