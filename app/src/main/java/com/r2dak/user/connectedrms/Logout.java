package com.r2dak.user.connectedrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by User on 3/2/2018.
 */

public class Logout {

    public void logout(WebDriver driver) throws InterruptedException {

        WebElement down = driver.findElement(By.xpath("//*[@id=\"navbarDropdownMenuLink\"]"));
        down.click();

        Thread.sleep(3000);

        WebElement logout = driver.findElement(By.xpath("//*[@id=\"app\"]/header/nav/ul/li/div/a[2]"));
        logout.click();


        //*[@id="navbarDropdownMenuLink"]
    }
}
