package com.java.Class47_WaitRadiobtnCheckBoxDropDown;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBoxEg {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement Option3 = driver.findElement(By.xpath("//input[@value=\"option-3\"]"));
        System.out.println(Option3.isSelected());
        if (Option3.isSelected()) {

        } else {
            Option3.click();
        }

        WebElement Option4 = driver.findElement(By.xpath("//input[@value=\"option-4\"]"));
        if (!Option4.isSelected()) {
            Option4.click();
        }


    }

}
