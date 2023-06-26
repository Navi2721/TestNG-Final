package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page.ValidateAddCatagoryPage;

public class BrowserFactory extends ValidateAddCatagoryPage {
	static WebDriver driver;
	@Test
	public static WebDriver init() {
		
		System.setProperty(" webdriver.chrome.driver", "/Users/nebeyouyohannes/Dec2022Selenium/drivers/chromedriver");
		driver = new ChromeDriver();                 
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/104/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	public static void tearDown() {
		
	driver.close();
	driver.quit();
	}
	}


