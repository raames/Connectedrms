package clientrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by olive-001 on 6/5/18.
 */

public class Client_LogoutPage {


    public void clientlogout(WebDriver driver) throws InterruptedException {

        WebElement clientadmin=driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[3]/ul/li[5]/a"));
        clientadmin.click();

        Thread.sleep(4000);
        WebElement logoutbutton=driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[3]/ul/li[5]/ul/li[2]/a"));
        logoutbutton.click();
        Thread.sleep(5000);

    }
}
