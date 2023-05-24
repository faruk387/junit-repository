package com.myfirstproject.hmw;

import com.myfirstproject.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Hmw03  {
    static WebDriver driver;
        /*
    Create and Maximize the driver with the BeforeClass method and put implicit wait for 15 seconds
    Go to http://www.google.com in the before method
    With 3 different test methods:
     -Type "Desktop" in the search box and print the number of results
     -Type "Smartphone" in the search box and print the number of results
     -Type "Laptop" in the search box and print the number of results
    NOTE: Print the result numbers in After method
    Close driver with AfterClass method
     */
    @Before
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();

    }

    @After
    public void tearDown() throws InterruptedException {
        String desktopNumberOfResult= driver.findElement(By.id("result-stats")).getText();
        System.out.println(desktopNumberOfResult);
    }
    @Test
    public void googleTestDesktop(){
        driver.findElement(By.id("APjFqb")).sendKeys("Desktop");
      driver.findElement(By.xpath("//input[@class=‘gNO89b' and @name=‘btnK']")).click();



    }
    public void googleSmartPhoneTest(){
        driver.findElement(By.id("APjFqb")).sendKeys("Smartphone");
    }
    public void googleLaptopTest(){
        driver.findElement(By.id("APjFqb")).sendKeys("Laptop");
    }
@AfterClass
    public static void tearDownClass(){
driver.quit();

}
}
