package com.java.Class42_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg2_Ebay {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.co.uk/");

        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Dell Laptop");

        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();



    }


}
