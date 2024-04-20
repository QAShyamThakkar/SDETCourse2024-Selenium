package com.java.Class60_SeleniumReviewClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class tbspaSelectState {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.tsbpa.texas.gov/php/fpl/frmlookup.php");

        WebElement dropdown = driver.findElement(By.id("frmstate"));
        Select select = new Select(dropdown);
        String state;
        List<WebElement> listOfState = select.getOptions();

        for (int i = 1; i <= listOfState.size(); i++) {

            //Handling Stale Element with reassigning the locators again

               dropdown = driver.findElement(By.id("frmstate"));
               select = new Select(dropdown);
                listOfState = select.getOptions();
                state = listOfState.get(i).getText();
                select.selectByVisibleText(state);


            WebElement submitBth = driver.findElement(By.xpath("//input[@name=\"submit\"]"));
            submitBth.click();

            WebElement textForFirm = driver.findElement(By.xpath("//th[@class=\"smallinforight\"]"));
            System.out.println(state + ": " + textForFirm.getText());

            WebElement backToSelection = driver.findElement(By.name("bsubmit"));
            backToSelection.click();
        }


    }

}
