package com.r2dak.user.connectedrms;

import android.support.v7.app.AppCompatActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ae.java.awt.AWTException;

/**
 * Created by olive-001 on 3/6/18.
 */

public class LoginPage1{

    public DashboardPage1 dash=new DashboardPage1();
    public Business_Acceleration_Support bas = new Business_Acceleration_Support();
    public UserManagement user=new UserManagement();
    public CourseManagement course=new CourseManagement();
    public Bundles bundle = new Bundles();
    public Client_Customization customize = new Client_Customization();
    public Business_associates associates = new Business_associates();
    public Subscription_Packages subscription = new Subscription_Packages();
    public LogoutPage logout=new LogoutPage();

    @Test
    public void setup() throws Exception {

        System.getProperty("webdriver.gecko.driver"," C:/Users//User/Downloads/Compressed/drivers/geckodriver");
       // System.getProperty("webdriver.gecko.driver","//usr/bin//geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.sandbox.connectedrms.com/");         //site open
       // driver.get("http://www.connectedrms.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/a"));
        login.click();
        Thread.sleep(3000);


        WebElement emailaddress=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailaddress.sendKeys("superadmin@yopmail.com");

        WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("secret");

        WebElement loginbutton=driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/input"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,550)", "");
        loginbutton.click();

        Thread.sleep(5000);
        //dash.add_client(driver);
        dash.client_view(driver);
       // dash.client_edit(driver);
       // bas.BAS(driver);
        //dash.bundles(driver);
       // dash.contacts(driver);
        dash.delete(driver);
        dash.restore(driver);
        //user.create_admin(driver);
        //user.create_member(driver);
//        user.view_user(driver);
//        user.edituser(driver);
//        user.delete(driver);
//        user.restore(driver);
//        course.search_course(driver);
//        course.editcourse(driver);
//        course.option_module(driver);
//        course.module_unit(driver);
//        course.unit_delete(driver);
//        course.unit_restore(driver);
//        bundle.bundles_view(driver);
//        bundle.make_mandatory(driver);
//        bundle.bundle_delete(driver);
//        bundle.bundle_restore(driver);
//        // course.editmodule(driver);
//        // customize.branding(driver);
//
//        associates.add_associates(driver);
//        associates.edit_associates(driver);
//        associates.subscribe_client(driver);
//
//
//        subscription.add_package(driver);
//        subscription.actions_view(driver);
//        subscription.manage_course(driver);
//        subscription.manage_bundle(driver);
//        subscription.sub_delete(driver);
//        subscription.restore(driver);
        //dash.subscription(driver);
        logout.logout1(driver);
    }
}
