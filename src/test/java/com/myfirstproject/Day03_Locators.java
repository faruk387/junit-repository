package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day03_Locators {
    //    Create a class: Locators
   // When user goes to : https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    //And enter username
   // And enter password
   //And click on submit button
  //  Then verify the login is successful
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
        //This method will be used för pre conditions
    }
    @After
    public void tearDown(){
        //This method will be used for after conditions
driver.quit();
    }
    @Test
    //        Homework : verify if login is successful
//        verify if the URL contains "dashboard" keyword
//        if URL contains dashboard login is successful or else unsuccessful
    public void loginTest() throws InterruptedException {
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        Assert.assertFalse(driver.getCurrentUrl().contains("auth"));
        //putting hard wait. this is a java wait
        Thread.sleep(3000);
        //locatin the menu
        driver.findElement(By.className("oxd-userdropdown-img")).click();
        //locating logout option
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();
        //Asserting logout is succesful
        //        strategy : if the current url contains auth then it means user is back on the login page
        Assert.assertTrue(driver.getCurrentUrl().contains("auth"));
        //        strategy : if Login h5 element is displayed then it means user is back on the login page
        Assert.assertTrue(driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")).isDisplayed());
    }
}
