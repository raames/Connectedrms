package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by User on 5/17/2018.
 */

public class Bundles {

    Actions action;
    public void bundles_view(WebDriver driver) throws InterruptedException {

        //Click Bundles
        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[5]/a")).click();
        Thread.sleep(3000);

        WebElement optn = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/button"));
        WebElement optn_view = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/div/a[1]"));
        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(5000);
        action.clickAndHold(optn_view).release().perform();
        Thread.sleep(5000);

        driver.navigate().back();
    }
    public void make_mandatory(WebDriver driver) throws InterruptedException {
        WebElement optn = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/button"));
        WebElement optn_makemandatory = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/div/a[2]"));
        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        action.clickAndHold(optn_makemandatory).release().perform();
        Thread.sleep(3000);

        //Remove Mandatory
        WebElement option = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/button"));
        WebElement optn_removemandatory = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/div/a[2]"));
        action = new Actions(driver);
        action.click(option).perform();
        Thread.sleep(3000);
        action.clickAndHold(optn_removemandatory).release().perform();
        Thread.sleep(5000);
    }

    public void bundle_delete(WebDriver driver) throws InterruptedException {

        WebElement optn = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/button"));
        WebElement delete = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/div/a[3]"));

        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(delete).release().perform();
        Thread.sleep(3000);

        //click modal box Delete
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[3]/div[1]/div/div/div[2]/div[2]/a")).click();
        Thread.sleep(5000);

    }
    public void bundle_restore(WebDriver driver) throws InterruptedException {
        WebElement restore_option = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/button"));
        WebElement restore = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/div/a"));

        action = new Actions(driver);
        action.click(restore_option).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(restore).release().perform();
        Thread.sleep(5000);

    }
}
