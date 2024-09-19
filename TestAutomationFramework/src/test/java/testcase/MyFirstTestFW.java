/*
 * package testcase;
 * 
 * import org.openqa.selenium.By; import org.testng.annotations.DataProvider;
 * import org.testng.annotations.Test;
 * 
 * import base.BaseTest;
 * 
 * public class MyFirstTestFW extends BaseTest {
 * 
 * @Test(dataProvider = "testdata") public void LoginTest(String username,
 * String password) throws InterruptedException {
 * driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
 * Thread.sleep(2000);
 * driver.findElement(By.name(loc.getProperty("email_field"))).sendKeys(username
 * ); Thread.sleep(2000);
 * driver.findElement(By.id(loc.getProperty("next_button"))).click();
 * Thread.sleep(2000);
 * driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys(
 * password); Thread.sleep(2000);
 * driver.findElement(By.id(loc.getProperty("submit_btn"))).click();
 * 
 * }
 * 
 * @DataProvider(name = "testdata") public Object[][] tdata() { return new
 * Object[][] { { "bodie@gmail.com", "Yuvan12" }, { "yuvan@gmail.com", "sanvi12"
 * }, { "ajaykumarthippani931@gmail.com", "Yuvan@sanvi12" } }; }
 * 
 * }
 */