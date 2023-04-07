package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
@Test
public class AppTest{
    public void openBrowser(){
        System.out.println("open browser");
    }
    @Test(priority = 1)
    public void clickUMS(){
        System.out.println("opened website");
    }
    @Test(priority = 5)
    public void openHomePage(){
        System.out.println("opened homepage");
    }
    @Test(priority = 2)
    public void openUMS(){
        System.out.println("opened ums");
    }
    @Test
    public void closeUMS(){
        System.out.println("closed ums");
    }


}