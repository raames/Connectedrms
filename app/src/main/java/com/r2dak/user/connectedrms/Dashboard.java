package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by User on 3/2/2018.
 */

public class Dashboard {

    public void dashboard(WebDriver driver) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//*[@id=\"navbarDropdownMenuLink\"]"), "SuperAdmin"));

        WebElement usermgmt = driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[3]/a"));
        usermgmt.click();

        Thread.sleep(2000);

        WebElement createUser = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[1]/a"));
        createUser.click();

        Thread.sleep(2000);

        WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        name.sendKeys("UserPeka1");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("pekauser1@yopmail.com");

        WebElement pw = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        pw.sendKeys("qwerty");

        WebElement pwConfirmation = driver.findElement(By.xpath("//*[@id=\"password-confirm\"]"));
        pwConfirmation.sendKeys("qwerty");

        Thread.sleep(3000);

        //click save button
        WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[2]/form/div[5]/div/input"));
        save.click();

        Thread.sleep(5000);

    }

    public void edit(WebDriver driver) throws InterruptedException {

        WebElement usermgmt = driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[3]/a"));
        usermgmt.click();

        //Wait for Edit button
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[1]/span"), "User Management"));

        WebElement edit = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[2]/table/tbody/tr[1]/td[4]/a[1]"));
        edit.click();

        Thread.sleep(3000);

        WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        name.clear();
        name.sendKeys("EditPekaa01");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.clear();
        email.sendKeys("Editpekaa01@yopmail.com");

        Thread.sleep(2000);

        WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[2]/form/div[3]/div/input"));
        save.click();
        Thread.sleep(10000);

    }
}
