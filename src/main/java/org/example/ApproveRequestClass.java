package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.example.MainClass.getDriver;

public class ApproveRequestClass {

    public void ApproveForReq() throws InterruptedException {

        getDriver().manage().timeouts().implicitlyWait(15, SECONDS);

        var CMI = new HomePageClass();
        CMI.ClickMyInbox();

        var ClickNewRequest = new MyInboxClass();
        ClickNewRequest.PendingRequests();

        WebElement element =getDriver().findElement(By.xpath("//*[@id=\"b7-$b8\"]/table/tbody/tr[1]/td[1]/a"));
//        sleep(3000);
//        getDriver().navigate().refresh();
//        sleep(3000);
        Actions actions = new Actions (getDriver());
        actions.moveToElement(element).click().build().perform();

        getDriver().findElement(By.xpath("//*[@id=\"b1-b6-ButtonActionCase\"]/div/button[1]")).click();
        getDriver().findElement(By.xpath("//*[@id=\"b1-b22-TextArea_ActionCommentValue\"]")).sendKeys("Approve");
        getDriver().findElement(By.xpath("//*[@id=\"b1-b22-b1-b1-Form1\"]/div[2]/button")).click();
        sleep(2000);
        getDriver().findElement(By.xpath("//*[@id=\"b1-b22-b2-ConfirmsButton\"]/button")).click();
    }

}
