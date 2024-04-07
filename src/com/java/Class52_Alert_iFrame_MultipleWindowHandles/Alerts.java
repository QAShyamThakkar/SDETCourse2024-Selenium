package com.java.Class52_Alert_iFrame_MultipleWindowHandles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //====================Alert1=======================================
        WebElement firstBtn = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        firstBtn.click();

        Alert alert1 = driver.switchTo().alert();
        alert1.accept();


        WebElement result = driver.findElement(By.id("result"));
        System.out.println(result.getText());

        //====================Alert2=======================================

        WebElement secondBtn = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        secondBtn.click();

        Alert alert2 = driver.switchTo().alert();
//      alert2.accept();
        alert2.dismiss();

        WebElement result1 = driver.findElement(By.id("result"));
        System.out.println(result1.getText());

        //====================Alert3=======================================

        WebElement thirdBtn = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        thirdBtn.click();

        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Francis is working");
        alert3.accept();

        WebElement result2 = driver.findElement(By.id("result"));
        System.out.println(result2.getText());

    }

}
