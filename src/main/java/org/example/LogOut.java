package org.example;


import org.openqa.selenium.By;

import static java.lang.Thread.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.example.MainClass.*;

public class LogOut {

    public void CLogOut() throws InterruptedException {
        getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
        sleep(3000);
        getDriver().findElement(By.xpath("//*[@id=\"b4-b1-b1-Menu\"]")).click();
        getDriver().findElement(By.xpath("//*[@id=\"b4-b1-b1-Items\"]/div/div[2]/a/span")).click();

    }

}
