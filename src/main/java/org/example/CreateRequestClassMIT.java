package org.example;

import static java.util.concurrent.TimeUnit.*;
import static org.example.MainClass.*;
import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;

public class CreateRequestClassMIT {

    public void ServiceInfoPage() {
        getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
        // Select (Service type)
        getDriver().findElement(By.xpath("//*[@id=\"b7-b8-ProcessDropDown\"]/div")).click();
        getDriver().findElement(By.xpath("//*[@id=\"b7-b8-ProcessDropDown\"]/div[2]/div/div[4]")).click();
        // select (Clearance type)
        getDriver().findElement(By.xpath("//*[@id=\"b7-b8-MainCatDropDown\"]/div")).click();
        getDriver().findElement(By.xpath("//*[@id=\"b7-b8-MainCatDropDown\"]/div[2]/div/div[7]")).click();
        // Select (Sub Category title)
        getDriver().findElement(By.xpath("//*[@id=\"b7-b8-SubCatDropDown\"]/div")).click();
        getDriver().findElement(By.xpath("//*[@id=\"b7-b8-SubCatDropDown\"]/div[2]/div/div[2]")).click();
        // Next button
        getDriver().findElement(By.xpath("//*[@id=\"b7-b8-b1-b1-Form1\"]/div[2]/button")).click();
    }

    public void StatementListPage() {
        getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
        // Approve button
        getDriver().findElement(By.xpath("//*[@id=\"b7-b9-ApproveCheckBox\"]")).click();
        // Next button
        getDriver().findElement(By.id("b7-b9-NextBtn")).click();
    }

    public void RequesterInfoPage() {
        getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
        // Select position level
        getDriver().findElement(By.id("b7-b10-Input_PositionLevel")).click();
        getDriver().findElement(By.xpath("//*[@id=\"b7-b10-Input_PositionLevel\"]/option[3]")).click();
        // Search button
        getDriver().findElement(By.xpath("//*[@id=\"b7-b10-b4-Column2\"]/button")).click();
        // EmployeeNameInput
        getDriver().findElement(By.xpath("//*[@id=\"b7-b10-b9-EmployeeNameInput\"]")).sendKeys("dh");
        // Find button
        getDriver().findElement(By.xpath("//*[@id=\"b7-b10-b9-b1-b1-Form1\"]/div[2]/button")).click();
        // Select direct manager
        getDriver().findElement(By.linkText("DH")).click();
        // Save button
        getDriver().findElement(By.xpath("//*[@id=\"b7-b10-b9-SaveButton\"]")).click();
        // Next button
        getDriver().findElement(By.xpath("//*[@id=\"b7-b10-b1-b1-Form1\"]/div[2]/button")).click();
        // Validate that the requester already have a request in progress
        /*
         * String CantMove = MainClass.getDriver().findElement(By.xpath(
         * "//*[@id=\"b7-$b10\"]/div[1]/div[2]/span")) .getText();
         * assertEquals(CantMove,
         * "can't proceed with this request , the requester already have a request in progress "
         * ); System.out.println("The requester already have a request in progress");
         * MainClass.getDriver().close();
         */

    }

    public void RequestInfoPage() {
        getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
        // Fill out Transfer to
        // MainClass.getDriver().findElement(By.id("b7-b11-Input_Transferto")).sendKeys("uyyuvu");
        // Fill out Request Reason
        getDriver().findElement(By.id("b7-b11-TextArea_RequestReason")).sendKeys("uyyuvu");
        getDriver().findElement(By.xpath("//*[@id=\"b7-b11-b1-b1-Form1\"]/div[2]/button")).click();
    }

    public void AttachmentsPage() {
        getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
        // Next button
        getDriver().findElement(By.xpath("//*[@id=\"b7-$b13\"]/div/div[3]/button[2]")).click();
    }

    public void SummaryPage() {
        getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
        // Submit button
        getDriver().findElement(By.xpath("//*[@id=\"b7-b14-Container_Buttons\"]/button[2]")).click();
        // validate the message confirming the creation of the request
        String CantMoveToNextPage = getDriver().findElement(By.xpath("//*[@id=\"b7-b15-CheckMassage\"]/span"))
                .getText();
        assertEquals(CantMoveToNextPage, " Are you sure that you want to submit the request ?");
        // Yes button
        getDriver().findElement(By.xpath("//*[@id=\"b7-btn_yes\"]")).click();
    }
}
