package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class Business_associates {

    WebDriverWait wait;
    Actions action;

    public void add_associates(WebDriver driver) throws InterruptedException, IOException {

        //click Business Associates
        driver.findElement(By.xpath("/html/body/div[2]/header/div/ul/li[2]/ul/li[7]/a")).click();
        Thread.sleep(2000);

        //Add associates
        driver.findElement(By.xpath("//*[@id=\"add-client\"]")).click();

        //Add name
        WebElement name = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div/div/div[2]/form/div[1]/label"));
        name.sendKeys("Maestro");

        //Add description
        WebElement desc = driver.findElement(By.xpath("//*[@id=\"description\"]"));
        desc.sendKeys("Add Anything");

        //Add link
        WebElement link = driver.findElement(By.xpath("//*[@id=\"link\"]"));
        link.sendKeys("https://http://www.maestro.com/");

        WebElement upload_logo=driver.findElement(By.xpath("//*[@id=\"logo\"]"));
        upload_logo.click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\AutoIt\\fileupload.exe");
        Thread.sleep(5000);

        //click submit
        driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div/div/div[2]/form/div[6]/div/button")).click();
        Thread.sleep(5000);

    }
    public void edit_associates(WebDriver driver) throws InterruptedException, IOException {

        WebElement option = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/button"));
        WebElement edit = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/div/a[1]"));

        action = new Actions(driver);
        action.click(option).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(edit).release().perform();
        Thread.sleep(5000);

        //Add name
        WebElement edit_name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        edit_name.clear();
        edit_name.sendKeys("Maestro");

        //Add description
        WebElement edit_desc = driver.findElement(By.xpath("//*[@id=\"description\"]"));
        edit_desc.clear();
        edit_desc.sendKeys("Add Anything");

        //Add link
        WebElement edit_link = driver.findElement(By.xpath("//*[@id=\"link\"]"));
        edit_link.clear();
        edit_link.sendKeys("https://http://www.maestro.com/");

        WebElement upload_logo=driver.findElement(By.xpath("//*[@id=\"logo\"]"));
        upload_logo.click();
        Thread.sleep(5000);//*[@id="logo"]
        Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\AutoIt\\logoupload.exe");
        Thread.sleep(5000);

        //click submit
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[3]/form/div[6]/div[2]/button")).click();
        Thread.sleep(3000);
        driver.navigate().back();

    }

    public void subscribe_client(WebDriver driver) throws InterruptedException {

        wait = new WebDriverWait(driver,3);
        WebElement option = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/button"));
        WebElement edit = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/div/a[2]"));

        action = new Actions(driver);
        action.click(option).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(edit).release().perform();
        Thread.sleep(5000);

        //search client
        WebElement search_client = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/form/input[2]"));
        search_client.sendKeys("AhqCrms ");
        Thread.sleep(2000);

        //subscribe
        WebElement subscribe= driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[3]/table/tbody/tr/td[3]/a"));

    }
}
