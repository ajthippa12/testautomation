package utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readproperties {

	public static void main(String[] args) throws IOException {

		FileInputStream inputstream = new FileInputStream(
				"C:\\Users\\ajayk\\eclipse-workspace\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");

		Properties prop = new Properties();
		prop.load(inputstream);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("testurl"));

	}

}
