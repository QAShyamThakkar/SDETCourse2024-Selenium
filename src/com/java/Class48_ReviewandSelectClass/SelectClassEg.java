package com.java.Class48_ReviewandSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectClassEg {
    public static void main(String[] args) {

                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

                WebElement dropDownElement1 = driver.findElement(By.id("dropdowm-menu-1"));

                Select dropDown = new Select(dropDownElement1);
                dropDown.selectByIndex(2);
                dropDown.selectByVisibleText("Python");
                dropDown.selectByValue("python");

                //Get selected option
                WebElement selectedOption = dropDown.getFirstSelectedOption();
                System.out.println(selectedOption.getText());

                 System.out.println("=======================================================");
            //Get all the options from dropdown
             List <WebElement> allOptions   = dropDown.getOptions();
             for(WebElement eachOption:allOptions){
                 System.out.println(eachOption.getText());
             }


    }

}
