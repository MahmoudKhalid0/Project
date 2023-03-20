package org.example;


import org.openqa.selenium.By;

import static java.lang.Thread.*;
import static java.util.concurrent.TimeUnit.*;
import static org.example.MainClass.*;

public class LoginClass {

    public void Login(String UserName, String PassWord) throws InterruptedException {

        getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
        sleep(2000);
        getDriver().findElement(By.id("b2-Input_Username")).sendKeys(UserName);
        getDriver().findElement(By.id("b2-Input_Password")).sendKeys(PassWord);
        getDriver().findElement(By.xpath("//*[@id=\"b2-LoginForm\"]/div[4]/button")).click();
    }

}