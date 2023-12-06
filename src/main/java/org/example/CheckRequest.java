package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static java.util.concurrent.TimeUnit.SECONDS;

public class CheckRequest extends MainClass {

    @Test(priority = 1)
    public void Login() throws InterruptedException {

        getDriver ().manage ().timeouts ().implicitlyWait (20, SECONDS);

        getDriver().findElement(By.xpath("//*[@id=\"mainNavBar\"]/div/a[1]")).click();
        getDriver().findElement(By.xpath ("//*[@id=\"step1\"]/div[1]/input")).sendKeys("2456112669");
        getDriver().findElement(By.xpath ("//*[@id=\"step1\"]/div[2]/input")).sendKeys("P@ssw0rd");
        getDriver().findElement(By.xpath("//*[@id=\"step1\"]/div[3]/button")).click();
        Thread.sleep (1000);
        getDriver ().navigate().back();
        Thread.sleep (1000);
        getDriver ().navigate().back();
        getDriver().findElement(By.linkText ("تسجيل الدخول")).click();
    }
    @Test(priority = 2)
    public void SelectAssociation() throws InterruptedException {

        getDriver ().manage ().timeouts ().implicitlyWait (20, SECONDS);
        getDriver().findElement(By.xpath("//*[@id=\"b5-b2-b1-b1-Menu\"]/div/div[2]/div[1]/span")).click();
        getDriver().findElement(By.xpath("//*[@id=\"b5-b2-b1-Charities\"]/a[21]/span")).click();
        getDriver().findElement(By.xpath("//*[@id=\"b5-b2-b1-b2-Save\"]/button")).click();


        Thread.sleep (2000);
        getDriver().findElement(By.linkText ("//*[@id=\"$b7\"]/div/div/div[1]/div[2]/button")).click();
        getDriver().findElement(By.xpath("//*[@id=\"sec_services_tab\"]/div[3]/div/div/div/div/a/span[1]")).click();
    }


}
