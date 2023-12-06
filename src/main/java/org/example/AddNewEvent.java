package org.example;

import org.openqa.selenium.By;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.example.MainClass.getDriver;

public class AddNewEvent {



        public void Login() {
            getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
            getDriver().findElement(By.id("Input_UsernameVal")).sendKeys("hibrahim");
            getDriver().findElement(By.id("Input_PasswordVal")).sendKeys("Arr0@d$23");
            getDriver().findElement(By.xpath("//*[@id=\"b6-Button\"]/button")).click();
        }

    public void add_event(){
        getDriver().manage().timeouts().implicitlyWait(15, SECONDS);
        getDriver().findElement(By.xpath("//*[@id=\"b3-b1-Menu\"]/span")).click();
        getDriver().findElement(By.xpath("//*[@id=\"b3-b1-Items\"]/a[2]/span")).click();
        getDriver().findElement(By.xpath("//*[@id=\"$b4\"]/div[1]/div[2]/button")).click();
    }

    public void FillInFields() {
        getDriver ().manage ().timeouts ().implicitlyWait (15, SECONDS);

        //for (int i = 1; i <= 10; i++) {

            getDriver ().findElement (By.id ("b4-Input_TitleEn2")).sendKeys ("New Event");

            getDriver ().findElement (By.id ("b4-Input_TitleAr2")).sendKeys ("حدث جديد");

            getDriver ().findElement (By.id ("b4-TextArea_ValueEn2")).sendKeys ("description");

            getDriver ().findElement (By.id ("b4-TextArea_ValueAr2")).sendKeys ("تفاصيل الحدث");

            getDriver ().findElement (By.id ("b4-Input_speakerNameEn2")).sendKeys ("Mahmoud");

            getDriver ().findElement (By.id ("b4-Input_SpeakerNameAr2")).sendKeys ("محمود");

            getDriver ().findElement (By.xpath ("//*[@id=\"b4-Action\"]/button/span")).click ();
       // }
    }
}
