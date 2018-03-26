package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by olive-001 on 3/6/18.
 */

public class CourseManagement {

    public void coursemanagement (WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement coursemanagement1=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[4]/a"));
        coursemanagement1.click();

        WebElement newcourse=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[1]/div/div[1]/button"));
        newcourse.click();
        Thread.sleep(2000);

        WebElement coursename=driver.findElement(By.xpath("//*[@id=\"course_name\"]"));
        coursename.sendKeys("ST Course011");

        WebElement heading=driver.findElement(By.xpath("//*[@id=\"course_heading\"]"));
        heading.sendKeys("Header ST0011 Course011");

        WebElement description=driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/form/div[3]/div/div"));
        js.executeScript("CKEDITOR.instances.course_description.setData('This is description')");
       // description.sendKeys("This is description 101!");
        Thread.sleep(5000);

        // js.executeScript("arguments[0].scrollIntoView();", "/*//*[@id=\"app\"]/main/div[5]/div/div/div[2]/div[2]");
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement addcourse=driver.findElement(By.xpath("//*[@id=\"addcourse\"]/div/div/div[2]/form/div[9]/div/button"));
        addcourse.click();
        Thread.sleep(5000);
    }

    public void viewcourse(WebDriver driver) throws InterruptedException {

        WebElement cours1=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[4]/a"));
        cours1.click();

        WebElement optn=driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[4]/div/button"));
        optn.click();
        Thread.sleep(2000);

        WebElement courseview=driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[4]/div/div/a[1]"));
        courseview.click();
        Thread.sleep(3000);

        WebElement courses=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[4]/a"));
        courses.click();
        Thread.sleep(4000);
    }

    public void editcourse(WebDriver driver) throws InterruptedException {
       WebElement optioncourse=driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[4]/div/button"));
       optioncourse.click();

       WebElement courseedit=driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[4]/div/div/a[2]"));
       courseedit.click();

       WebElement coursename=driver.findElement(By.xpath("//*[@id=\"name\"]"));
       coursename.clear();
       coursename.sendKeys("ST001 Course001");

       WebElement headingcourse=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[2]/div[2]/input"));
       headingcourse.clear();
       headingcourse.sendKeys("Header1 ST001 Course001");
       Thread.sleep(3000);

       WebElement editadd=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[9]/div[2]/div/input"));
       editadd.click();
       Thread.sleep(5000);
    }

    public void moduleoption(WebDriver driver) throws InterruptedException {

        WebElement optionmodule=driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[4]/div/button"));
        optionmodule.click();

        /*WebElement viewmodules=driver.findElement(By.xpath("/[@id=\"app\"]/main/div/div[2]/div/div/div[2]/table/tbody/tr/td[5]/div/button"));
        viewmodules.click();
        Thread.sleep(3000);*/

        WebElement modules=driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[4]/div/div/a[3]"));
        modules.click();
        Thread.sleep(2000);

        WebElement addmodules=driver.findElement(By.xpath("//*[@id=\"add_button\"]"));
        addmodules.click();
        Thread.sleep(2000);

        WebElement modulename=driver.findElement(By.xpath("//*[@id=\"module_name\"]"));
        modulename.sendKeys("Module001");

        WebElement moduledes=driver.findElement(By.xpath("//*[@id=\"module_description\"]"));
        moduledes.sendKeys("Module1001 Description001");
        Thread.sleep(3000);

        WebElement addmodulebtn=driver.findElement(By.xpath("//*[@id=\"addmodule\"]/div/div/div[2]/form/div[3]/button"));
        addmodulebtn.click();
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
