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

        WebElement click_postnews=driver.findElement(By.xpath("//*[@id=\"post-news-modal-show-btn\"]"));
        click_postnews.click();
        Thread.sleep(3000);

        WebElement news_title = driver.findElement(By.xpath("//*[@id=\"post\"]/div/div/div/form/input[4]"));
        news_title.sendKeys("Automate news title test");
        Thread.sleep(2000);

        WebElement news_desc = driver.findElement(By.xpath("//*[@id=\"post\"]/div/div/div/form/div[1]/textarea"));
        news_desc.sendKeys("Automate news description test");
        Thread.sleep(2000);

        WebElement image_upload=driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div[1]"));
        image_upload.click();
        Thread.sleep(3000);

        Runtime.getRuntime().exec("/home/olive-001/Desktop/logo-design-kerala.png");
        Thread.sleep(3000);

    }
}
