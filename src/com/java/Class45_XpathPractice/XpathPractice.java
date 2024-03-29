package com.java.Class45_XpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.ebay.co.uk/");
        Thread.sleep(6000);

//1.        driver.findElement(By.xpath("//span[@id=\"gh-ug-flex\"]/a")).click();
//            driver.findElement(By.xpath("//li[@id=\"gh-minicart-hover\"]")).click();
            driver.findElement(By.xpath("//li[@id=\"gh-eb-My\"]/div/a[1]")).click();

        //span[@id="gh-ug-flex"]/a



    }


}
