package sojhai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Customer extends BasicSetup{
	@BeforeClass
	public void messageBeforeClass(){
		System.out.println("Always display this message before class");
	}
	
	
	@BeforeMethod
	public void messageBeforeTestCases() {
		System.out.println("Always display this message before method");
	}
	
	
	
	@Test(priority=1)//Test case for account dropdown
	public static void account() throws InterruptedException  {
		
		driver.manage().window().maximize(); 
		WebElement dropdownToggle = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[2]/div/a[@role='button']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdownToggle).click().perform();
		WebElement dropdownChoose = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[2]/div/ul/li[2]/a"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(dropdownChoose).click().perform();
	}

	@Test(priority=2)
	public static void customerRegistrationPage(){
		driver.findElement(By.id("name")).sendKeys("Dummy Customer");
		driver.findElement(By.id("email")).sendKeys("d5ummycu5t0mer@outlook.com");
		driver.findElement(By.id("phone")).sendKeys("9895918852");
		driver.findElement(By.id("password")).sendKeys("Cu5t11odmer12");
		driver.findElement(By.id("confimr-password")).sendKeys("Cu5t11odmer12");
		driver.findElement(By.xpath("//button[@class='primary-button w-100 mb-3']")).submit();
	}
	
	@Test(priority=3)
	public static void customerAfterRegistrationPage() {
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
