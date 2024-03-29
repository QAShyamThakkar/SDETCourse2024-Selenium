package com.java.Class46_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MintedWithoutWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://minted.com/");

//        Thread.sleep(10000); //Static Wait

        driver.findElement(By.xpath("//input[@placeholder=\"Email address\"]")).sendKeys("Test@gmail.com");



        driver.findElement(By.xpath("//input[@placeholder=\"Email address\"]")).sendKeys("Test@gmail.com");





    }

}
