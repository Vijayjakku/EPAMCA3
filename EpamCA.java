package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EpamCA {
    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver.get("https://mail.google.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void applySelectors() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("vijaykumarjakku432@gmail.com");
        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        Thread.sleep(10000);

    }

    @AfterClass
    void close(){
        driver.close();
    }
}
