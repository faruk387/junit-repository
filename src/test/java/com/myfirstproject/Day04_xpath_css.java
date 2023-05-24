package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04_xpath_css {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @After
    public void tearDown(){
//driver.quit();
    }
    @Test
    public void loginTest(){
       // driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        driver.getCurrentUrl().contains("dashboard");
    }
    @Test
    public void loginTest2(){
        WebElement username1=driver.findElement(By.cssSelector("input[name='username']"));
        username1.sendKeys("Admin");
        WebElement password1=driver.findElement(By.cssSelector("input[name='password']"));
        password1.sendKeys("admin123");
        WebElement loginButton1=driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton1.click();


    }

}
