package com.java.Class51;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropEg2 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Static.html");

        WebElement source1 = driver.findElement(By.id("angular"));
        WebElement target1 = driver.findElement(By.id("droparea"));


//        WebElement source2 = driver.findElement(By.xpath("//a[text()=\" BANK \"]"));
//        WebElement target2 = driver.findElement(By.xpath("//div[@id=\"shoppingCart1\"]//li[@class=\"placeholder\"]"));


        Actions actions = new Actions(driver);
//        actions.dragAndDrop(source1,target1).build().perform();
        actions.clickAndHold(source1).moveToElement(target1).release().build().perform();

    }

}
