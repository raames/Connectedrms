package com.r2dak.user.connectedrms;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by User on 3/2/2018.
 */

public class Login {

    public Dashboard dash= new Dashboard();
    public Client_Management client = new Client_Management();
    public Logout user_logout = new Logout();

    @Test
    public void setup() throws InterruptedException {

        System.getProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Compressed\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.sandbox.connectedrms.com/");     //open site

        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("/html/body/div/div[1]/a"), "LOGIN"));

        WebElement login = driver.findElement(By.xpath("/html/body/div/div[1]/a"));
        login.click();

        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("superadmin@yopmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("secret");

        WebElement radiobtn = driver.findElement(By.xpath("/html/body/div[2]/form/label/span"));
        if (!radiobtn.isSelected())
        {
            radiobtn.click();
        }

        WebElement loginbtn = driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/input"));
        loginbtn.click();       //click login btn

        Thread.sleep(5000);

      // dash.dashboard(driver);
       dash.edit(driver);
  //     client.clientManagemenet(driver);
     //  client.edit_client(driver);
       //user_logout.logout(driver);

        driver.close();

    }
}

