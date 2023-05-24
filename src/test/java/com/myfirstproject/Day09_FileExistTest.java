package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09_FileExistTest {
    @Test
    public void isExist(){
        //Pick a file on your desktop
        //And verify if that file exist on your computer or not
        //Get the path of home directorty
        String userHome=System.getProperty("user.home");
        System.out.println(userHome);
        String pathOfFlower=userHome+"\\Desktop\\flower.jpg";
        System.out.println(pathOfFlower);
        Assert.assertTrue(Files.exists(Paths.get(pathOfFlower)));
       Assert.assertTrue(Files.exists(Paths.get("C:\\Users\\faruk\\Desktop\\flower.jpg")));
    }
}
