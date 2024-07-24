package sojhai;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Vendor extends BasicSetup{
	
	
	
	@BeforeClass
	public void messageBeforeClass(){
		System.out.println("Always display this message before class");
	}
	
	
	@BeforeMethod
	public void messageBeforeTestCases() {
		System.out.println("Always display this message before method");
	}
	
	
	
	@Test(priority=1)//Test case for account drop down
	public static void account() throws InterruptedException  {
		
		driver.manage().window().maximize(); 
		WebElement dropdownToggle = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[2]/div/a[@role='button']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdownToggle).click().perform();
		WebElement dropdownChoose = driver.findElement(By.xpath("//li[2]/div/ul/li[3]/a/i"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(dropdownChoose).click().perform();
	}

	@Test(priority=2)
	public static void vendorRegistrationPage(){
		driver.findElement(By.id("name")).sendKeys("Dummy Vendor3");
		driver.findElement(By.id("email")).sendKeys("Dummyven3dor@outlook.com");
		driver.findElement(By.id("phone")).sendKeys("9896629382");
		driver.findElement(By.id("password")).sendKeys("Vend0r567");
		driver.findElement(By.id("confimr-password")).sendKeys("Vend0r567");
		driver.findElement(By.xpath("//button[@class='primary-button w-100 mb-3']")).submit();
	}
	
	@Test(priority=3)
	public static void vendorAfterRegistrationPage() {
		driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
	}
	
	@AfterMethod //Display message after each method
	public void messageAfterMethod(){
		System.out.println("Always display this message after method");
	}
	
	@AfterClass //Display message after class
	public void messageAfterClass() {
		System.out.println("Always display this message after class");
	}
	
}
