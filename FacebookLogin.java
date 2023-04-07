package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;


public class FacebookLogin {

    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize(); //for window to maximize
    }
    @Test
    public void applySelectors() throws InterruptedException {
//        driver.findElement(By.cssSelector("input#email")).sendKeys("7036222848");
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("input#pass")).sendKeys("454554");
//        Thread.sleep(1000);
//
//        driver.findElement(By.cssSelector("input[name=email]")).
//                sendKeys("hello@gmail.com");
//        Thread.sleep(1000);

//        By Tag, Class and Attribute

        driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("apam@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input.inputtext[name=pass]")).sendKeys("sdhfdhbbj");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("button._42ft[name=login]")).click();
        Thread.sleep(10000);


    }

    @AfterClass
    void close(){
        driver.close();
    }


}

// Xpath is a language to finding any element on website using xml path expression.