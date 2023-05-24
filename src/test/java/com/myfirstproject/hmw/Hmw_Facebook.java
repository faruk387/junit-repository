package com.myfirstproject.hmw;

import com.github.javafaker.Faker;
import com.github.javafaker.Options;
import com.myfirstproject.utilities.TestBase;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Hmw_Facebook extends TestBase {
    @Test
    public void faceTest(){
        driver.get("https://sv-se.facebook.com/");
driver.findElement(By.xpath("//button[contains(@id,'u_0_k')]")).click();
driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
Faker faker =new Faker();

       driver.findElement(By.name("firstname")).sendKeys(faker.name().firstName());
       driver.findElement(By.name("lastname")).sendKeys(faker.name().lastName());
       String email=faker.internet().emailAddress();
       driver.findElement(By.name("reg_email__")).sendKeys(email);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
       driver.findElement(By.id("password_step_input")).sendKeys(faker.internet().password());
WebElement dropdown1=driver.findElement(By.name("birthday_day"));
        Select options1=new Select(dropdown1);
        options1.selectByVisibleText("29");
        WebElement dropdown2=driver.findElement(By.name("birthday_month"));
        Select options2=new Select(dropdown2);
        options2.selectByVisibleText("jan");
        WebElement dropdown3=driver.findElement(By.name("birthday_year"));
        Select options3=new Select(dropdown3);
        options3.selectByVisibleText("1987");
driver.findElement(By.xpath("//label[(text()='Man')]")).click();
driver.findElement(By.name("websubmit")).click();
        Assert.assertEquals("Ange säkerhetskod",driver.findElement(By.className("uiHeaderTitle")).getText());
    }



}
