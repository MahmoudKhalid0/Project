package org.example;


import org.openqa.selenium.By;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.example.MainClass.*;

public class MyInboxClass {

	public void MyRequests() {

		getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
		getDriver().findElement(By.xpath("//*[@id=\"b7-b2-Title\"]")).click();

	}

	public void PendingRequests() {

		getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
		getDriver().findElement(By.xpath("//*[@id=\"b7-b3-Title\"]")).click();

	}

	public void SharedRequests() {

		getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
		getDriver().findElement(By.xpath("//*[@id=\"b7-b4-Title\"]")).click();

	}

	public void CreateNewRequest() {

		getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
		getDriver().findElement(By.xpath("//*[@id=\"$b7\"]/div/div[1]/button")).click();

	}

}
