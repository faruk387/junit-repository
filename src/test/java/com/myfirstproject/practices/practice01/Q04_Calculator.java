package com.myfirstproject.practices.practice01;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Q04_Calculator {
    WebDriver driver;
    // Create chrome driver by using @Before annotation and WebDriverManager
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void additionTest(){

// Navigate to  https://testpages.herokuapp.com/styled/index.html
driver.get("https://testpages.herokuapp.com/styled/index.html");
// Click on  Calculator under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
// Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("4");
// Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("6");
// Click on Calculate
        driver.findElement(By.id("calculate")).click();
// Get the result
     String result=   driver.findElement(By.id("answer")).getText();
// Verify the result
        Assert.assertEquals("10",result);
// Print the result
        System.out.println("Result: "+result);

    }
   // Close the browser by using @After annotation
    @After
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void multipTest(){

// Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
// Click on  Calculator under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
//select multip
       WebElement functionDropdown= driver.findElement(By.id("function"));
        Select options=new Select(functionDropdown);
        options.selectByVisibleText("times");
        // Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("4");
// Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("6");
// Click on Calculate
        driver.findElement(By.id("calculate")).click();
// Get the result
        String result=   driver.findElement(By.id("answer")).getText();
// Verify the result
        Assert.assertEquals("24",result);
// Print the result
        System.out.println("Result: "+result);

    }

}
