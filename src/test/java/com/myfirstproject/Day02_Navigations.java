package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Navigations {
    public static void main(String[] args) {
        //Set up
        System.setProperty("webdriwer.chrome.driver",".drivers/chromedriver.exe");
        //Create the driver object
        WebDriver driver=new ChromeDriver();
      //Now that we have out driver instance, we can start creating our test script

       // Maximize the window
        driver.manage().window().maximize();

       // Open google home page https://www.walmart.com/.
        driver.get("https://www.walmart.com/");
       // On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.navigate().to("https://www.amozon.com/");//Alternative way to navigate
       // Navigate back to google
        driver.navigate().back();
       // Navigate forward to amazon
        driver.navigate().forward();
       // Refresh the page
        driver.navigate().refresh();
       // Close/Quit the browser
        //There are 2 ways to close the browser.close or quit. we should use only one
        //driver.close();
        driver.quit();
        /*
        What is the difference between get and navigate to functions?
        *Similarities: both let you go to a page
        *get is more common that navigate to
        *accepts only string as url, navigate to accepts both string and url
        *navigate has more options such as tp() back() refresh()
        What is the difference between driver.quit and driver.close functions
        *close closed only the last active window
        *quit close just one window

         */
    }
}
