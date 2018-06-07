package clientrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by olive-001 on 6/7/18.
 */

public class Recommended_CoursePage {

    public void recommendcourse (WebDriver driver) throws InterruptedException {

        //Click on recommend course '>'
        WebElement recommend_course=driver.findElement(By.xpath("//*[@id=\"sidebar-left\"]/aside/div/div[2]/div[1]/a/i"));
        recommend_course.click();
        Thread.sleep(5000);

        driver.navigate().back();

    }
}
