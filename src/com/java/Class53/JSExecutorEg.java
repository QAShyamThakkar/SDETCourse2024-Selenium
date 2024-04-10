package com.java.Class53;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class JSExecutorEg {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");

        //=============Method1 - Throw Own Alerts==============
         JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("alert (\"Illiana is exceptional\");");

        //==========Method2 - Scroll To end of the page============
//        Actions actions = new Actions(driver); - No method under Actions class to go to the end of the page
         js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
         Thread.sleep(3000);

        //=============Method3 - Scroll To Top of the page==============
//        js.executeScript("window.scrollTo(0,0);");
          js.executeScript("globalThis.scrollTo({ top: 0, left: 0, behavior: \"smooth\" });");
          js.executeScript("globalThis.scrollTo({ top: 0, left: 0, behavior: \"instant\" });");

    }


}
