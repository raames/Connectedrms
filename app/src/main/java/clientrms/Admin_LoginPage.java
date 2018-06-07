package clientrms;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by olive-001 on 6/5/18.
 */

public class Admin_LoginPage {

    public Licensed_CoursePage licensed_coursePage = new Licensed_CoursePage();
    public Client_LogoutPage client_logoutPage = new Client_LogoutPage();
    public Recommended_CoursePage recommended_coursePage=new Recommended_CoursePage();
    public Member_Page member_page=new Member_Page();
    public PostNews_Page postNews_page=new PostNews_Page();



    @Test
    public void setup() throws Exception {

        System.getProperty("webdriver.gecko.driver", "//usr/bin//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.sandbox.connectedrms.com/");         //site open
        Thread.sleep(3000);

        WebElement login = driver.findElement(By.xpath("/html/body/div/div[1]/a"));
        login.click();
        Thread.sleep(3000);


        WebElement emailaddress = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailaddress.sendKeys("con81@yopmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("secret");

        WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/input"));
        loginbutton.click();
        Thread.sleep(10000);

        licensed_coursePage.licensedcoursebtn(driver);
        //recommended_coursePage.recommendcourse(driver);
        //member_page.memberpage(driver);
        //postNews_page.postnews_page(driver);
        //client_logoutPage.clientlogout(driver);

    }
}
