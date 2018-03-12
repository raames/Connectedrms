package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by olive-001 on 3/6/18.
 */

public class UserManagement {


    public void usermanagement(WebDriver driver) throws InterruptedException {

        WebElement usermanagement1=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[3]/a"));
        usermanagement1.click();

        WebElement adduser=driver.findElement(By.xpath("//*[@id=\"add-user\"]"));
        adduser.click();
        Thread.sleep(2000);

        WebElement username=driver.findElement(By.xpath("//*[@id=\"name\"]"));
        username.sendKeys("Sajdaah Bano");

        WebElement emailaddress1=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailaddress1.sendKeys("seleniumtest012@yopmail.com");

        WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("password");

        WebElement confirmpassword=driver.findElement(By.xpath("//*[@id=\"password-confirm\"]"));
        confirmpassword.sendKeys("password");
        Thread.sleep(3000);

        WebElement adduser1=driver.findElement(By.xpath("//*[@id=\"centralModalSuccess\"]/div/div/div[2]/form/div[5]/div/button"));
        adduser1.click();
        Thread.sleep(5000);

    }

    public void viewuser (WebDriver driver) throws InterruptedException {

        WebElement optionview=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));
        optionview.click();
        Thread.sleep(2000);

        WebElement userview=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[1]"));
        userview.click();
        Thread.sleep(3000);

        WebElement users=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[3]/a"));
        users.click();
        Thread.sleep(5000);
    }

    public void edituser (WebDriver driver) throws InterruptedException {


        WebElement optionsedit=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[2]/td[4]/div/button"));
        optionsedit.click();

        WebElement useredit=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[2]/td[4]/div/div/a[2]"));
        useredit.click();
        Thread.sleep(5000);

        WebElement edituser1=driver.findElement(By.xpath("//*[@id=\"name\"]"));
        edituser1.clear();
        edituser1.sendKeys("Rabin Karmacharya");

        WebElement editemail=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        editemail.clear();
        editemail.sendKeys("rabin012@yopmail.com");
        Thread.sleep(3000);

        WebElement savebutton=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[3]/div/input"));
        savebutton.click();
        Thread.sleep(10000);

    }
}
