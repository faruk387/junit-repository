package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Day08_Cookies extends TestBase {
    @Test
    public void CookiesTest() throws InterruptedException {
        //Class: Cookies
        //Method: handleCookies
                //Go to amazon and automate the tasks:
        driver.get("https://amazon.com");
        //1 Find the total number of cookies
        Set<Cookie> allCookies=driver.manage().getCookies();
        int numberOfCookies=allCookies.size();
        System.out.println("Number of cookies = "+numberOfCookies);
        //2. Print all the cookies

        for(Cookie eachCookie:allCookies){
            System.out.println("Cookie ="+eachCookie);
            System.out.println("Cookie Value = "+eachCookie.getValue());
            System.out.println("Cookie Name = "+eachCookie.getName());
            System.out.println("Cookie Expire = "+eachCookie.getExpiry());
            System.out.println("Cookie Domain = "+eachCookie.getDomain());

        }

//3. Get the cookies by their name
        System.out.println("Cookie by Name = "+driver.manage().getCookieNamed("sp-cdn"));
        //4. Add new cookie
        Cookie myFavoriteCookie=new Cookie("my-cookie","chocolate-chips");
        driver.manage().addCookie(myFavoriteCookie);
        Thread.sleep(3000);
        int newNumberOfCookies=driver.manage().getCookies().size();
        System.out.println("The new Number Of Cookies = "+newNumberOfCookies);
       //5. Delete cookie by name
        driver.manage().deleteCookieNamed("session-id");
       // 6. Delete all of the cookies
        driver.manage().deleteAllCookies();
        System.out.println(driver.manage().getCookies().size());

    }
}
