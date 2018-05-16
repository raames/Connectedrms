package com.r2dak.user.connectedrms;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import ae.java.awt.AWTException;

/**
 * Created by olive-001 on 3/6/18.
 */

public class LoginPage1 {

    public DashboardPage1 dash=new DashboardPage1();
    public UserManagement user=new UserManagement();
    public CourseManagement course=new CourseManagement();
    public Client_Customization customize = new Client_Customization();
    public LogoutPage logout=new LogoutPage();

    public LoginPage1() throws AWTException {
    }

    @Test
    public void setup() throws Exception {

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

        //dash.add_client(driver);
        //dash.option_view(driver);
        //dash.option_edit(driver);
       // dash.contacts(driver);
        //  dash.delete(driver);
        //  dash.restore(driver);
       // user.create_admin(driver);
        //user.create_member(driver);
        user.view_user(driver);
        user.edituser(driver);
        user.delete(driver);
        user.restore(driver);
        // course.coursemanagement(driver);
        // course.viewcourse(driver);
        // course.editcourse(driver);
        // course.moduleoption(driver);
        // course.editmodule(driver);
        // customize.branding(driver);
        //logout.logout1(driver);
    }
}
