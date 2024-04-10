package com.java.Class53;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowHandlesUtil {

    static String originalWindowID;

  public static void switchToNewWindow(WebDriver driver){

      //Current Tab ID
      originalWindowID = driver.getWindowHandle();

      //All Tab ID
      Set<String> listOfAllTabIDs = driver.getWindowHandles();

      //Just iterating through all Tab IDs
      for (String eachTabID:listOfAllTabIDs){
          if (!originalWindowID.equals(eachTabID)){
              driver.switchTo().window(eachTabID);
          }
      }
  }
      public static void switchToOriginalWindow(WebDriver driver){
          //Current Tab ID
          driver.switchTo().window(originalWindowID);
  }

}
