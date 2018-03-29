package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by olive-001 on 3/6/18.
 */

public class DashboardPage1 {

    public void dbpage1(WebDriver driver) throws InterruptedException {

        WebElement clientmanagement = driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[2]/a"));
        clientmanagement.click();

        WebElement addclient = driver.findElement(By.xpath("//*[@id=\"add-client\"]"));
        addclient.click();
        Thread.sleep(2000);

        WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        name.sendKeys("Oliv Tst12");

        WebElement subdomain = driver.findElement(By.xpath("//*[@id=\"sub_domain\"]"));

        subdomain.sendKeys("olii01");

        Thread.sleep(3000);

        WebElement add = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[2]/form/div[6]/div"));
        add.click();
        Thread.sleep(5000);

    }

    public void RegisterAHQ(WebDriver driver) throws InterruptedException {

        WebElement optn = driver.findElement(By.xpath("//*[@id=\"add-client\"]"));
        optn.click();
        Thread.sleep(2000);

        WebElement nameregister = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        nameregister.sendKeys("Olive1");

        WebElement subdomainregister = driver.findElement(By.xpath("//*[@id=\"sub_domain\"]"));
        subdomainregister.sendKeys("oliveahq1");

        WebElement register = driver.findElement(By.xpath("//*[@id=\"register_ahq\"]"));
        register.click();
        Thread.sleep(5000);

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"clientmodel\"]/div/div/div[2]/form/div[7]/div/button"));
        submit.click();
        Thread.sleep(3000);
    }

    public void selfenrol(WebDriver driver) throws InterruptedException {

        WebElement addenrol = driver.findElement(By.xpath("//*[@id=\"add-client\"]"));
        addenrol.click();
        Thread.sleep(2000);

        WebElement nameenrol = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        nameenrol.sendKeys("OliveEnrol");

        WebElement subdomainenrol = driver.findElement(By.xpath("//*[@id=\"sub_domain\"]"));
        subdomainenrol.sendKeys("oliveenrol1");

        WebElement selfenrl = driver.findElement(By.xpath("//*[@id=\"only_selfenrol\"]"));
        selfenrl.click();
        Thread.sleep(2000);

        WebElement submitenrol = driver.findElement(By.xpath("//*[@id=\"clientmodel\"]/div/div/div[2]/form/div[7]/div/button"));
        submitenrol.click();
        Thread.sleep(5000);
    }

    public void selfenrolAHQ(WebDriver driver) throws InterruptedException {

        WebElement addAHQ = driver.findElement(By.xpath("//*[@id=\"add-client\"]"));
        addAHQ.click();

        WebElement nameAHQ = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        nameAHQ.sendKeys("AHQ Enrol");

        WebElement subdomainAHQ = driver.findElement(By.xpath("//*[@id=\"sub_domain\"]"));
        subdomainAHQ.sendKeys("ahqenrol1");

        WebElement clkAHQ = driver.findElement(By.xpath("//*[@id=\"register_ahq\"]"));
        clkAHQ.click();
        Thread.sleep(3000);

        WebElement savebtn = driver.findElement(By.xpath("//*[@id=\"clientmodel\"]/div/div/div[2]/form/div[7]/div/button"));
        savebtn.click();
        Thread.sleep(5000);
    }

    public void view(WebDriver driver) throws InterruptedException {

        WebElement optnbtn = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));
        optnbtn.click();
        Thread.sleep(2000);

        WebElement viewbtn = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[1]"));
        viewbtn.click();
        Thread.sleep(5000);

        WebElement client = driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[2]/a"));
        client.click();
        Thread.sleep(4000);
    }

    public void edit(WebDriver driver) throws InterruptedException {

        WebElement options = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));
        options.click();
        Thread.sleep(2000);

        WebElement edit = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[2]"));
        edit.click();

        WebElement editname = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[1]/div[2]/input"));
        editname.clear();
        editname.sendKeys("Olive Access102");

        WebElement editsub = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[2]/div[2]/input"));
        editsub.clear();

        editsub.sendKeys("oliveacces11");

        Thread.sleep(3000);

        WebElement editsave = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[6]/div[2]/div/input"));
        editsave.click();
        Thread.sleep(10000);

    }

    public void contacts(WebDriver driver) throws InterruptedException {


        //click client

        driver.findElement(By.xpath("/html/body/div[1]/header/div/ul/li[3]/ul/li[2]")).click();
        Thread.sleep(3000);

        WebElement optn = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));
        optn.click();
        Thread.sleep(2000);

        WebElement cntcts = driver.findElement(By.id("contact_8a7238b7-cd83-4654-a77d-7a817469ca4c"));
        cntcts.click();
        Thread.sleep(2000);

        //WebElement
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("CKEDITOR.instances.contact.setData('This is contact description')");

        Thread.sleep(3000);

        //click update button

        WebElement update = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div[2]/a"));
        js.executeScript("arguments[0].scrollIntoView",update);
        update.click();

        Thread.sleep(2000);

    }

}