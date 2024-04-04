package com.java.Class49_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class ActionClassEg {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ebay.co.uk/");

//   =============== 1. Hover Mouse ========================================

        WebElement electronics = driver.findElement(By.linkText("Electronics"));

        Actions action = new Actions(driver);
        action.moveToElement(electronics).build().perform();

        WebElement laptopLink = driver.findElement(By.linkText("Laptops & Netbooks"));
        laptopLink.click();

        //build() - to build multiple action
        //perform() - perform that action

        //   ===============2. Scroll Down ========================================
//        for (int i = 0; i < 5; i++) {
//            action.scrollByAmount(2000,2000).build().perform();
//            Thread.sleep(2000);
//        }
//
//        for (int i = 0; i < 5; i++) {
//            action.scrollByAmount(-2000,-2000).build().perform();
//            Thread.sleep(2000);
//        }

        //   ===============3. KeyBoard Action ========================================

        WebElement firstImage = driver.findElement(By.xpath("//img[@class=\"b-img\"][1]"));
        action.keyDown(Keys.CONTROL).click(firstImage).keyUp(Keys.CONTROL).build().perform();

//        firstImage.click();



    }


}


