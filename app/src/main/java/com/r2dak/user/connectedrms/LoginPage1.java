package com.example.olive_001.connectedrms1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by olive-001 on 3/6/18.
 */

public class LoginPage1 {

    public DashboardPage1 dash=new DashboardPage1();
    public UserManagement user=new UserManagement();
    public CourseManagement course=new CourseManagement();
    public LogoutPage logout=new LogoutPage();

    @Test
    public void setup() throws InterruptedException {

        System.getProperty("webdriver.gecko.driver","//usr/bin//geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.sandbox.connectedrms.com/");         //site open
        Thread.sleep(3000);

        WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/a"));
        login.click();
        Thread.sleep(3000);


        WebElement emailaddress=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailaddress.sendKeys("superadmin@yopmail.com");

        WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("secret");

        WebElement loginbutton=driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/input"));
        loginbutton.click();
        Thread.sleep(5000);

        dash.dbpage1(driver);
        dash.edit(driver);
        user.usermanagement(driver);
        user.edituser(driver);
        course.coursemanagement(driver);
        course.editcourse(driver);
        course.moduleoption(driver);
        //course.editmodule(driver);
        logout.logout1(driver);
    }
}
