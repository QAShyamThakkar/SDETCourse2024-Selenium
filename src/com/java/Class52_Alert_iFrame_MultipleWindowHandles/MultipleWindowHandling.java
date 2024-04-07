package com.java.Class52_Alert_iFrame_MultipleWindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class MultipleWindowHandling {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.salesforce.com/in/?ir=1");

        WebElement startFree = driver.findElement(By.xpath("//div[@class=\"content__wrapper \"]//a[contains(text(), \"Start free trial\")]"));
        startFree.click();

        //Current Tab ID
        String originalWindowID = driver.getWindowHandle();

        //All Tab ID
        Set<String> listOfAllTabIDs = driver.getWindowHandles();

        //Just iterating through all Tab IDs
        for (String eachTabID:listOfAllTabIDs){
            if (!originalWindowID.equals(eachTabID)){
                driver.switchTo().window(eachTabID);
            }
        }
        WebElement firstName = driver.findElement(By.xpath("//input[contains(@id, \"UserFirstName\")]"));
        firstName.sendKeys("Shyam");

        //Switching back to original window
        driver.switchTo().window(originalWindowID);

    }


}
