package com.myfirstproject.practices.practice03;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Q04_FirstAndLastProduct extends TestBase {
    @Test
    public void productTest(){


    //Go to  https://www.saucedemo.com/
  driver.get("https://www.saucedemo.com/");
  //  Enter the username  as "standard_user"
  driver.findElement(By.id("user-name")).sendKeys("standard_user");
  //  Enter the password as "secret_sauce"
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
  //  Click on login button
        driver.findElement(By.id("login-button")).click();
  //  Order products by "Price (low to high)"
driver.findElement(By.className("product_sort_container")).click();
driver.findElement(By.xpath("//option[@value='lohi']")).click();
  //  Assert that last product costs $49.99, first product costs $7.99
List<WebElement> elementPrice=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        Assert.assertEquals("$7.99",elementPrice.get(0).getText());
        Assert.assertEquals("$49.99",elementPrice.get(elementPrice.size()-1).getText());
    }

}
