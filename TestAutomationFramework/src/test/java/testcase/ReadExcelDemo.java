package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilites.Readxlsdata;

public class ReadExcelDemo extends BaseTest {

	@Test(dataProviderClass = Readxlsdata.class, dataProvider = "bvtdata")
	public void LoginTest(String username, String password) throws InterruptedException {
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		Thread.sleep(2000);
		driver.findElement(By.name(loc.getProperty("email_field"))).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("next_button"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("submit_btn"))).click();

	}

}
