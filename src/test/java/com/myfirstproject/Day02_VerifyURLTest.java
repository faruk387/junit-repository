package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_VerifyURLTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        //Create a new class: VerifyURLTest 
        //Navigate to TechProEducation homepage 
        driver.get("https://techproeducation.com/");
        //Verify if google homepage url is “https://techproeducation.com/”
        String actualCurrentURL=driver.getCurrentUrl();
        if(actualCurrentURL.equals("https://techproeducation.com/")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL URL: "+actualCurrentURL);
            System.out.println("EXPECTED URL: "+"https://techproeducation.com/");
        }
        driver.quit();
    }
}
