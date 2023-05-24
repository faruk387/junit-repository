package com.myfirstproject;

import org.junit.*;

public class Day03_Annotations {
    /*
    ***.There are 6 junit annotations
        1. @Test : is used to create test cases are created to do assertions
        2. @Before and @After : are used to run before or after every EACH @Test method
        3. @BeforeClass and @AfterClass: are used to run before or after EACH CLASS ONLY ONCE. These methods must be static.
        4. @Ignore  is used to skip  a test  case

     * */
    @Before
    public void setUp(){
        System.out.println("This is BEFORE method>>>>>>RUNS BEFORE EACH TEST METHOD");
    /*
    Pre Conditions are put in this @Before method such as SET UP,create driver,maximize window,implicit wait
     */
    }
    @After
    public void tearDown(){

        /*
    After Conditions are put in this @After method such as quit or close,report generations,...
     */ System.out.println("This is AFTER method >>>>>>> RUNS AFTER EACH TEST METHOD");
    }
    @BeforeClass
    public static void setUpClass(){
        System.out.println("This is BEFORE CLASS>>>>> RUNS BEFORE EACH CLASS");
    }
   @AfterClass
    public static void tearDownClass(){
        System.out.println("This is AFTER CLASS>>>>> RUNS AFTER EACH CLASS");
    }
    @Test
    public void test01(){
        System.out.println("This is test case 1");
    }
    @Test
    public void test2(){
        System.out.println("This is test case 2");
    }
    @Test
    public void test3(){
        System.out.println("This is test case 3");
    }
    @Test @Ignore
    public void test4(){
        System.out.println("This is test case 4");
        System.out.println("@Ignore will make this method SKIPPED");
    }
    @Test
    public void test5(){
        System.out.println("This is test case 5");
    }
    @Test
    public void test6(){
        System.out.println("This is test case 6");
    }
}
