package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Day05_DropDown extends TestBase {
    //1.Create method selectByIndexTest and Select Option 1 using index
    @Test
    public void selectByIndexTest(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        //Go to https://testcenter.techproeducation.com/index.php?page=dropdown

     //locating dropdown
        WebElement dropdown=driver.findElement(By.id("dropdown"));
        //create a select object
        Select options=new Select(dropdown);
//use object to select option
        options.selectByIndex(1);

//2.Create method selectByValueTest Select Option 2 by value
    }
    @Test
    public void selectByValueTest(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement dropdown=driver.findElement(By.id("dropdown"));
        Select options=new Select(dropdown);
        options.selectByValue("2");
    }
    //3.Create method selectByVisibleTextTest Select Option 1 value by visible text
@Test
    public void selectByVisibleTextTest() throws InterruptedException {
    driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    WebElement dropdown=driver.findElement(By.id("dropdown"));
    Select options=new Select(dropdown);
    options.selectByVisibleText("Option 1");
    Thread.sleep(3000);
    options.selectByVisibleText("Option 2");
    Thread.sleep(3000);
    options.selectByVisibleText("Option 1");
    Thread.sleep(3000);
    options.selectByVisibleText("Option 2");

}


//4.Create method printAllTest Print all dropdown value
@Test
    public void printALlTest(){
    driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    WebElement state=driver.findElement(By.id("state"));
    Select options=new Select(state);
   List<WebElement> allStates= options.getOptions();
   for(WebElement eachState: allStates){
       System.out.println(eachState.getText());
   }
    //5. Verify the dropdown has Texas text
   boolean isTexasExist=false;
   for(WebElement eachState:allStates){
       if(eachState.getText().equals("Texas")){
           isTexasExist=true;
       }
   }
    Assert.assertTrue(isTexasExist);


}
    //6.Create method printFirstSelectedOptionTest Print first selected option
    @Test
    public void printFirstSelectedOptionsTest(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement state=driver.findElement(By.id("state"));
        Select options=new Select(state);
        System.out.println("First selected option is: "+options.getFirstSelectedOption().getText());
//7.Find the size of the dropdown
        int numberOfOptions=options.getOptions().size();
// 8Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
Assert.assertEquals("Expected is not egual actual",3,numberOfOptions);
    }





}
