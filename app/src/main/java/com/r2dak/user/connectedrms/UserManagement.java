package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by olive-001 on 3/6/18.
 */

public class UserManagement {

    Actions action;
    WebDriverWait wait;

    public void create_admin(WebDriver driver) throws InterruptedException {

        WebElement usermanagement1=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[3]/a"));
        usermanagement1.click();

        Thread.sleep(3000);

        WebElement adduser_btn=driver.findElement(By.xpath("//*[@id=\"add-user\"]"));
        adduser_btn.click();
        Thread.sleep(2000);

        WebElement username=driver.findElement(By.xpath("//*[@id=\"name\"]"));
        username.sendKeys("Adminaut15 Test");

        WebElement emailaddress1=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailaddress1.sendKeys("adminaut15@yopmail.com");

        WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("password");

        WebElement confirmpassword=driver.findElement(By.xpath("//*[@id=\"password-confirm\"]"));
        confirmpassword.sendKeys("password");
        Thread.sleep(3000);

        //Click radiobtn admin
        driver.findElement(By.xpath("//*[@id=\"is_admin\"]")).click();

        WebElement search_org = driver.findElement(By.xpath("//*[@id=\"org_key\"]"));
        search_org.sendKeys("EAutomation15 Test");
        search_org.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

     /*   WebElement add_user=driver.findElement(By.xpath("/*//*[@id=\"AddUser\"]/div/div/div[2]/form/div[7]/div/button"));
        add_user.click();*/

        Thread.sleep(3000);
    }

    public void create_member(WebDriver driver) throws InterruptedException {

        //click user link
        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[3]/a")).click();
        Thread.sleep(3000);

        WebElement add_member=driver.findElement(By.xpath("//*[@id=\"add-user\"]"));
        add_member.click();
        Thread.sleep(2000);

        WebElement username=driver.findElement(By.xpath("//*[@id=\"name\"]"));
        username.sendKeys("maut15 Test");

        WebElement emailaddress1=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailaddress1.sendKeys("maut15@yopmail.com");

        WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("password");

        WebElement confirmpassword=driver.findElement(By.xpath("//*[@id=\"password-confirm\"]"));
        confirmpassword.sendKeys("password");

        //click radiobtn member
        driver.findElement(By.xpath("//*[@id=\"is_member\"]")).click();
        Thread.sleep(3000);

        WebElement select_org = driver.findElement(By.xpath("//*[@id=\"org_key\"]"));
        select_org.sendKeys("EAutomation15 Test");
        select_org.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

//        WebElement add_user=driver.findElement(By.xpath("//*[@id=\"AddUser\"]/div/div/div[2]/form/div[7]/div/button"));
//        add_user.click();
    }

    public void view_user(WebDriver driver) throws InterruptedException {

        //click user link
        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[3]/a")).click();
        Thread.sleep(3000);
        WebElement optn=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[5]/div/button"));
        WebElement optn_view=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[5]/div/div/a[1]"));

        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(optn_view).release().perform();
        Thread.sleep(3000);

        WebElement edit_user=driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div/div/div/div/div/div/div[2]/div[2]/div/a[2]"));
        edit_user.click();
        Thread.sleep(3000);
        driver.navigate().back();

        WebElement edit_psw = driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div/div/div/div/div/div/div[2]/div[2]/div/a[1]"));
        edit_psw.click();
        Thread.sleep(2000);

        //set new and confirm password
        driver.findElement(By.xpath("//*[@id=\"new_password\"]")).sendKeys("secret");
        driver.findElement(By.xpath("//*[@id=\"password-confirm\"]")).sendKeys("secret");
        Thread.sleep(3000);

        //change modal psw button
        driver.findElement(By.xpath("//*[@id=\"change_psw_modal\"]/div/div/div[2]/div/a")).click();
        Thread.sleep(2000);
        driver.navigate().back();

//        //close alert box
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/button")).click();
//        wait = new WebDriverWait(driver, 3);
//        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/button")));
//        driver.navigate().back();

        //driver.navigate().back();
        /*WebElement edituser1=driver.findElement(By.xpath("/*//*[@id=\"name\"]"));
        edituser1.clear();
        edituser1.sendKeys("editMember1test");

        WebElement editemail=driver.findElement(By.xpath("/*//*[@id=\"email\"]"));
        editemail.clear();
        editemail.sendKeys("editmem1st@yopmail.com");
        Thread.sleep(3000);

        WebElement users=driver.findElement(By.xpath("/*//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[3]/div[2]/div/input"));
        users.click();
        Thread.sleep(3000);*/
    }

    public void edituser (WebDriver driver) throws InterruptedException {

        //click user link
       // driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[3]/a")).click();

        Thread.sleep(3000);//*[@id="datatables_wrapper"]/tbody/tr[1]/td[5]/div/button
        WebElement optn=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[5]/div/button"));
        WebElement optn_edit=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[5]/div/div/a[3]"));

        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(optn_edit).release().perform();
        Thread.sleep(2000);

        WebElement edituser=driver.findElement(By.xpath("//*[@id=\"name\"]"));
        edituser.clear();
        edituser.sendKeys("editaug20");

        WebElement editemail=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        editemail.clear();
        editemail.sendKeys("editaug20@yopmail.com");
        Thread.sleep(3000);
        WebElement savebutton=driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/form/div[4]/div[2]/div/input"));
        savebutton.click();
        Thread.sleep(3000);

        //close alert box
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/button")).click();
        wait = new WebDriverWait(driver, 3);
        Thread.sleep(5000);
    }
    public void delete(WebDriver driver) throws InterruptedException {

        //click user link
         driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[3]/a")).click();

        WebElement optn=driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/button"));
        WebElement delete = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/div/a[4]"));

        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(delete).release().perform();
        Thread.sleep(3000);

        //click modal box Delete
        driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/div[1]/div/div/div[2]/div[2]/div[1]/a")).click();
        Thread.sleep(5000);

        //close alert box
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/button")).click();
        wait = new WebDriverWait(driver, 5);

    }
    public void restore(WebDriver driver) throws InterruptedException {

        WebElement restore_option = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/button"));
        WebElement restore = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/div/a"));

        action = new Actions(driver);
        action.click(restore_option).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(restore).release().perform();
        Thread.sleep(5000);

        //close alert box
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/button")).click();
        wait = new WebDriverWait(driver, 5);

    }
}
