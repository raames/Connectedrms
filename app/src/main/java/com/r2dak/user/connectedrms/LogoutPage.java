package com.example.olive_001.connectedrms1;

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

        WebElement logoutbtn=driver.findElement(By.xpath("//*[@id=\"app\"]/header/nav/ul/li/div/a[2]"));
        logoutbtn.click();
        Thread.sleep(5000);

    }
}
