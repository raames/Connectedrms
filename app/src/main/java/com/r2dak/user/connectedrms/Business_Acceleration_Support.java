package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Business_Acceleration_Support  {

    Actions action;
    //WebDriverWait wait1 = new WebDriverWait(driver,3);

    public void BAS(WebDriver driver) throws InterruptedException {

        //click BAS
        //driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[3]")).click();

        WebElement optn = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));
        WebElement optn_BAS = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/div/a[3]"));
        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        action.click(optn_BAS).perform();
        Thread.sleep(3000);

        //Search
        WebElement search = driver.findElement(By.xpath("//*[@id=\"form-search\"]/input[2]"));
        Thread.sleep(2000);
        search.sendKeys("B! test1");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        WebElement subscribe = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[5]/a"));
        WebElement unsubscribe = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[3]/table/tbody/tr/td[5]/a"));
        System.out.println("text" + subscribe.getText());
        String Subscribe = null;
        if(Subscribe!=subscribe.getText()){
            unsubscribe.click();
            Thread.sleep(5000);
            //click close pop-up
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/button")).click();
        }
        //click Subscribe
      //  driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[5]/a")).click();

        //click close pop-up
       // driver.findElement(By.xpath("//*[@id=\"message_alert\"]/div/div/div[1]/button/span")).click();
    }

}
