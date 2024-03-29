package com.java.Class46_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInToOrangeHRMS {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div/input[@placeholder=\"Username\"]")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/input[@placeholder=\"Password\"]")).sendKeys("admin123");

        driver.findElement(By.xpath("//div/button[@type=\"submit\"]")).click();

    }
}
