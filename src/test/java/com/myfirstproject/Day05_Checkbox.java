package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day05_Checkbox  {
    //Create test method and complete the following task.
    //Go to https://testcenter.techproeducation.com/index.php?page=checkboxes
    //Locate the elements of checkboxes
    //Then click on checkbox1 if box is not selected
    //Then click on checkbox2 if box is not selected
    //Then verify that checkbox1 is checked.
    WebDriver driver;
    @Before
    public void setUp()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");

    }
    @Test
    public void checkboxText(){

        //Then click on checkbox1 if box is not selected
        //locating the element by xpath
       WebElement checkbox1=driver.findElement(By.xpath("//input[@id='box1']"));
      //is checkbox 1 is already selected
       boolean isCheckbox1Selected=checkbox1.isSelected();
       if(!isCheckbox1Selected){
           checkbox1.click();
       }
        //Then click on checkbox2 if box is not selected
       //locating the element by xpath
        if(!driver.findElement(By.xpath("//input[@id='box2']")).isSelected()){
            driver.findElement(By.xpath("//input[@id='box2']")).click();;
        //is checkbox 2 is already selected{

        }
        Assert.assertTrue(checkbox1.isSelected());//PASS is checkbox1 is selected. FAILS if checkbox1 is NOT selected
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='box2']")).isSelected());

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
