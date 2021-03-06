package clientrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created by olive-001 on 6/7/18.
 */

public class PostNews_Page {

    public void postnews_page (WebDriver driver) throws InterruptedException, IOException {

        WebElement news_title = driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div[1]/section[1]/form/input[4]"));
        news_title.sendKeys("Automate news title test");
        Thread.sleep(3000);

        WebElement news_desc = driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div[1]/section[1]/form/div[1]/textarea"));
        news_desc.sendKeys("Automate news description test");
        Thread.sleep(5000);

        WebElement image_upload=driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div[1]/section[1]/form/div[2]/div[1]/div[1]/div"));
        image_upload.click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\AutoIt\\fileupload.exe");
        Thread.sleep(5000);

        //upload video
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div[1]/section[1]/form/div[2]/div[1]/div[2]/div")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\AutoIt\\videoupload.exe");
        Thread.sleep(5000);

        //upload pdf
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div[1]/section[1]/form/div[2]/div[1]/div[3]/div")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\AutoIt\\pdfupload.exe");
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div[1]/section[1]/form/div[2]/div[2]/input")).click();
        Thread.sleep(10000);
    }
}
