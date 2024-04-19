package com.java.Class53;

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

        //Switching to new Window
        WindowHandlesUtil.switchToNewWindow(driver);

        WebElement firstName = driver.findElement(By.xpath("//input[contains(@id, \"UserFirstName\")]"));
        firstName.sendKeys("Shyam");

        //Switching back to original window
        WindowHandlesUtil.switchToOriginalWindow(driver);
    }


}
