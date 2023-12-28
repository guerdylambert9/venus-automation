package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static Properties prop = new Properties();
	public static Properties loginLocatorsProp = new Properties();
	public static Properties dummydataLocatorsProp = new Properties();
	
	//public static FileReader fr;
	public static FileReader configReader;
	//public static FileReader loginLocator;
	public static FileReader loginLocatorReader;
	public static FileReader dummyDataLocatorReader;
	
	//@BeforeMethod
	@BeforeTest
	public static void setUp() throws IOException {
		
		if(driver == null) {
			//FileReader 
			configReader = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\config.properties");
			//FileReader 
			//loginLocReader = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\loginLocators.properties");
			loginLocatorReader = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\loginLocators.properties");
			//FileReader 
			dummyDataLocatorReader = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\dummyData.properties");
			
			//prop.load(configReader);
			prop.load(configReader);
			//loginLocatorsProp.load(loginLocReader);
			loginLocatorsProp.load(loginLocatorReader);
			dummydataLocatorsProp.load(dummyDataLocatorReader);
			
			String browser = prop.getProperty("browser");
			String url = prop.getProperty("url");
			
			System.out.println(browser);
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get(url);
			}
			else if(browser.equalsIgnoreCase("firefox" )) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.get(url);
			}
			
		}
	}
	
	//@AfterMethod
//	@AfterTest
//	public static void tearDown() {
//	
//		driver.close();
//	}
}
