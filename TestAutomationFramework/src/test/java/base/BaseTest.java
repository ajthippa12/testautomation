package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileInputStream inputstream1;
	public static FileInputStream inputstream2;

	@BeforeTest
	public void setup() throws IOException {
		if (driver == null) {
			System.out.println(System.getProperty("user.dir"));
			inputstream1 = new FileInputStream(
					(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\config.properties"));

			inputstream2 = new FileInputStream(
					(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\Locators.properties"));

			prop.load(inputstream1);
			loc.load(inputstream2);

		}
		if (prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();// base
			driver = new ChromeDriver();// base
			driver.get(prop.getProperty("testurl"));

		}

		else if (prop.getProperty("browser").equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();// base
			driver = new FirefoxDriver();// base
			driver.get(prop.getProperty("testurl"));

		}

		else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();// base
			driver = new EdgeDriver();// base
			driver.get(prop.getProperty("testurl"));

		}

	}

	@AfterTest
	public void teardown() {

		driver.close();
		System.out.println("Teardown successfully completed");

	}
}
