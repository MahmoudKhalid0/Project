package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ProgramsProjectsRequest extends MainClass{

    @Test(priority = 1)
    public void Login() throws InterruptedException {
        getDriver ().manage ().timeouts ().implicitlyWait (20, SECONDS);
        getDriver ().findElement (By.xpath ("//*[@id=\"mainNavBar\"]/div/a[1]")).click ();
        getDriver ().findElement (By.xpath ("//*[@id=\"step1\"]/div[1]/input")).sendKeys ("2456112669");
        getDriver ().findElement (By.xpath ("//*[@id=\"step1\"]/div[2]/input")).sendKeys ("P@ssw0rd");
        getDriver ().findElement (By.xpath ("//*[@id=\"step1\"]/div[3]/button")).click ();
        Thread.sleep (1000);
        getDriver ().navigate ().back ();
        Thread.sleep (2000);
        getDriver ().navigate ().back ();
    }

    @Test(priority = 2)
    public void selectAssociation() throws InterruptedException {
        getDriver ().findElement (By.xpath ("//*[@id=\"b5-b2-b1-b1-Menu\"]/div/div[2]/div[1]/span")).click ();
        Thread.sleep (1000);
        getDriver ().findElement (By.xpath ("//*[@id=\"b5-b2-b1-Charities\"]/a[21]/span")).click ();
        Thread.sleep (2000);
        getDriver ().findElement (By.xpath ("//*[@id=\"b5-b2-b1-b2-Save\"]/button")).click ();
        Thread.sleep (2000);
    }

    @Test(priority = 3)
    public void starService() throws InterruptedException {
        getDriver ().findElement (By.xpath ("//*[@id=\"$b7\"]/div/div/div[1]/div[2]/button")).click ();
        getDriver ().findElement (By.xpath ("//*[@id=\"sec_services_tab\"]/div[3]/div/div/div/div/a/span[1]")).click ();
        getDriver ().findElement (By.xpath ("//*[@id=\"sec_details\"]/div/div/div[1]/div[2]/div/div[2]/a")).click ();
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-$b1\"]/div/div/div[3]/button[2]")).click ();
        Thread.sleep (3000);
    }

    @Test(priority = 4)
    public void generalDetails() {
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-GeneralDetails_BoardMeetingStatus_Dropdown\"]")).click ();
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-GeneralDetails_BoardMeetingStatus_Dropdown\"]/option[2]")).click ();
        getDriver().findElement(By.xpath("//*[@id=\"b4-IrregularitesStatus_Dropdown\"]")).click();
        getDriver().findElement(By.xpath("//*[@id=\"b4-IrregularitesStatus_Dropdown\"]/option[3]")).click();
    }

    @Test(priority = 5)
    public void technicalDetails() throws InterruptedException {
        String imgPath = System.getProperty ("user.dir") + "/Files/" + "file.pdf";
        Thread.sleep (1000);
        getDriver ().findElement (By.id ("b4-b9-Upload")).sendKeys (imgPath);
    }

    @Test(priority = 6)
    public void programDetails(){
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Input_ProgramName\"]")).sendKeys ("البرامج والمشاريع");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Input_ProgramType\"]")).sendKeys ("البرامج والمشاريع");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Input_NumberProgramActivities\"]")).sendKeys ("5");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Input_NumberProgramBeneficiaries\"]")).sendKeys ("5");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-TextArea_SocietyStrategy\"]")).sendKeys ("البرامج والمشاريع");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-TextArea_PerformanceIndicators\"]")).sendKeys ("البرامج والمشاريع");
    }

    @Test(priority = 7)
    public void timePeriod() {
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Input_StartDate\"]")).sendKeys ("5/21/2023");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Input_EndDate\"]")).sendKeys ("5/23/2023");
    }

    @Test(priority = 8)
    public void programGoals() {
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-TextArea_Description\"]")).sendKeys ("البرامج والمشاريع");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-TextArea_Objectives\"]")).sendKeys ("البرامج والمشاريع");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-TextArea_InterimObjectives\"]")).sendKeys ("البرامج والمشاريع");
    }

    @Test(priority = 9)
    public void financialPartners() throws InterruptedException {
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-b19-Input_PartnerName\"]")).sendKeys ("البرامج والمشاريع");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-b19-Dropdown_PartnershipTypes\"]")).click ();
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-b19-Dropdown_PartnershipTypes\"]/option[3]")).click ();
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-b19-Input_PartnershipEstimated\"]")).sendKeys ("1000");
        // Provide the file path to upload
        String imgPath1 = System.getProperty ("user.dir") + "/Files/" + "file.pdf";
        Thread.sleep (1000);
        getDriver ().findElement (By.id ("b4-b19-b4-Upload")).sendKeys (imgPath1);
        Thread.sleep (1000);
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-b19-b2-Form1\"]/div[2]/button")).click ();
    }

    @Test(priority = 10)
    public void geographicalScope() {
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-RegionCities_DropdownList\"]")).click ();
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-RegionCities_DropdownList\"]/option[3]")).click ();
    }

    @Test(priority = 11)
    public void financialTerms() {
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Input_Totalcurrentliabilities\"]")).sendKeys ("5000");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Input_Criticismanditsequivalent\"]")).sendKeys ("3000");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Input_CurrentYearRevenues\"]")).sendKeys ("2000");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Input_PreviousYearRevenues\"]")).sendKeys ("4000");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Input_Programandactivitiesexpenses\"]")).sendKeys ("2000");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Input_ChangeInNetAssetsForCurrentYear\"]")).sendKeys ("3000");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Input_ChangeInNetAssetsForThePreviousYear\"]")).sendKeys ("6000");
    }

    @Test(priority = 12)
    public void targetItems() {
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-b27-Input_Item\"]")).sendKeys ("البرامج والمشاريع");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-b27-Input_EstimatedValue\"]")).sendKeys ("5000");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-b27-Input_participationvalue\"]")).sendKeys ("3000");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-b27-Input_associationsparticipation\"]")).sendKeys ("1000");
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-b27-b2-Form1\"]/div[2]/button")).click ();
    }

    @Test(priority = 13)
    public void financialDetails() throws InterruptedException {
        String imgPath2 = System.getProperty ("user.dir") + "/Files/" + "file.pdf";
        Thread.sleep (1000);
        getDriver ().findElement (By.id ("b4-b35-Upload")).sendKeys (imgPath2);
    }
    @Test(priority = 14)
    public void sendRequest() {
        getDriver ().findElement (By.xpath ("//*[@id=\"b4-Checkbox1\"]")).click ();
    }
}
