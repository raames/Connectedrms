package com.example.olive_001.connectedrms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by olive-001 on 3/6/18.
 */

public class CourseManagement {
    public void coursemanagement (WebDriver driver) throws InterruptedException {

        WebElement coursemanagement1=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[4]/a"));
        coursemanagement1.click();

        WebElement newcourse=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/a"));
        newcourse.click();
        Thread.sleep(2000);

        WebElement coursename=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[1]/input"));
        coursename.sendKeys("ST Course01");

        WebElement heading=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[2]/input"));
        heading.sendKeys("Header ST001 Course01");

        WebElement description=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[3]/textarea"));
        description.sendKeys("This is description 1!");
        Thread.sleep(3000);

        WebElement addcourse=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[8]/button"));
        addcourse.click();
        Thread.sleep(5000);
    }

    public void editcourse(WebDriver driver) throws InterruptedException {
       WebElement optioncourse=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[3]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/button"));
       optioncourse.click();

       WebElement courseedit=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[3]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a[2]"));
       courseedit.click();

       WebElement coursename=driver.findElement(By.xpath("//*[@id=\"name\"]"));
       coursename.clear();
       coursename.sendKeys("ST001 Course001");

       WebElement headingcourse=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[2]/input"));
       headingcourse.clear();
       headingcourse.sendKeys("Header1 ST001 Course001");
       Thread.sleep(3000);

       WebElement editadd=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[8]/div/input"));
       editadd.click();
       Thread.sleep(5000);
    }

    public void moduleoption(WebDriver driver) throws InterruptedException {

        WebElement optionmodule=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[3]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/button"));
        optionmodule.click();

        WebElement viewmodules=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[3]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a[3]"));
        viewmodules.click();
        Thread.sleep(3000);

        WebElement addmodule=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/a"));
        addmodule.click();
        Thread.sleep(2000);

        WebElement modulename=driver.findElement(By.xpath("//*[@id=\"name\"]"));
        modulename.sendKeys("Module001");

        WebElement moduledes=driver.findElement(By.xpath("//*[@id=\"description\"]"));
        moduledes.sendKeys("Module1001 Description001");
        Thread.sleep(3000);

        WebElement addmodulebtn=driver.findElement(By.xpath("//*[@id=\"addmodule\"]/div/div/div[2]/form/div[3]/button"));
        addmodulebtn.click();
        Thread.sleep(5000);
    }

    public void editmodule(WebDriver driver) throws InterruptedException {

        WebElement editoption=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[3]/div/div/div[2]/table/tbody/tr/td[4]/div/button"));
        editoption.click();

        WebElement editmodule1=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[3]/div/div/div[2]/table/tbody/tr/td[4]/div/div/a[2]"));
        editmodule1.click();
        Thread.sleep(2000);

    }
}
