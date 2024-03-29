package com.java.Class44_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.ebay.co.uk/");
        Thread.sleep(6000);

        driver.findElement(By.xpath("//select")).click();





    }


}
