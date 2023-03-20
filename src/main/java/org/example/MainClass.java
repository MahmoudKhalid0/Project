package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import static java.lang.System.setProperty;
import static java.util.concurrent.TimeUnit.SECONDS;

public class MainClass {

	 static WebDriver driver;
	 @BeforeTest
	public void SetUp() {
		driver = new ChromeDriver();
		setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://osqa.ksmc.med.sa/HRPlanning/Login");
		driver.manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(10, SECONDS);
	}

	public static WebDriver getDriver() {
		return driver;
	}

//	 @AfterTest
//	 public void EndTest() {
//	 MainClass.getDriver().quit();
//	 }

}
