package org.example;


import org.openqa.selenium.By;

import static java.util.concurrent.TimeUnit.*;
import static org.example.MainClass.*;

public class HomePageClass {

    public void ClickMyInbox() {

        getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
        getDriver().findElement(By.linkText("My Inbox")).click();
    }

    public void ClickSystemAdminstration() {

        getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
        getDriver().findElement(By.linkText("System Adminstration")).click();
    }

    public void ClickPreferences() {

        getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
        getDriver().findElement(By.linkText("Preferences")).click();
    }

}
