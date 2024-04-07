package com.java.Class52_Alert_iFrame_MultipleWindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iFrame {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame("mce_0_ifr");

        WebElement text = driver.findElement(By.xpath("//body[@id=\"tinymce\"]/p"));
        text.clear();
        text.sendKeys("Shyam");

        driver.switchTo().defaultContent();

        WebElement h3 = driver.findElement(By.xpath("//div[@class=\"example\"]/h3"));
        System.out.println(h3.getText());



    }

}
