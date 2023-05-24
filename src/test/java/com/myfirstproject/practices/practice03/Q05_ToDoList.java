package com.myfirstproject.practices.practice03;

import com.beust.ah.A;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Q05_ToDoList extends TestBase {
    @Test
    public void toDoListTest() throws InterruptedException {


  //    Go to http://webdriveruniversity.com/To-Do-List/index.html
  driver.get("http://webdriveruniversity.com/To-Do-List/index.html");
    //  Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)
  WebElement todos=driver.findElement(By.xpath("//input[@type='text']"));
        Actions actions=new Actions(driver);
        actions.click(todos).sendKeys("Prepare breakfast").sendKeys(Keys.ENTER).click(todos).sendKeys("Wash the dishes").sendKeys(Keys.ENTER).click(todos).sendKeys("Take care of baby").sendKeys(Keys.ENTER)
                .click(todos).sendKeys("Help your kid's homework").sendKeys(Keys.ENTER)
                .click(todos).sendKeys("Study Selenium").sendKeys(Keys.ENTER)
                .click(todos).sendKeys("Sleep").sendKeys(Keys.ENTER).perform();
  //    Strikethrough all todos.
List<WebElement> strike=driver.findElements(By.tagName("li"));

for(WebElement w:strike){
    w.click();
}


  //    Delete all todos.
        List<WebElement> trush=driver.findElements(By.xpath("//i[@class='fa fa-trash']"));
        for(WebElement w:trush){
            w.click();
        }

  //    Assert that all todos deleted.
        Thread.sleep(5000);
        int sizeListAfterDelete=driver.findElements(By.tagName("li")).size();
        Assert.assertEquals(0,sizeListAfterDelete);

    }
}
