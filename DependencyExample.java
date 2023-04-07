package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
    @Test
    void login(){
        System.out.println("Login to UMS");
        Assert.fail();
    }

    @Test(dependsOnMethods = "login")
    void accessHomePage(){
        System.out.println("Home page accessed");
    }
    @Test(dependsOnMethods = {"login","accesHomePage"},alwaysRun = true, enabled = false)
    void accessAnnouncement(){
        System.out.println("View announcement");
    }
}
