package sojhai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginpageotherOptions extends BasicSetup {
	@BeforeClass
	public void messageBeforeClass(){
		System.out.println("Always display this message before class");
	}
	
	
	@BeforeMethod
	public void messageBeforeTestCases() {
		System.out.println("Always display this message before method");
	}
	
	@Test(priority=1)
	public static void landingPage() throws InterruptedException {
		driver.manage().window().maximize(); 
		Thread.sleep(4000);
		WebElement dropdownToggle = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[2]/div/a[@role='button']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdownToggle).click().perform();
		WebElement dropdownChoose = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[2]/div/ul/li[1]/a/i[@class='bi bi-box-arrow-in-right me-3']"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(dropdownChoose).click().perform();
	}
	
	@Test(priority=2)
	public static void forgotPassword() {
		WebElement password=driver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div[1]/a[2]"));
		Actions forgot=new Actions(driver);
		forgot.moveToElement(password).click().perform();
	}
	
	@Test(priority=3)
	public static void forgotPasswordPage() throws InterruptedException {
		WebElement sendEmail=driver.findElement(By.id("email"));
		String id="d5ummycu5t0mer@outlook.com";
		sendEmail.sendKeys(id);
		WebElement PasswordresetLink=driver.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[2]/button"));
		Actions passwordReset=new Actions(driver);
		passwordReset.moveToElement(PasswordresetLink).click().perform();
		Thread.sleep(4000);
		for(int i=1;i<=2;i++) {
			driver.navigate().back();
		}
		
	}
	
	@Test(priority=4)
	public static void createanAccount() throws InterruptedException {
		WebElement anAccount=driver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div[1]/a[1]"));
		Actions create=new Actions(driver);
		create.moveToElement(anAccount).click().perform();
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
