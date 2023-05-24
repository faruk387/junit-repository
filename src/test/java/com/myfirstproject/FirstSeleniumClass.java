package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
        //        this is one way to create an automation script
//        We will not use main method later on
//        Windows : .exe extension is required
//        Mac : do not use .exe extension

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//later we will not use this method
        //        create driver
        WebDriver driver = new ChromeDriver();
        //        navigate to techpro
        driver.get("https://www.techproeducation.com/");

    }
}
