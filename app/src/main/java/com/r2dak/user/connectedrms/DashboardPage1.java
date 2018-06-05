package com.r2dak.user.connectedrms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by olive-001 on 3/6/18.
 */

public class DashboardPage1 {

    Actions action;
    WebDriverWait wait;

    public void add_client(WebDriver driver) throws InterruptedException {

        WebElement clientmanagement = driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[2]/a"));
        clientmanagement.click();
        Thread.sleep(2000);

        WebElement addclient = driver.findElement(By.xpath("//*[@id=\"add-client\"]"));
        addclient.click();
        Thread.sleep(2000);

        WebElement name = driver.findElement(By.xpath("//*[@id=\"client_name\"]"));
        name.sendKeys("Selenium5 00 Test");

        WebElement subdomain = driver.findElement(By.xpath("//*[@id=\"client_domain\"]"));
        subdomain.sendKeys("s5t00");
        Thread.sleep(3000);

        //Fullname text
        driver.findElement(By.xpath("//*[@id=\"full_name\"]")).sendKeys("Selenium5 00 Test");

        //Email address
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("s5t00@g.com");
        email.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        //email.sendKeys(Keys.ENTER);

        //Next Button
        driver.findElement(By.xpath("//*[@id=\"step-1\"]/form/div/div/div[5]/div/button")).click();
        Thread.sleep(2000);

        //click radiobutton for AHQ subscription
        driver.findElement(By.xpath("//*[@id=\"new_comp\"]")).click();

        //click next
        driver.findElement(By.xpath("//*[@id=\"step-2\"]/div[2]/form/div/div[4]/div/button[2]")).click();

        //click radiobutton for AHQ subscription
        wait= new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"step-3\"]/div/div/p")));

        //Click Skip
        driver.findElement(By.xpath("//*[@id=\"step-3\"]/div/form/div/div[4]/div/button[1]")).click();

        //Click Submit
        driver.findElement(By.xpath("//*[@id=\"step-4\"]/div/form/div/div[3]/div/button[2]")).click();
        Thread.sleep(3000);

        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    public void option_view(WebDriver driver) throws InterruptedException {
//        WebElement clientmanagement = driver.findElement(By.xpath("/[@id=\"slide-out\"]/ul/li[2]/ul/li[2]/a"));
//        clientmanagement.click();
        Thread.sleep(2000);
        WebElement optn = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div/button"));
        WebElement option_view = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div/div/a[1]"));
        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(5000);
        //you need to release the control from the test
        action.clickAndHold(option_view).release().perform();
        Thread.sleep(2000);

        //Click Edit Client
        driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div[1]/div/div/div/div[2]/div[2]/div/a[3]")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        //Click Courses
        driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div[1]/div/div/div/div[2]/div[2]/div/a[2]")).click();
        //Search Course
        WebElement add_course =  driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[1]/div[1]/div/form/input"));
        add_course.sendKeys("tru4");
        add_course.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        //Click Course
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[1]/div[2]/div/a/div/div[2]/i")).click();
        Thread.sleep(2000);
        //Click Default
        driver.findElement(By.name("is_default")).click();
        //Click Overview
        driver.findElement(By.name("display_overview")).click();
        //Click LinkView
        driver.findElement(By.name("display_video_link")).click();
        //Click Preview
        driver.findElement(By.name("display_preview")).click();

        //Set Prices for gbp
        driver.findElement(By.name("currency[]")).click();

        WebElement gbp_price = driver.findElement(By.name("GBP_amount"));
        gbp_price.sendKeys("10");

        WebElement gbp_vat = driver.findElement(By.name("GBP_vat"));
        gbp_vat.sendKeys("10");

        //Click submit
        driver.findElement(By.cssSelector("input.btn")).click();

        //Click Breadcrumb Clients
        //driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div/ol/li[2]/a")).click();
        Thread.sleep(3000);

    }

    public void client_edit(WebDriver driver) throws InterruptedException {
        //click client
        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[2]/a")).click();

        WebElement optn = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div/button"));
        WebElement edit = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[2]"));

        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(edit).release().perform();
        Thread.sleep(2000);

        WebElement edit_name = driver.findElement(By.name("client_name"));
        edit_name.clear();
        Thread.sleep(2000);
        edit_name.sendKeys("edit Selenium5 00 Test");

        WebElement edit_subdomain = driver.findElement(By.name("client_domain"));
        edit_subdomain.clear();
        Thread.sleep(2000);
        edit_subdomain.sendKeys("es5t00");

        WebElement self_enrol = driver.findElement(By.name("only_selfenrol"));
        self_enrol.click();
        Thread.sleep(2000);

        //click submit
        driver.findElement(By.name("Update")).click();
        Thread.sleep(5000);
    }

    public void bundles(WebDriver driver) throws InterruptedException {

        //click client
        //driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[2]/a")).click();

        WebElement optn = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div/button"));
        WebElement bundle = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div/div/a[5]"));

        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(bundle).release().perform();
        Thread.sleep(2000);

        WebElement search_bundle = driver.findElement(By.name("search"));
        search_bundle.sendKeys("con-80");
        search_bundle.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        WebElement add_bundle = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[1]/div[2]/div/a/div/div[2]/i"));
        add_bundle.click();

        //click radio button of bundle
        driver.findElement(By.name("is_default")).click();

        WebElement submit = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div/form/div[2]/div/input"));
        submit.click();

    }

    public void contacts(WebDriver driver) throws InterruptedException {

        //click client
        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[2]/a")).click();
        Thread.sleep(5000);

        WebElement optn = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div/button"));
        WebElement contact = driver.findElement(By.xpath("//*[@id=\"contact_8afc9e8c-2679-42dd-a28a-4055d9536a83\"]"));

        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(contact).release().perform();
        Thread.sleep(2000);

        //WebElement
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("CKEDITOR.instances.contact.setData('This is contact description')");

        Thread.sleep(3000);

        //click update button
        WebElement update = driver.findElement(By.xpath("//*[@id=\"contactmodal\"]/div/div/div[2]/div[2]/a"));
        js.executeScript("arguments[0].scrollIntoView",update);
        update.click();

        Thread.sleep(2000);

    }

    public void delete(WebDriver driver) throws InterruptedException {

        //click client
        //driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[2]/a")).click();


        WebElement optn = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div/button"));
        WebElement delete = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[8]"));

        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(delete).release().perform();
        Thread.sleep(3000);

        //click modal box Delete
        driver.findElement(By.xpath("//*[@id=\"8afc9e8c-2679-42dd-a28a-4055d9536a83\"]/div/div/div[2]/div[2]/a")).click();
        Thread.sleep(5000);

    }
    public void restore(WebDriver driver) throws InterruptedException {

        WebElement restore_option = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div/button"));
        WebElement restore = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a"));

        action = new Actions(driver);
        action.click(restore_option).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(restore).release().perform();
        Thread.sleep(5000);

    }
}