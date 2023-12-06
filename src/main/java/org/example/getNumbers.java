package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.concurrent.TimeUnit.SECONDS;

public class getNumbers extends MainClass{

    @Test
    public void test() {

        getDriver ().manage ().timeouts ().implicitlyWait (20, SECONDS);
        getDriver ().findElement (By.xpath ("//*[@id=\"Input_UsernameVal\"]")).sendKeys ("aashraf");
        getDriver ().findElement (By.xpath ("//*[@id=\"Input_PasswordVal\"]")).sendKeys ("Arr0@d$23");
        getDriver ().findElement (By.xpath ("//*[@id=\"b6-Button\"]/button")).click ();


        getDriver ().findElement (By.xpath ("//*[@id=\"b1-b2-b2-Menu\"]")).click ();
        getDriver ().findElement (By.xpath ("//*[@id=\"b1-b2-b2-Items\"]/a[7]")).click ();


        getDriver ().findElement (By.xpath ("//*[@id=\"b4-l1_0-70_0-b3-b1-Menu\"]")).click ();
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-l1_0-70_0-view\"]")).click ();


        String originalWindowHandle = getDriver ().getWindowHandle();
        Set<String> windowHandles = getDriver ().getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals (originalWindowHandle)) {
                getDriver ().switchTo ().window (windowHandle);
                break;
            }
        }


        WebElement element1 = getDriver().findElement(By.xpath ("//*[@id=\"b2-b2-b34-b3-Subitem\"]/span"));
        // Extract only the numbers using regex
        String text1 = element1.getText();
        // Use regular expressions to extract only the numbers if the text contains numbers
        Pattern pattern1 = Pattern.compile("\\d+");
        Matcher matcher1 = pattern1.matcher(text1);
        matcher1.find();
        int number1 = Integer.parseInt (matcher1.group());
        System.out.println("Extracted number: " + number1);






    }
}
