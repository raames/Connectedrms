package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by olive-001 on 3/7/18.
 */

public class LogoutPage {

    public void logout1(WebDriver driver) throws InterruptedException {

        WebElement superadmin=driver.findElement(By.xpath("//*[@id=\"navbarDropdownMenuLink\"]"));
        superadmin.click();

        Thread.sleep(4000);
        WebElement logoutbtn=driver.findElement(By.xpath("//*[@id=\"app\"]/header/nav/ul/li/div/a[2]"));
        logoutbtn.click();
        Thread.sleep(5000);

    }
}
