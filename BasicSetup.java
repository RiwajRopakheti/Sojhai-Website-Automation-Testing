package sojhai;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class BasicSetup {
	public static WebDriver driver;
	public static WebDriver basicSetup()
	{
		System.setProperty("Webdrive.chrome.driver", "./resources/chromedriver");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	
	@BeforeSuite(alwaysRun = true)
	public void openbrowser() {
		driver=basicSetup();
		driver.get("https://sojhai.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
	}
	
	@AfterSuite(alwaysRun = true)
	public void close_window() {
				driver.close();
	}
}
