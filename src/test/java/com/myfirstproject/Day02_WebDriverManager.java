package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_WebDriverManager {
    public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        WebDriverManager.edgedriver().setup();
        WebDriver driver1=new EdgeDriver();
        driver.manage().window().maximize();
        driver1.get("https://www.amazon.com");
    }

}
