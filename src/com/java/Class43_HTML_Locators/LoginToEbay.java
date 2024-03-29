package com.java.Class43_HTML_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToEbay {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.ebay.co.uk/");
        Thread.sleep(5000);


//        driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();

////      driver.findElement(By.linkText("Sign in")).click();
//        driver.findElement(By.partialLinkText("Sign")).click();

        driver.findElement(By.id("userid")).sendKeys("TEst@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();





    }


}
