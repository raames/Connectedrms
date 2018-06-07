package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by User on 6/5/2018.
 */

public class Subscription_Packages {

    Actions action;

    public void add_package(WebDriver driver) throws InterruptedException {

        //click Subscription link
        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[7]/a")).click();
        Thread.sleep(3000);

        //Add Package
        driver.findElement(By.xpath("//*[@id=\"add_button\"]")).click();

        WebElement subscription_name = driver.findElement(By.id("subscription_name"));
        subscription_name.sendKeys("Automation Subscription");
        Thread.sleep(2000);

        WebElement description_name = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[2]/form/div/div/div[2]/textarea"));
        description_name.sendKeys("Subscription test1");
        Thread.sleep(2000);

        //click create service
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[2]/form/div/div/div[3]/div/button")).click();
        Thread.sleep(3000);

        //Add course
        WebElement search_course = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[3]/div[2]/form/div/div[1]/div[1]/div/div/div/input"));
        search_course.click();
        Thread.sleep(3000);
        search_course.sendKeys("c");
        Thread.sleep(2000);
        search_course.sendKeys("m");
        Thread.sleep(2000);
        search_course.sendKeys("s");
        Thread.sleep(4000);

        //Add course
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[3]/div[2]/form/div/div[1]/div[2]/div[1]/div[2]/div[1]/button")).click();
        Thread.sleep(3000);

        //Click next
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[3]/div[2]/form/div/div[3]/div/button")).click();
        Thread.sleep(2000);

        //search bundle
        WebElement search_bundle = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[4]/div[2]/form/div/div[1]/div[1]/div/div[2]/div/input"));
        search_bundle.click();
        Thread.sleep(3000);
        search_bundle.sendKeys("t");
        Thread.sleep(2000);
        search_bundle.sendKeys("e");
        Thread.sleep(2000);
        search_bundle.sendKeys("s");
        Thread.sleep(2000);
        search_bundle.sendKeys("t");
        Thread.sleep(4000);

        //Add Bundle
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[4]/div[2]/form/div/div[1]/div[2]/div[1]/div[2]/div[1]/button")).click();
        Thread.sleep(2000);

        //click next
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[4]/div[2]/form/div/div[3]/div/button")).click();
        Thread.sleep(2000);

        //Create service
        WebElement service_name = driver.findElement(By.xpath("//*[@id=\"service_names\"]"));
        service_name.sendKeys("Platinium");
        Thread.sleep(2000);

        //max license allowed
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[5]/div/form/div/div[1]/div/div[3]/div[2]/div/input")).click();
        Thread.sleep(2000);

        //max member allowed
        WebElement max_member = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[5]/div/form/div/div[1]/div[1]/div[4]/div[1]/div/input"));
        max_member.sendKeys("2000");
        Thread.sleep(2000);

        //max enrolment
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[5]/div/form/div/div[1]/div/div[5]/div[2]/div/input")).click();
        Thread.sleep(2000);
        //Set Price
        WebElement per_month = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[5]/div/form/div/div[1]/div[1]/div[6]/div/div/div[1]/div/input"));
        per_month.sendKeys("1000");
        Thread.sleep(2000);

        WebElement per_year = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[5]/div/form/div/div[1]/div[1]/div[6]/div/div/div[2]/div/input"));
        per_year.sendKeys("2000");
        Thread.sleep(2000);

        WebElement one_time = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[5]/div/form/div/div[1]/div[1]/div[6]/div/div/div[3]/div/input"));
        one_time.sendKeys("5000");
        Thread.sleep(5000);

        /*//ADD MORE
        driver.findElement(By.xpath("/*//*[@id=\"step-4\"]/div/form/div/div[3]/div/button[1]")).click();

        //Create 2nd Service
        WebElement service_name1 = driver.findElement(By.xpath("/*//*[@id=\"service_names\"]"));
        service_name1.sendKeys("Gold");
        Thread.sleep(2000);

        //max license allowed
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[5]/div/form/div/div[1]/div[2]/div[3]/div[2]/div/input")).click();
        Thread.sleep(2000);

        //max member allowed
        WebElement max_member1 = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[5]/div/form/div/div[1]/div[2]/div[4]/div[1]/div/input"));
        max_member1.sendKeys("200");
        Thread.sleep(2000);

        //max enrolment
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[5]/div/form/div/div[1]/div[2]/div[5]/div[2]/div/input")).click();
        Thread.sleep(2000);

        //Set Price
        WebElement per_month1 = driver.findElement(By.xpath("/*//*[@id=\"service-container\"]/div[2]/div[6]/div/div/div[1]/div/input"));
        per_month1.sendKeys("200");
        Thread.sleep(2000);

        WebElement per_year1 = driver.findElement(By.xpath("/*//*[@id=\"service-container\"]/div[2]/div[6]/div/div/div[2]/div/input"));
        per_year1.sendKeys("300");
        Thread.sleep(2000);

        WebElement one_time1 = driver.findElement(By.xpath("/*//*[@id=\"service-container\"]/div[2]/div[6]/div/div/div[3]/div/input"));
        one_time1.sendKeys("1000");
        Thread.sleep(3000);
*/
        //Submit Service
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[5]/div/form/div/div[3]/div/button[2]")).click();
        Thread.sleep(5000);

    }
    public void actions_view(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[7]/a")).click();
        Thread.sleep(3000);
        WebElement optn = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[5]/div/button"));
        WebElement view = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a[1]"));

        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(view).release().perform();
        Thread.sleep(2000);

        //Open service
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/a")).click();
        Thread.sleep(3000);

        //open bundles view
        driver.findElement(By.xpath("//*[@id=\"bundle_show\"]")).click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(3000);

    }

    public void manage_course(WebDriver driver) throws InterruptedException {

        WebElement optn = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[5]/div/button"));
        WebElement manage_course = driver.findElement(By.xpath("//*[@id=\"manage-course\"]"));

        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(manage_course).release().perform();
        Thread.sleep(2000);

        WebElement search_course = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/div[11]/div/div/div[2]/div/div[1]/div/div[2]/input[1]"));
        search_course.click();
        Thread.sleep(2000);
        search_course.sendKeys("client june test01");
        search_course.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        //add_course
        driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/div[11]/div/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/button")).click();
        Thread.sleep(3000);

        //exit modal box
        driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/div[11]/div/div/div[1]/button")).click();
        Thread.sleep(3000);

    }

    public void manage_bundle(WebDriver driver) throws InterruptedException {

        WebElement optn = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[5]/div/button"));
        WebElement manage_bundle = driver.findElement(By.xpath("//*[@id=\"manage-bundle\"]"));

        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(manage_bundle).release().perform();
        Thread.sleep(2000);

        WebElement search_bundle = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/div[12]/div/div/div[2]/div/div[1]/div/div[2]/input[1]"));
        search_bundle.click();
        Thread.sleep(2000);
        search_bundle.sendKeys("CoursePackage");
        search_bundle.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        //add_bundle
        driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/div[12]/div/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/button")).click();
        Thread.sleep(3000);

        //exit modal box
        driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/div[12]/div/div/div[1]/button")).click();
        Thread.sleep(3000);
    }

    public void sub_delete(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/header/div/ul/li[2]/ul/li[7]/a")).click();
        Thread.sleep(2000);
        WebElement optn = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[5]/div/button"));
        WebElement del = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a[5]"));

        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(del).release().perform();
        Thread.sleep(3000);

        //click delete
       driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div[2]/a")).click();
        Thread.sleep(3000);
    }

    public void restore(WebDriver driver) throws InterruptedException {


        WebElement restore_option = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/button"));
        WebElement restore = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/div/a"));

        action = new Actions(driver);
        action.click(restore_option).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(restore).release().perform();
        Thread.sleep(5000);

    }
}
