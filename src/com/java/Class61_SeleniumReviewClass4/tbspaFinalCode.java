package com.java.Class61_SeleniumReviewClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class tbspaFinalCode {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.tsbpa.texas.gov/php/fpl/frmlookup.php");

        WebElement dropdown = driver.findElement(By.id("frmstate"));
        Select select = new Select(dropdown);
        String state;
        List<WebElement> listOfState = select.getOptions();

        for (int i = 5; i <= listOfState.size(); i++) {

            int count = 0, totalFirm=0;
//        List<WebElement> firmLinkList;

            //Other Half Code
            do {
                count++;

                //Handling Stale Element with reassigning the locators again
                dropdown = driver.findElement(By.id("frmstate"));
                select = new Select(dropdown);
                listOfState = select.getOptions();
                state = listOfState.get(i).getText();
                select.selectByVisibleText(state);

                WebElement submitBth = driver.findElement(By.xpath("//input[@name=\"submit\"]"));
                submitBth.click();

                try {
                    //List of all Firms
                    List<WebElement> firmLinkList = driver.findElements(By.xpath("//table[@id=\"results\"]/tbody/tr"));
                    totalFirm=firmLinkList.size();

                    //Clicking on each firm out of Total 25 firms
                    String xpathForListOFRow = "//table[@id=\"results\"]/tbody/tr[%s]";
                    String actualXpathForFirmLink = String.format(xpathForListOFRow, count);
                    WebElement firmLink = driver.findElement(By.xpath(actualXpathForFirmLink));
                    firmLink.click();

                    System.out.print(count +" | "+state +" | ");
                    // Retrieving data from each firm data page
                    List<WebElement> firmAllData = driver.findElements(By.xpath("//table[@align=\"center\"][1]//tr/td[@colspan=\"2\"]"));
                    for (WebElement eachData : firmAllData) {
                        System.out.print(eachData.getText() + " | ");
                    }
                    System.out.println();

                    WebElement backToSelection = driver.findElement(By.name("bsubmit"));
                    backToSelection.click();
                }catch (Exception e){
                    System.out.println(state +": No Data Avialble" );
                }

            } while (count<totalFirm);

        }
   }

}
