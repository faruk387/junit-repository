package com.myfirstproject.practices.practice01;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Q05_MedunnaSignIn  extends TestBase {
@Test
    public void medunnaTest(){
    //Go to https://www.medunna.com/
    driver.get("https://www.medunna.com/");
    //Click on human sign
    driver.findElement(By.id("account-menu")).click();
    //click om sign in
    driver.findElement(By.id("login-item")).click();
    //Emter mark_twain user name
    driver.findElement(By.name("username")).sendKeys("mark_twain");
    //Enter pass Mark.123
    driver.findElement(By.name("password")).sendKeys("Mark.123");
    //click remember me
    driver.findElement(By.id("rememberMe")).click();
    //click sign in
    driver.findElement(By.xpath("//button[@type='submit']")).click();
//assert that you signed in

}



}
