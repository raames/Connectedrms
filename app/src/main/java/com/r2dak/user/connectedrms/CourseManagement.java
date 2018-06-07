package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by olive-001 on 3/6/18.
 */

public class CourseManagement {

    public DashboardPage1 db = new DashboardPage1();

    Actions action;
    public void search_course(WebDriver driver) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //click Course link
        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/ul/li[4]/a")).click();

        WebElement search=driver.findElement(By.xpath("//*[@id=\"form-search\"]/input"));
        search.click();
        search.sendKeys("coursa test");
        Thread.sleep(2000);
        search.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        WebElement optn = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr/td[4]/div/button"));
        WebElement optn_view = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr/td[4]/div/div/a[1]"));

        action =new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        action.clickAndHold(optn_view).release().perform();
        Thread.sleep(3000);

        //click edit course
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div/a")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().back();

        /*WebElement heading=driver.findElement(By.xpath("/*//*[@id=\"course_heading\"]"));
        heading.sendKeys("Header ST0011 Course011");

        WebElement description=driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/form/div[3]/div/div"));
        js.executeScript("CKEDITOR.instances.course_description.setData('This is description')");
        // description.sendKeys("This is description 101!");
        Thread.sleep(5000);

        // js.executeScript("arguments[0].scrollIntoView();", "*//*//**//*[@id=\"app\"]/main/div[5]/div/div/div[2]/div[2]");
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement addcourse=driver.findElement(By.xpath("/*//*[@id=\"addcourse\"]/div/div/div[2]/form/div[9]/div/button"));
        addcourse.click();
        Thread.sleep(5000);*/
    }

    public void editcourse(WebDriver driver) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement optn = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr/td[4]/div/button"));
        WebElement course_edit=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/table/tbody/tr/td[4]/div/div/a[2]"));
        action =new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        action.clickAndHold(course_edit).release().perform();
        Thread.sleep(3000);

        WebElement headingcourse=driver.findElement(By.name("heading"));
        headingcourse.clear();
        headingcourse.sendKeys("Course Heading Test");
        Thread.sleep(2000);

        js.executeScript("CKEDITOR.instances.description.setData('This is description')");
        js.executeScript("CKEDITOR.instances.overview.setData('This is overview')");
        js.executeScript("CKEDITOR.instances.preview.setData('This is preview')");

        WebElement preview_link = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[6]/div[2]/input"));
        preview_link.clear();
        preview_link.sendKeys("https://www.youtube.com/embed/bnVUHWCynig");
        Thread.sleep(3000);

        //click save button
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[7]/div[2]/div/input")).click();
        Thread.sleep(5000);
    }

    public void option_module(WebDriver driver) throws InterruptedException {

        WebElement optn = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[4]/div/button"));
        WebElement optn_module=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[4]/div/div/a[3]"));
        action =new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        action.clickAndHold(optn_module).release().perform();
        Thread.sleep(3000);

        //Click ADD Module
        driver.findElement(By.xpath("//*[@id=\"add_button\"]")).click();

        WebElement modulename=driver.findElement(By.xpath("//*[@id=\"module_name\"]"));
        modulename.sendKeys("Module 001 test");

        WebElement module_des=driver.findElement(By.xpath("//*[@id=\"module_description\"]"));
        module_des.sendKeys("Module 001 test Description001");
        Thread.sleep(3000);

        WebElement add=driver.findElement(By.xpath("//*[@id=\"addmodule\"]/div/div/div[2]/form/div[3]/button"));
        add.click();
        Thread.sleep(3000);
    }

    public void module_unit(WebDriver driver) throws InterruptedException {

        WebElement optn = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/button"));
        WebElement optn_unit=driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a[3]"));
        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(2000);
        action.clickAndHold(optn_unit).release().perform();
        Thread.sleep(3000);

        //Click Add Unit
        driver.findElement(By.xpath("//*[@id=\"add_button\"]")).click();

        WebElement unit_name = driver.findElement(By.id("unit_name"));
        unit_name.clear();
        unit_name.sendKeys("Automate module unit Test");

        WebElement unit_desc = driver.findElement(By.id("unit_description"));
        unit_desc.clear();
        unit_desc.sendKeys("The effectiveness of testing these applications varies widely among companies and organizations.");
        Thread.sleep(2000);

        //click save unit
        driver.findElement(By.xpath("//*[@id=\"addunit\"]/div/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);

    }

    public void unit_delete(WebDriver driver) throws InterruptedException {

        WebElement optn = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/button"));
        WebElement delete = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a[3]"));

        action = new Actions(driver);
        action.click(optn).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(delete).release().perform();
        Thread.sleep(3000);

        //click modal box Delete
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/a")).click();
        Thread.sleep(5000);

    }
    public void unit_restore(WebDriver driver) throws InterruptedException {
        WebElement restore_option = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[3]/table/tbody/tr[1]/td[5]/div/button"));
        WebElement restore = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[3]/table/tbody/tr[1]/td[5]/div/div/a"));

        action = new Actions(driver);
        action.click(restore_option).perform();
        Thread.sleep(3000);
        //you need to release the control from the test
        action.clickAndHold(restore).release().perform();
        Thread.sleep(5000);

    }
    public void editmodule(WebDriver driver) throws InterruptedException {

        WebElement editoption=driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[4]/div/button"));
        editoption.click();

        WebElement editmodule1=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/table/tbody/tr/td[4]/div/div/a[2]"));
        editmodule1.click();
        Thread.sleep(2000);

    }
}
