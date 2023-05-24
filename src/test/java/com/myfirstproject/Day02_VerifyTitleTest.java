package com.myfirstproject;

import com.myfirstproject.utilities.LoggerUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class Day02_VerifyTitleTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        //Create a new class: VerifyTitleTest 
        //Navigate to techproeducation homepage 
        LoggerUtils.info("Starting the testing...Opening the URL");
        driver.get("https://techproeducation.com");
       LoggerUtils.info("Getting thr page title...");
        // Verify if page title is “Techpro Education | Online It Courses & Bootcamps”
        String getTitle=driver.getTitle();
       if(getTitle.equals("Techpro Education | Online It Courses & Bootcamps")){
           System.out.println("PASS");
           LoggerUtils.info("Pass...Page Title is"+driver.getTitle());
       }else{
           System.out.println("FAIL");
           System.out.println("Expected Title is: "+"Techpro Education | Online It Courses & Bootcamps");
           System.out.println("Actual Title is: "+getTitle);
           LoggerUtils.info("Fail...Page Title is"+driver.getTitle());
       }
        driver.quit();
    }
}
