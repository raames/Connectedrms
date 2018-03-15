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

    public void brandings(WebDriver driver) throws InterruptedException {

        WebElement client=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[2]/a"));
        client.click();
        Thread.sleep(2000);

        WebElement option=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));
        option.click();
        Thread.sleep(2000);

        WebElement courses=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[3]"));
        courses.click();
        Thread.sleep(2000);

        WebElement testcourse=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[5]/div/div/div[1]/div[2]/div/a[1]/div/div[1]"));
        testcourse.click();
        Thread.sleep(2000);

        WebElement courseoverview=driver.findElement(By.xpath("//*[@id=\"display_overview\"]"));
        courseoverview.click();

        WebElement coursepreview=driver.findElement(By.xpath("//*[@id=\"display_preview\"]"));
        coursepreview.click();

        WebElement defaultcourse=driver.findElement(By.xpath("//*[@id=\"is_default\"]"));
        defaultcourse.click();
        Thread.sleep(2000);

        WebElement licenseid=driver.findElement(By.xpath("//*[@id=\"license_id\"]"));
        licenseid.sendKeys("1234567");
        Thread.sleep(2000);

        WebElement gbp=driver.findElement(By.xpath("//*[@id=\"GBP\"]"));
        gbp.click();
        Thread.sleep(2000);

        WebElement price=driver.findElement(By.xpath("//*[@id=\"GBP-price\"]"));
        price.sendKeys("200");

        WebElement vat=driver.findElement(By.xpath("//*[@id=\"GBP-vat\"]"));
        vat.sendKeys("13");
        Thread.sleep(3000);

        WebElement add=driver.findElement(By.xpath("//*[@id=\"addcourseForm\"]/div[10]/button"));
        add.click();
        Thread.sleep(2000);

        WebElement clickclient=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[2]/a"));
        clickclient.click();
        Thread.sleep(2000);

        WebElement optn=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));
        optn.click();
        Thread.sleep(3000);

        WebElement branding=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[4]"));
        branding.click();
        Thread.sleep(10000);

        //driver.switchTo().window(driver.getWindowHandle());

        //driver.switchTo().defaultContent();

        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }


        WebElement customize=driver.findElement(By.id("id=\"config-btn\""));
        customize.click();
        Thread.sleep(3000);
    }


}
