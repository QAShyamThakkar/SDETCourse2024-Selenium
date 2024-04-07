package com.java.Class47_WaitRadiobtnCheckBoxDropDown;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitEg_Site1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");


        WebElement DynamicLoadinglink = driver.findElement(By.xpath("//a[@href=\"/dynamic_loading\"]"));
        DynamicLoadinglink.click();



//        Thread.sleep(10000);
        WebElement Example1 = driver.findElement(By.partialLinkText("Example 1"));
        Example1.click();


        WebElement start = driver.findElement(By.xpath("//div[@id=\"start\"]/button"));
        start.click();

//        Thread.sleep(5000);

        WebElement text = driver.findElement(By.id("finish"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(text));


        String text1 =text.getText();

        System.out.println(text1);
    }
}
