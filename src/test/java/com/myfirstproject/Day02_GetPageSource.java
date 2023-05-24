package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_GetPageSource {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//implicit wait up to 30 sec
        driver.manage().window().maximize();
       //Test if amazon has register keyword on the application or not
        driver.get("https://www.amazon.com");
       String pageSource= driver.getPageSource();//Returns entire html source of the page
       if(pageSource.contains("Registry")){
           System.out.println("PASS");
       }else{
           System.out.println("FAIL");

       }
       driver.quit();


    }

}
