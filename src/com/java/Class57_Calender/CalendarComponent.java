package com.java.Class57_Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class CalendarComponent {
    static WebDriver driver;

    public static void main(String[] args) throws IOException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.expedia.co.in/");

        String checkInDate = "13 June 2024";
        String checkOutDate = "17 July 2024";

        driver.findElement(By.xpath("//button[@data-testid='uitk-date-selector-input1-default']")).click();

        selectDateSimpleWay(checkInDate);
        selectDateSimpleWay(checkOutDate);
        driver.findElement(By.xpath("//button[@data-stid=\"apply-date-selector\"]")).click();
    }

    public static void selectDate(String date){

        String xpathMonthAndYear = "//div[contains(@class,'uitk-month-double-left')]/span";

        String monthYear = date.substring(3);
        String day = date.substring(0, 2);

       WebElement monthAndYear = driver.findElement(By.xpath(xpathMonthAndYear));

       while(!monthAndYear.getText().equals(monthYear)){
           System.out.println(monthAndYear.getText());
           WebElement nextBtn = driver.findElement(By.xpath("//button[@data-stid='uitk-calendar-navigation-controls-next-button']"));
           nextBtn.click();
           monthAndYear = driver.findElement(By.xpath(xpathMonthAndYear));
       }

       String xpathDay = "//span[text()='%s']/../table/tbody//div[contains(@class, 'uitk-date-number-default')][text()='%s']";

       WebElement dayNumber = driver.findElement(By.xpath(String.format(xpathDay, monthYear, day)));
       dayNumber.click();


    }

    public static void selectDateSimpleWay(String date){
        String xpathDate = "//div[contains(@aria-label,'%s')]/following-sibling::div";

        String updatedXpath = String.format(xpathDate, date);

        while(!isPresent(updatedXpath)){
            WebElement nextBtn = driver.findElement(By.xpath("//button[@data-stid='uitk-calendar-navigation-controls-next-button']"));
            nextBtn.click();
        }

        driver.findElement(By.xpath(updatedXpath)).click();
    }

    public static boolean isPresent(String xpath){
        List<WebElement> listOfElement = driver.findElements(By.xpath(xpath));
        return listOfElement.size() > 0;
    }

}
