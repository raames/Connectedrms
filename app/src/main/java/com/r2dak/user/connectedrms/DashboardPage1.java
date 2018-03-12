package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by olive-001 on 3/6/18.
 */

public class DashboardPage1 {

    public void dbpage1 (WebDriver driver) throws InterruptedException {

        WebElement clientmanagement=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[2]/a"));
        clientmanagement.click();

        WebElement addclient=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[2]/button"));
        addclient.click();
        Thread.sleep(2000);

        WebElement name=driver.findElement(By.xpath("//*[@id=\"name\"]"));
        name.sendKeys("Olive Access");

        WebElement subdomain=driver.findElement(By.xpath("//*[@id=\"sub_domain\"]"));
        subdomain.sendKeys("oliveaccess000");
        Thread.sleep(3000);

        WebElement add=driver.findElement(By.xpath("//*[@id=\"clientmodel\"]/div/div/div[2]/form/div[7]/button"));
        add.click();
        Thread.sleep(5000);
    }

    public void edit(WebDriver driver) throws InterruptedException {

        WebElement options=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));
        options.click();
        Thread.sleep(2000);

        WebElement edit=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[2]"));
        edit.click();

        WebElement editname=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[1]/input"));
        editname.clear();
        editname.sendKeys("Olive Access01");

        WebElement editsub=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[2]/input"));
        editsub.clear();
        editsub.sendKeys("oliveaccess100");
        Thread.sleep(3000);

        WebElement editsave=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[7]/div/input"));
        editsave.click();
        Thread.sleep(10000);

    }

}
