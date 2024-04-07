package com.java.Class47_WaitRadiobtnCheckBoxDropDown;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ExplicitWaitEg_Site2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");


        WebElement DynamicLoadinglink = driver.findElement(By.xpath("//a[@href=\"/dynamic_loading\"]"));
        DynamicLoadinglink.click();

//  Thread.sleep(6000);


        WebElement Example2 = driver.findElement(By.xpath("//a[@href=\"/dynamic_loading/2\"]"));
        Example2.click();


        WebElement start = driver.findElement(By.xpath("//div[@id=\"start\"]/button"));
        start.click();
//  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

//        Thread.sleep(8000);

        String text = driver.findElement(By.id("finish")).getText();

        System.out.println(text);
    }
}


