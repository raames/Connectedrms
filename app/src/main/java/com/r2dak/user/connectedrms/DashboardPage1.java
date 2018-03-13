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

        WebElement addclient=driver.findElement(By.xpath("//*[@id=\"add-client\"]"));
        addclient.click();
        Thread.sleep(2000);

        WebElement name=driver.findElement(By.xpath("//*[@id=\"name\"]"));
        name.sendKeys("Olive Acces1");

        WebElement subdomain=driver.findElement(By.xpath("//*[@id=\"sub_domain\"]"));
        subdomain.sendKeys("oliveacces00");
        Thread.sleep(3000);

        WebElement add=driver.findElement(By.xpath("//*[@id=\"clientmodel\"]/div/div/div[2]/form/div[7]/div/button"));
        add.click();
        Thread.sleep(5000);

    }

    public void view(WebDriver driver) throws InterruptedException {

        WebElement optnbtn = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));
        optnbtn.click();
        Thread.sleep(2000);

        WebElement viewbtn = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[1]"));
        viewbtn.click();
        Thread.sleep(5000);

        WebElement client=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[2]/a"));
        client.click();
        Thread.sleep(4000);
    }

    public void edit(WebDriver driver) throws InterruptedException {

        WebElement options=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));
        options.click();
        Thread.sleep(2000);

        WebElement edit=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[2]"));
        edit.click();

        WebElement editname=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[1]/div[2]/input"));
        editname.clear();
        editname.sendKeys("Olive Access101");

        WebElement editsub=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[2]/div[2]/input"));
        editsub.clear();
        editsub.sendKeys("oliveaccess010");
        Thread.sleep(3000);

        WebElement editsave=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[7]/div[2]/div/input"));
        editsave.click();
        Thread.sleep(10000);

    }

}
