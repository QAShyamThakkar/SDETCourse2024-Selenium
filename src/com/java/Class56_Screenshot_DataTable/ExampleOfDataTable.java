package com.java.Class56_Screenshot_DataTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class ExampleOfDataTable {
    static WebDriver driver;

    public static void main(String[] args) throws IOException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://datatables.net/");
        printTableData("example");
    }

    public static void printTableData(String id){
        String xpath = String.format("//table[@id='%s']/tbody/tr", id);
        List<WebElement> listOfRows = driver.findElements(By.xpath(xpath));
        System.out.println(listOfRows.size());

        for(int i=1; i<=listOfRows.size(); i++){
            xpath = String.format("//table[@id='%s']/tbody/tr[%s]/td", id, i);
            List<WebElement> listOfCells = driver.findElements(By.xpath(xpath));
            for(WebElement cell : listOfCells){
                System.out.print(cell.getText()  +" ");
            }
            System.out.println();
        }
    }

    public static void printTableDataDifferentWay(String id){
        String xpath = String.format("//table[@id='%s']/tbody/tr", id);
        List<WebElement> listOfRows = driver.findElements(By.xpath(xpath));

        for(WebElement row : listOfRows){
            List<WebElement> listOfCells = row.findElements(By.xpath("./td"));

            for(WebElement cell : listOfCells){
                System.out.print(cell.getText()  +" ");
            }

            System.out.println();
        }

    }
}
