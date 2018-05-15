package com.r2dak.user.connectedrms;

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

    public void dbpage1(WebDriver driver) throws InterruptedException {

        WebElement clientmanagement = driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[2]/a"));
        clientmanagement.click();
        Thread.sleep(2000);

        WebElement addclient = driver.findElement(By.xpath("//*[@id=\"add-client\"]"));
        addclient.click();
        Thread.sleep(2000);

        WebElement name = driver.findElement(By.xpath("//*[@id=\"client_name\"]"));
        name.sendKeys("Client1 Test");

        WebElement subdomain = driver.findElement(By.xpath("//*[@id=\"client_domain\"]"));

        subdomain.sendKeys("cnt1");

        Thread.sleep(3000);

        //Fullname text
        driver.findElement(By.xpath("//*[@id=\"full_name\"]")).sendKeys("Test name");

        //Email address
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("clienttest@yopmail.com");
        email.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        //email.sendKeys(Keys.ENTER);

        //Next Button
//        Actions action = new Actions(driver).doubleClick();
//        WebElement next1 = driver.findElement(By.xpath("/[@id=\"step-1\"]/form/div/div/div[5]/div/button"));
//        action.doubleClick(next1).perform();
        driver.findElement(By.xpath("//*[@id=\"step-1\"]/form/div/div/div[5]/div/button")).click();
        Thread.sleep(2000);

        //click radiobutton for AHQ subscription
        driver.findElement(By.xpath("//*[@id=\"new_comp\"]")).click();


        //click next
        driver.findElement(By.xpath("//*[@id=\"step-2\"]/div[2]/form/div/div[4]/div/button[2]")).click();

        //click radiobutton for AHQ subscription
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("//*[@id=\"step-3\"]/div/div/p")));

        //Click Next
        driver.findElement(By.xpath("//*[@id=\"step-3\"]/div/form/div/div[4]/div/button[1]")).click();
        Thread.sleep(2000);

        //Click Submit
        driver.findElement(By.xpath("//*[@id=\"step-4\"]/div/form/div/div[3]/div/button[2]")).click();
        Thread.sleep(3000);

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

        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[2]/a")).click();
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

    public void delete(WebDriver driver) throws InterruptedException {

        //click client

        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[2]/a")).click();
        Thread.sleep(2000);

        WebElement opt_delete = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div/div/a[6]"));
        WebElement option = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));

        Actions action = new Actions(driver);
        action.click(option).perform();
        //you need to release the control from the test
        action.clickAndHold(opt_delete).release().perform();
        Thread.sleep(3000);

        //click Delete
        driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/a")).click();
        Thread.sleep(2000);



    }
}