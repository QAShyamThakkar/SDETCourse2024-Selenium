package com.java.Class50_ActionClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class YouTubeReels {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.youtube.com/shorts/D23ms5gJCIk");

        WebElement playBtn  =driver.findElement(By.xpath("//ytd-player[@id=\"player\"]"));
        playBtn.click();

        Actions action = new Actions(driver);

        for (int i = 0; i < 50; i++) {
            Thread.sleep(10000);
            action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
        }





    }



}
