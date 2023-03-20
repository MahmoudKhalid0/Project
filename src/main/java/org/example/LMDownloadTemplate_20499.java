package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.example.MainClass.getDriver;
import static org.testng.Assert.assertEquals;

public class LMDownloadTemplate_20499 {
        public void HrLogin () {
            getDriver ().manage ().timeouts ().implicitlyWait (10, SECONDS);
            getDriver ().findElement (By.id ("b2-Input_Username")).sendKeys ("mkhaled");
            getDriver ().findElement (By.id ("b2-Input_Password")).sendKeys ("P@ssw0rd");
            getDriver ().findElement (By.xpath ("//*[@id=\"b2-LoginForm\"]/div[4]/button")).click ();
        }


    public void LookupManagementScreenDisplay () {

        getDriver ().manage ().timeouts ().implicitlyWait (20, SECONDS);
        getDriver ().findElement (By.linkText ("System Administration")).click ();
        getDriver ().findElement (By.linkText ("Lookup Managment")).click ();
        String DisplayPlage = getDriver ().findElement (By.linkText ("Lookup Managment")).getText ();
        assertEquals (DisplayPlage, "Lookup Managment");
        System.out.println ("Page displayed successfully");
    }

    public void LookupScreenAsGridWithColumns () {
        List<WebElement> elements = getDriver ().findElements (By.tagName ("th"));
        String[] expectedTexts = {"Lookup Code", "Lookup Name En", "Lookup Name Ar", "Lookup Type Name", "Lookup Status", ""};
        String[] actualTexts = new String[elements.size ()];
        for (int i = 0; i < elements.size (); i++) {
            // Get the text of each web element.
            actualTexts[i] = elements.get (i).getText ();
        }
        for (int i = 0; i < expectedTexts.length; i++) {
            Assert.assertEquals (actualTexts[i], expectedTexts[i]);
        }
        System.out.println ("Page displayed with list of Lookup as a grid with columns successfully");
    }

    public void TemplateDownload(){
        getDriver ().manage ().timeouts ().implicitlyWait (20, SECONDS);
        getDriver ().findElement(By.xpath ("//*[@id=\"$b5\"]/div/div[2]/div[1]/div[3]/button")).click();
        File file = new File("C:\\Users\\elpro\\Downloads\\Lookup Template.xlsx");
        WebDriverWait wait = new WebDriverWait(getDriver (), 30);
        wait.until((ExpectedCondition<Boolean>) d -> file.exists());
        Assert.assertTrue(file.exists());
        System.out.println ("Template Downloaded successfully");
    }
}
