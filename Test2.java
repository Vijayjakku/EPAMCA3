package org.example;

import org.testng.annotations.*;

public class Test2 {
    @AfterClass
    void afterclass() {
        System.out.println("this will run after class");
    }

    @BeforeClass
    void beforeclass() {
        System.out.println("This will run before class");
    }

    @BeforeMethod
    void beforemethod() {
        System.out.println("this will run before every method");
    }

    @AfterMethod
    void aftermethod() {
        System.out.println("This is will run after every every method");
    }

    @Test
    void test4() {
        System.out.println("thies is test 4 ");
    }

    @Test
    void test5() {
        System.out.println("This is test 5");
    }

    @Test
    void test6() {
        System.out.println("this is is 6");
    }
}
