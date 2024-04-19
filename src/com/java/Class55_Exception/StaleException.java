package com.java.Class55_Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaleException  {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.cogmento.com/");

        WebElement login = driver.findElement(By.name("email"));
        login.sendKeys("Old Email");

        driver.navigate().refresh();

        try {
            login.sendKeys("Right Email");
        }catch (StaleElementReferenceException e){
            login = driver.findElement(By.name("email"));
            login.sendKeys("Right Email");
        }










    }


}
