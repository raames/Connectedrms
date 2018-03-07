package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

/**
 * Created by User on 3/5/2018.
 */

public class Client_Management {

    public void clientManagemenet(WebDriver driver) throws InterruptedException {

     /*   WebDriverWait wait = new WebDriverWait((WebDriver) driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("/*//*[@id=\"navbarDropdownMenuLink\"]"), "SuperAdmin"));*/

        WebElement clientmgmt = driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[2]/a"));
        clientmgmt.click();

        Thread.sleep(3000);

        WebElement name =driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[2]/form/div[1]/input"));
        name.sendKeys("Client1");

        WebElement sub_domain = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[2]/form/div[1]/input"));
        sub_domain.sendKeys("Client.subdomain");

        WebElement app_id =  driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[2]/form/div[1]/input"));
        app_id.sendKeys("1234567890asdfgh");

        Thread.sleep(3000);

        WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[2]/form/div[5]/input"));
        save.click();
    }

    public void edit_client(WebDriver driver) throws InterruptedException {

        Thread.sleep(5000);

        WebElement edit = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div[2]/table/tbody/tr[1]/td[6]/a[1]"));
        edit.click();

        WebElement edit_name = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[2]/form/div[1]/input"));
        edit_name.clear();
        edit_name.sendKeys("EditClient1");

        WebElement edit_sub = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[2]/form/div[2]/input"));
        edit_sub.clear();
        edit_sub.sendKeys("EditClient.subdomain");

        WebElement edit_appid = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[2]/form/div[3]/input"));
        edit_appid.clear();
        edit_appid.sendKeys("sadfgh1234567890");

        Thread.sleep(3000);

        WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[2]/form/div[5]/input"));
        save.click();


    }
}
