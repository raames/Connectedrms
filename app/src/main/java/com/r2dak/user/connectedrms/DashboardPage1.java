package com.r2dak.user.connectedrms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

/**
 * Created by olive-001 on 3/6/18.
 */

public class DashboardPage1 {

    public void dbpage1 (WebDriver driver) throws InterruptedException {

        WebElement clientmanagement=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[2]/a"));
        clientmanagement.click();

        WebElement addclient=driver.findElement(By.xpath("//*[@id=\"add-client\"]"));
        addclient.click();
        Thread.sleep(2000);

        WebElement name=driver.findElement(By.xpath("//*[@id=\"name\"]"));
        name.sendKeys("Olive Test12");

        WebElement subdomain=driver.findElement(By.xpath("//*[@id=\"sub_domain\"]"));
        subdomain.sendKeys("olive12");
        Thread.sleep(3000);

        WebElement add=driver.findElement(By.xpath("//*[@id=\"clientmodel\"]/div/div/div[2]/form/div[7]/div/button"));
        add.click();
        Thread.sleep(5000);

    }

    public void view(WebDriver driver) throws InterruptedException {

        WebElement optnbtn = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));
        optnbtn.click();
        Thread.sleep(2000);

        WebElement viewbtn = driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[1]"));
        viewbtn.click();
        Thread.sleep(5000);

        WebElement client=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[2]/a"));
        client.click();
        Thread.sleep(4000);
    }

    public void edit(WebDriver driver) throws InterruptedException {

        WebElement options=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));
        options.click();
        Thread.sleep(2000);

        WebElement edit=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[2]"));
        edit.click();

        WebElement editname=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[1]/div[2]/input"));
        editname.clear();
        editname.sendKeys("Olive Access102");

        WebElement editsub=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[2]/div[2]/input"));
        editsub.clear();
        editsub.sendKeys("oliveacces110");
        Thread.sleep(3000);

        WebElement editsave=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div/div[2]/form/div[7]/div[2]/div/input"));
        editsave.click();
        Thread.sleep(10000);

    }

    public void branding(WebDriver driver) throws Exception {

        WebElement client=driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[3]/ul/li[2]/a"));
        client.click();
        Thread.sleep(2000);

        WebElement option=driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div"));
        option.click();
        Thread.sleep(2000);

        WebElement courses=driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div/div/a[3]"));
        courses.click();
        Thread.sleep(2000);


            WebElement testcourse = driver.findElement(By.xpath("/html/body/div[1]/main/div[5]/div/div/div[1]/div[2]/div/a[1]/div/div[2]/i"));
            testcourse.click();
            Thread.sleep(2000);

            WebElement courseoverview = driver.findElement(By.xpath("//*[@id=\"display_overview\"]"));
            courseoverview.click();

            WebElement coursepreview = driver.findElement(By.xpath("//*[@id=\"display_preview\"]"));
            coursepreview.click();

            WebElement defaultcourse = driver.findElement(By.xpath("//*[@id=\"is_default\"]"));
            defaultcourse.click();
            Thread.sleep(2000);

            WebElement licenseid = driver.findElement(By.xpath("//*[@id=\"license_id\"]"));
            licenseid.sendKeys("1234567");
            Thread.sleep(2000);

            WebElement gbp = driver.findElement(By.xpath("//*[@id=\"GBP\"]"));
            gbp.click();
            Thread.sleep(2000);

            WebElement price = driver.findElement(By.xpath("//*[@id=\"GBP-price\"]"));
            price.sendKeys("200");

            WebElement vat = driver.findElement(By.xpath("//*[@id=\"GBP-vat\"]"));
            vat.sendKeys("13");
            Thread.sleep(3000);

            WebElement add = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div[2]/div/form/div[10]/button"));
            add.click();
            Thread.sleep(2000);

        WebElement clickclient=driver.findElement(By.xpath("/html/body/div[1]/header/div/ul/li[3]/ul/li[2]/a"));
        clickclient.click();
        Thread.sleep(2000);

        WebElement optn=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/button"));
        optn.click();
        Thread.sleep(3000);

        WebElement branding=driver.findElement(By.xpath("//*[@id=\"datatables_wrapper\"]/tbody/tr[1]/td[4]/div/div/a[4]"));
        Thread.sleep(2000);
        branding.click();
        Thread.sleep(5000);

        //Switch tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(5000);

        WebElement customize=driver.findElement(By.xpath("//*[@id=\"config-btn\"]"));
        customize.click();

        WebElement logo = driver.findElement(By.xpath("/html/body/form/div[2]/a[1]"));
        logo.click();

        WebElement upload_img = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]"));
        upload_img.click();
        Thread.sleep(3000);

        Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\AutoIt\\fileupload.exe");

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/form/div[2]/a[2]")).click();  //header
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"cp1\"]")).click();  //bg color
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[2]/div[1]/i")).click(); //select color
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/i/i"));   //close
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/form/div[2]/a[3]")).click();    //Footer
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/form/div[6]/input[1]")).click();    //bg color
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[4]/div[1]/i")).click(); //select bg color
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/form/div[6]/h4")).click();
        driver.findElement(By.xpath("/html/body/form/div[6]/input[2]")).click();    //text field click
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[5]/div[1]/i")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/form/div[2]/a[4]")).click();    //Organisation Branding
        driver.findElement(By.xpath("/html/body/form/div[7]/input")).click(); //organisation branding color
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[6]/div[1]/i")).click(); //select branding color
        driver.findElement(By.xpath("/html/body/form/div[7]/label[1]")).click();    //random click
        driver.findElement(By.xpath("/html/body/form/div[7]/div[1]")).click();    //organisation imgae click
        Thread.sleep(2000);

        Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\AutoIt\\fileupload.exe");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/form/div[2]/a[5]")).click();    //support button

        driver.findElement(By.xpath("/html/body/form/div[8]/input[1]")).click();    //bgcolor
        driver.findElement(By.xpath("/html/body/div[7]/div[1]/i")).click();         //select bg color
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/form/div[8]/label[1]")).click();    //random click
        driver.findElement(By.xpath("/html/body/form/div[8]/input[2]")).click();    //text field
        driver.findElement(By.xpath("/html/body/div[8]/div[1]/i")).click();         //select text color
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/form/div[2]/a[6]")).click();    //sign in button

        driver.findElement(By.xpath("/html/body/form/div[9]/input[1]")).click();    //bgcolor
        driver.findElement(By.xpath("/html/body/div[9]/div[1]/i")).click();         //select bg color
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/form/div[9]/label[1]")).click();    //random click
        driver.findElement(By.xpath("/html/body/form/div[9]/input[2]")).click();    //text field
        driver.findElement(By.xpath("/html/body/div[10]/div[1]/i")).click();         //select text color
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/form/div[2]/a[7]")).click();    //purchase button

        driver.findElement(By.xpath("/html/body/form/div[10]/input[1]")).click();    //bgcolor
        driver.findElement(By.xpath("/html/body/div[11]/div[1]/i")).click();         //select bg color
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/form/div[10]/label[1]")).click();    //random click
        driver.findElement(By.xpath("/html/body/form/div[10]/input[2]")).click();    //text field
        driver.findElement(By.xpath("/html/body/div[12]/div[1]/i")).click();         //select text color
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/form/div[2]/a[8]")).click();    //enroll button

        driver.findElement(By.xpath("/html/body/form/div[11]/input[1]")).click();    //bgcolor
        driver.findElement(By.xpath("/html/body/div[13]/div[1]/i")).click();         //select bg color
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/form/div[11]/label[1]")).click();    //random click
        driver.findElement(By.xpath("/html/body/form/div[11]/input[2]")).click();    //text field
        driver.findElement(By.xpath("/html/body/div[14]/div[1]/i")).click();         //select text color
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/form/div[2]/a[9]")).click();    //primary background

        driver.findElement(By.xpath("/html/body/form/div[12]/input[1]")).click();    //bgcolor
        driver.findElement(By.xpath("/html/body/div[15]/div[1]/i")).click();         //select bg color
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/form/div[12]/label[1]")).click();    //random click
        driver.findElement(By.xpath("/html/body/form/div[12]/input[2]")).click();    //text field
        driver.findElement(By.xpath("/html/body/div[16]/div[1]/i")).click();         //select text color
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/form/div[2]/a[10]")).click();    //secondary background

        driver.findElement(By.xpath("/html/body/form/div[13]/input[1]")).click();    //bgcolor
        driver.findElement(By.xpath("/html/body/div[17]/div[1]/i")).click();         //select bg color
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/form/div[13]/label[1]")).click();    //random click
        driver.findElement(By.xpath("/html/body/form/div[13]/input[2]")).click();    //text field
        driver.findElement(By.xpath("/html/body/div[18]/div[1]/i")).click();         //select text color
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"saveBranding\"]")).click();

        Thread.sleep(15000);

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(5000);

        driver.switchTo().window(tabs.get(0));


      /*  System.setProperty("java.awt.headless", "true");
        Robot robot = new Robot();

            robot.setAutoDelay(2000);
            StringSelection stringSelection = new StringSelection("C:\\Users\\User\\Desktop\\Pink-Butterfly-PNG-File.png");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
            robot.setAutoDelay(1000);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.setAutoDelay(1000);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(3000);

                JavascriptExecutor js = (JavascriptExecutor) driver;
                // js.executeScript("arguments[0].scrollIntoView();", "/*//*[@id=\"app\"]/main/div[5]/div/div/div[2]/div[2]");
                ((JavascriptExecutor) driver)
                        .executeScript("window.scrollTo(0, document.body.scrollHeight)");
            }*/
    }

}
