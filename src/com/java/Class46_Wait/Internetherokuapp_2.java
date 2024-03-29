package com.java.Class46_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Internetherokuapp_2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Dynamic Loading")).click();

        driver.findElement(By.partialLinkText("Example 2")).click();

        driver.findElement(By.xpath("//div[@id=\"start\"]/button")).click();

        String text = driver.findElement(By.id("finish")).getText();
        System.out.println(text);

    }


}
