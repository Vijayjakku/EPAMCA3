package org.example;

import org.testng.annotations.*;

public class tes1 {
    @BeforeSuite
    void beforesuit(){
        System.out.println("beforesuit");
    }
    @AfterSuite
    void aftersuite(){
        System.out.println("after suite");
    }
    @BeforeTest
    void befretest(){
        System.out.println("Before test");
    }


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
    void test1() {
        System.out.println("thies is test 1 ");
    }

    @Test
    void test2() {
        System.out.println("This is test 2");
    }

    @Test
    void test3() {
        System.out.println("this is test 3");
    }
}
