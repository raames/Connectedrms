package clientrms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.transform.sax.TemplatesHandler;

/**
 * Created by olive-001 on 6/5/18.
 */

public class Licensed_CoursePage {

    public void licensedcoursebtn (WebDriver driver) throws InterruptedException {

        //Clicking licensed course '>'
        WebElement btnliensed=driver.findElement(By.xpath("/[@id=\"sidebar-left\"]/aside/div/div[1]/div[1]/a/i"));
        btnliensed.click();

        WebElement enrollbtn=driver.findElement(By.xpath("//*[@id=\"btn-enrol\"]"));
        enrollbtn.click();

        WebElement memberclick=driver.findElement(By.xpath("//*[@id=\"title\"]/div[2]/a[1]/div/div[2]/h3"));
        memberclick.click();
        Thread.sleep(2000);

        //click confirm
        driver.findElement(By.xpath("//*[@id=\"enroll_confirmation\"]/div/div/div/div[2]/button[2]")).click();
        Thread.sleep(2000);

        //enrolment exist ok button
        driver.findElement(By.xpath("//*[@id=\"enroll_confirmation\"]/div/div/div/div[2]/button")).click();
        Thread.sleep(3000);

        //click on search
        driver.findElement(By.xpath("//*[@id=\"enrollment_ko_laagi_member_search_form\"]/input")).click();

        WebElement search_member=driver.findElement(By.xpath("//*[@id=\"enrollment_ko_laagi_member_search_form\"]/input"));
        search_member.sendKeys("con81 m6 test");
        search_member.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        WebElement enrol_member=driver.findElement(By.xpath("//*[@id=\"title\"]/div[2]/a[1]/div/div[2]/span"));
        enrol_member.click();
        Thread.sleep(3000);

        //click on confirm
        driver.findElement(By.xpath("//*[@id=\"enroll_confirmation\"]/div/div/div/div[2]/button[2]")).click();
        Thread.sleep(5000);

        //click on ok while enrolment is done
        driver.findElement(By.xpath("//*[@id=\"enroll_confirmation\"]/div/div/div/div[2]/button")).click();

        //click on close
        driver.findElement(By.xpath("//*[@id=\"enroll-member\"]/div/div/div[1]/button")).click();
        Thread.sleep(2000);

        Thread.sleep(10000);

        //click on view
        WebElement clk_view=driver.findElement(By.xpath("/[@id=\"btn-view\"]"));
        clk_view.click();
        Thread.sleep(3000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(3000);


        jse.executeScript("window.scrollBy(0,-250)", "");
        driver.navigate().back();

        //dashboard licensed course
        WebElement dash_enrol=driver.findElement(By.xpath("//*[@id=\"btn-enrol\"]"));
        dash_enrol.click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"enrollment_ko_laagi_member_search_form\"]/input")).click();

        WebElement dashsearch_member=driver.findElement(By.xpath("//*[@id=\"enrollment_ko_laagi_member_search_form\"]/input"));
        dashsearch_member.sendKeys("con81 m8 test");
        dashsearch_member.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        WebElement dashenrol_member=driver.findElement(By.xpath("//*[@id=\"title\"]/div[2]/a/div/div[2]/h3"));
        dashenrol_member.click();
        Thread.sleep(3000);

        //click on dashboard confirm
        driver.findElement(By.xpath("//*[@id=\"enroll_confirmation\"]/div/div/div/div[2]/button[2]")).click();
        Thread.sleep(4000);

        //while enrolment is done
        driver.findElement(By.xpath("//*[@id=\"enroll_confirmation\"]/div/div/div/div[2]/button")).click();
        Thread.sleep(3000);

        //click on close
        driver.findElement(By.xpath("//*[@id=\"enroll-member\"]/div/div/div[1]/button")).click();
        Thread.sleep(5000);

        //click on view
        WebElement dash_view=driver.findElement(By.xpath("//*[@id=\"btn-view\"]"));
        dash_view.click();
        Thread.sleep(5000);

        //search members
        WebElement dash_search=driver.findElement(By.xpath("//*[@id=\"title\"]/div[1]/form/input"));
        dash_search.click();
        dash_search.sendKeys("con81 m1 test");
        dash_search.clear();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div[1]/button")).click();
        Thread.sleep(5000);

        //driver.switchTo().activeElement();

        //WebElement element = (new WebDriverWait(driver, 15))
                //.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btn-enrol\"]")));

        //click on enroll of view
       WebElement enroll_view=driver.findElement(By.cssSelector(".enroll-block-heading > div:nth-child(3) > button:nth-child(1)"));
       enroll_view.click();
       Thread.sleep(5000);

        WebElement dashview_enroll=driver.findElement(By.xpath("//*[@id=\"enrollment_ko_laagi_member_search_form\"]/input"));
        dashview_enroll.click();
        dashview_enroll.sendKeys("con81 m6 test");
        dashview_enroll.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"title\"]/div[2]/a/div/div[2]/span")).click();


        //click on confirm of enroll of view
        WebElement confirm_enrol=driver.findElement(By.xpath("//*[@id=\"enroll_confirmation\"]/div/div/div/div[2]/button[2]"));
        confirm_enrol.click();
        Thread.sleep(10000);

        //click on ok
        driver.findElement(By.xpath("//*[@id=\"enroll_confirmation\"]/div/div/div/div[2]/button")).click();
        Thread.sleep(5000);

        //click on close of enroll of view
        driver.findElement(By.xpath("//*[@id=\"enroll-member\"]/div/div/div[1]/button")).click();
        Thread.sleep(5000);

        WebElement view_clickview=driver.findElement(By.xpath("//*[@id=\"btn-view\"]"));
        view_clickview.click();
        Thread.sleep(5000);

        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/div[2]/form/input")).click();

        WebElement search_membr=driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/div[2]/form/input"));
        search_membr.sendKeys("con81 m11 test");
        Thread.sleep(5000);

        jse.executeScript("window.scrollBy(0,-250)", "");
        Thread.sleep(5000);
        driver.navigate().back();

    }
}
