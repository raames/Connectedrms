package clientrms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by olive-001 on 6/7/18.
 */

public class Member_Page {


    public void memberpage (WebDriver driver) throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
       // jse.executeScript("arguments[0].scrollIntoView(true)","See More Members");
        Thread.sleep(5000);

        //Click on see more member
        WebElement see_member=driver.findElement(By.xpath("/html/body/main/div/div[1]/div[3]/div/aside/div[2]/div[2]/a"));
        see_member.click();
        Thread.sleep(5000);

        WebElement search_member=driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[2]/div/div[1]/form/input"));
        search_member.click();
        search_member.sendKeys("con81 m4 test");
        Thread.sleep(5000);
        search_member.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        WebElement click_member=driver.findElement(By.xpath("//*[@id=\"member-block-list\"]/a/div/div[2]/span"));
        click_member.click();
        Thread.sleep(10000);

        WebElement click_viewcourse=driver.findElement(By.xpath("//*[@id=\"btn-view\"]"));
        click_viewcourse.click();
        Thread.sleep(5000);

        jse.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/div[2]/form/input")).click();

        WebElement search_membr=driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/div[2]/form/input"));
        search_membr.sendKeys("con81 m1 test");
        Thread.sleep(5000);

        jse.executeScript("window.scrollBy(0,-250)", "");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);

        WebElement click_enroll=driver.findElement(By.xpath("//*[@id=\"btn-more\"]"));
        click_enroll.click();
        Thread.sleep(5000);

        WebElement click_search=driver.findElement(By.xpath("//*[@id=\"enrollment_ko_laagi_course_search_form\"]/input"));
        click_search.click();
        click_search.sendKeys("con-81 c2");
        Thread.sleep(5000);
        click_search.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        WebElement click_selectedenroll=driver.findElement(By.xpath("//*[@id=\"title\"]/div[2]/div/div[3]/button"));
        click_selectedenroll.click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"enroll_confirmation\"]/div/div/div/div[2]/button[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"enroll_confirmation\"]/div/div/div/div[2]/button")).click();
        Thread.sleep(3000);

        WebElement click_viewcourse1=driver.findElement(By.xpath("//*[@id=\"title\"]/div[2]/div/div[3]/a"));
        click_viewcourse1.click();
        Thread.sleep(5000);

        jse.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/div[2]/form/input")).click();

        WebElement search_membr1=driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/div[2]/form/input"));
        search_membr1.sendKeys("con81 m11 test");
        Thread.sleep(5000);

        jse.executeScript("window.scrollBy(0,-250)", "");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/a[2]/img")).click();
        Thread.sleep(5000);
    }
}
