package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import clientrms.Client_LogoutPage;
import clientrms.Licensed_CoursePage;
import clientrms.Member_Page;
import clientrms.PostNews_Page;
import clientrms.Recommended_CoursePage;

/**
 * Created by olive-001 on 3/7/18.
 */

public class LogoutPage {

    public Licensed_CoursePage licensed_coursePage = new Licensed_CoursePage();
    public Client_LogoutPage client_logoutPage = new Client_LogoutPage();
    public Recommended_CoursePage recommended_coursePage=new Recommended_CoursePage();
    public Member_Page member_page=new Member_Page();
    public PostNews_Page postNews_page=new PostNews_Page();

    public void logout1(WebDriver driver) throws InterruptedException, IOException {

        WebElement superadmin=driver.findElement(By.xpath("//*[@id=\"DropdownMenuLink1\"]"));
        superadmin.click();

        Thread.sleep(3000);
        WebElement logoutbtn=driver.findElement(By.xpath("/html/body/div[2]/header/div/ul/li[1]/div/div/a[2]"));
        logoutbtn.click();
        Thread.sleep(2000);
        driver.quit();

        /*WebElement emailaddress = driver.findElement(By.xpath("/*//*[@id=\"email\"]"));
        emailaddress.sendKeys("con81@yopmail.com");

        WebElement password = driver.findElement(By.xpath("/*//*[@id=\"password\"]"));
        password.sendKeys("secret");

        WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/input"));
        loginbutton.click();
        Thread.sleep(10000);

        licensed_coursePage.licensedcoursebtn(driver);
        licensed_coursePage.dash_licensedcourses(driver);
        //licensed_coursePage.test(driver);
        //recommended_coursePage.recommendcourse(driver);
        member_page.memberpage(driver);
        postNews_page.postnews_page(driver);
        client_logoutPage.clientlogout(driver);*/

    }
}
