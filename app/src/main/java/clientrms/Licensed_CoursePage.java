package clientrms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by olive-001 on 6/5/18.
 */

public class Licensed_CoursePage {

    public void licensedcoursebtn (WebDriver driver) throws InterruptedException {

        //Clicking licensed course '>'
        WebElement btnliensed=driver.findElement(By.linkText("See More Licensed Courses"));
        btnliensed.click();

        WebElement enrollbtn=driver.findElement(By.xpath("//*[@id=\"btn-enrol\"]"));
        enrollbtn.click();
        Thread.sleep(3000);
        /*driver.findElement(By.xpath("/html/body/main/div[3]/div/div/div[1]/button")).click();
        Thread.sleep(2000);*/

        WebElement memberclick=driver.findElement(By.xpath("//*[@id=\"title\"]/div[2]/a[1]/div/div[2]/h3"));
        memberclick.click();
        Thread.sleep(3000);

        //click confirm
        driver.findElement(By.xpath("//*[@id=\"enroll_confirmation\"]/div/div/div/div[2]/button[2]")).click();
        Thread.sleep(3000);

        //enrolment exist ok button
        driver.findElement(By.xpath("//*[@id=\"enroll_confirmation\"]/div/div/div/div[2]/button")).click();
        Thread.sleep(3000);

        //click on search
       // driver.findElement(By.xpath("//*[@id=\"enrollment_ko_laagi_member_search_form\"]/input")).click();

        WebElement search_member=driver.findElement(By.xpath("//*[@id=\"enrollment_ko_laagi_member_search_form\"]/input"));
        search_member.sendKeys("con81 m6 test");
        search_member.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

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
        Thread.sleep(5000);

        //click on view
        WebElement clk_view=driver.findElement(By.linkText("View"));
        clk_view.click();
        Thread.sleep(3000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
        Thread.sleep(4000);
        jse.executeScript("window.scrollTo(document.body.scrollHeight,0)", "");
       // jse.executeScript("window.scrollBy(0,-300)", "");
        Thread.sleep(4000);

        driver.findElement(By.xpath("/html/body/header/div/div/div[2]/ul/li[1]/a")).click();

    }
    public void dash_licensedcourses(WebDriver driver) throws InterruptedException {

        //dashboard licensed course
        WebElement dash_enrol=driver.findElement(By.id("btn-enrol"));
        dash_enrol.click();
        Thread.sleep(3000);

        WebElement dashsearch_member=driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div/div[2]/div[1]/form/input"));
        dashsearch_member.sendKeys("con81 m5 test");
        dashsearch_member.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        WebElement dashenrol_member=driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div/div[2]/div[2]/a/div/div[2]/h3"));
        dashenrol_member.click();
        Thread.sleep(3000);

        //click on dashboard confirm
        driver.findElement(By.xpath("/html/body/main/div/div[4]/div/div/div/div[2]/button[2]")).click();
        Thread.sleep(5000);

        //while enrolment is done
        driver.findElement(By.xpath("/html/body/main/div/div[4]/div/div/div/div[2]/button")).click();
        Thread.sleep(5000);

        //click on close
        driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div/div[1]/button")).click();
        Thread.sleep(3000);


        //click on view
        WebElement dash_view=driver.findElement(By.xpath("//*[@id=\"btn-view\"]"));
        dash_view.click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"course_view_modal\"]/div/div/div[1]/button")).click();

      /*  //search members
        WebElement dash_search=driver.findElement(By.xpath("/*//*[@id=\"title\"]/div[1]/form/input"));
        dash_search.click();
        dash_search.sendKeys("con81 m1 test");
        dash_search.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        dash_search.clear();
        dash_search.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
*/
        //driver.switchTo().activeElement();

        //WebElement element = (new WebDriverWait(driver, 15))
        //.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btn-enrol\"]")));

    }

    public void test(WebDriver driver) throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
       // jse.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");

    /*   WebElement element = (new WebDriverWait(driver, 50))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/*//*[@id=\"btn-enrol\"]")));*/

        //click on view->enroll
driver.findElement(By.xpath("//*[@id=\"btn-enrol\"]")).click();

        //jse.executeScript("scroll(1094, 49)"); // if the element is on top.
        Thread.sleep(3000);

        /*WebElement search_member_enrol=driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div/div[2]/div[2]/a/div"));
        search_member_enrol.click();
        search_member_enrol.clear();
        search_member_enrol.sendKeys("con81 m3 test");
        search_member_enrol.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        //enrol search member
        driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div/div[2]/div[2]/a/div/div[2]/h3")).click();

        //click on confirm of enroll of view
        WebElement confirm_enrol=driver.findElement(By.xpath("/html/body/main/div/div[4]/div/div/div/div[2]/button[2]"));
        confirm_enrol.click();
        Thread.sleep(10000);

        //click on ok
        driver.findElement(By.xpath("/html/body/main/div/div[4]/div/div/div/div[2]/button")).click();
        Thread.sleep(5000);

        //click on close of enroll of view
        driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div/div[1]/button")).click();
        Thread.sleep(5000);*/

        WebElement modal_view=driver.findElement(By.xpath("//*[@id=\"btn-view\"]"));
        modal_view.click();
        Thread.sleep(4000);

        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(3000);

        WebElement search_enrol_member = driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div[2]/div[2]/form/input"));
        search_enrol_member.sendKeys("con81 m3 test");
        jse2.executeScript("window.scrollBy(0,-300)", "");
        Thread.sleep(3000);

        //click feed link
        driver.findElement(By.xpath("/html/body/header/div/div/div[2]/ul/li[1]/a")).click();
        Thread.sleep(5000);
    }
}
