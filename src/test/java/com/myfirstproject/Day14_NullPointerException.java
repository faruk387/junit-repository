package com.myfirstproject;

import com.github.javafaker.Faker;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day14_NullPointerException  {
    //    When the object are declared but never instantiated, then we get NullPointerException
    WebDriver driver;
    //    WebDriver driver=new ChromeDriver();
    Faker faker;
    //    Faker faker=new Faker();
    @Test
    public void nullPointerExceptionTest1(){
        driver.get("https://www.amazon.com");//NullPointerException cause driver has no assigned value.(not instantiated)
    }
    @Test
    public void nullPointerExceptionTest2(){
        System.out.println(faker.name().firstName());//NullPointerException
    }


}
