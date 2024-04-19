package com.java.Class56_Screenshot_DataTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class CalendarComponet {
    static WebDriver driver;

    public static void main(String[] args) throws IOException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.expedia.co.in/");

        String checkInDate = "13 April 2024";
        String checkOutDate = "17 April 2024";
        selectDate(checkInDate, checkOutDate);
    }

    public static void selectDate(String checkInDate, String checkOutDate){

    }

}
