package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sojhaiwebsite {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSojhaiwebsite() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1920,969 | ]]
    driver.get("https://sojhai.com/");
    driver.findElement(By.xpath("//*[text() = \"ACCOUNT\"]")).click();
    driver.findElement(By.xpath("//li[2]/div/ul/li[2]/a/i")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Full Name\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Full Name\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Full Name\"])]")).sendKeys("sojhai user");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Email\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Email\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Email\"])]")).sendKeys("sojhai@user.com");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Phone Number\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Phone Number\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Phone Number\"])]")).sendKeys("1232546576");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Password\"])]")).click();
    // ERROR: Caught exception [unknown command [typeSecret]]
    driver.findElement(By.xpath("(//input[@placeholder = \"your password\"])[2]")).click();
    // ERROR: Caught exception [unknown command [typeSecret]]
    driver.findElement(By.xpath("//*[text() = \"Register\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Back to Home\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"ACCOUNT\"]")).click();
    driver.findElement(By.xpath("//li[2]/div/ul/li[3]/a/i")).click();
    driver.findElement(By.xpath("//input[@placeholder = \"Enter Your Name\"]")).click();
    driver.findElement(By.xpath("//input[@placeholder = \"Enter Your Name\"]")).clear();
    driver.findElement(By.xpath("//input[@placeholder = \"Enter Your Name\"]")).sendKeys("user sojhai");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Email\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Email\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Email\"])]")).sendKeys("user@sojhai.com");
    driver.findElement(By.xpath("//input[@placeholder = \"your contact number\"]")).click();
    driver.findElement(By.xpath("//input[@placeholder = \"your contact number\"]")).clear();
    driver.findElement(By.xpath("//input[@placeholder = \"your contact number\"]")).sendKeys("1122334444");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Password\"])]")).click();
    // ERROR: Caught exception [unknown command [typeSecret]]
    driver.findElement(By.xpath("(//input[@placeholder = \"your password\"])[2]")).click();
    // ERROR: Caught exception [unknown command [typeSecret]]
    driver.findElement(By.xpath("//*[text() = \"Register\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"ACCOUNT\"]")).click();
    driver.findElement(By.cssSelector("ul.dropdown-menu.show > li > a.dropdown-item > i.bi.bi-box-arrow-in-right.me-3")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Email\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Email\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Email\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Email\"])]")).sendKeys("T53stus3r@outlook.com");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Password\"])]")).click();
    // ERROR: Caught exception [unknown command [typeSecret]]
    driver.findElement(By.xpath("//*[text() = \"Login\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"TEST CUSTOMER5\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Dashboard\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Booking History\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"TEST CUSTOMER5\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Review Manager\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"TEST CUSTOMER5\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Event Handler\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"TEST CUSTOMER5\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Profile\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"TEST CUSTOMER5\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Manage My Account\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"TEST CUSTOMER5\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Change Password\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Restaurants\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Hotels\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Hotels\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"About Us\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Home\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Cancellation Policy\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Guest Policy\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Privacy & Policy\"]")).click();
    driver.findElement(By.xpath("(//*[text() = \"About Us\"])[2]")).click();
    driver.findElement(By.xpath("//*[text() = \"Find in Kathmandu\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Find in Pokhara\"]")).click();
    driver.findElement(By.xpath("(//*[text() = \"Restaurants\"])[2]")).click();
    driver.findElement(By.xpath("(//*[text() = \"Hotels\"])[2]")).click();
    driver.findElement(By.xpath("(//img[@alt='room-card'])[4]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Number of Adults\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Number of Adults\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Number of Adults\"])]")).sendKeys("2");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Number of Childs\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Number of Childs\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Number of Childs\"])]")).sendKeys("1");
    new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("King");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Number of Rooms\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Number of Rooms\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Number of Rooms\"])]")).sendKeys("2");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Checked In\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Checked Out\"])]")).click();
    driver.findElement(By.xpath("//*[text() = \"Continue to Booking\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Restaurants\"]")).click();
    driver.findElement(By.xpath("(//img[@alt='room-card'])[2]")).click();
    driver.findElement(By.cssSelector("i.bi.bi-suit-heart-fill.text-danger")).click();
    driver.findElement(By.cssSelector("i.bi.bi-suit-heart")).click();
    driver.findElement(By.xpath("//*[text() = \"Home\"]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Destination or Hotel Name\"])]")).click();
    driver.findElement(By.xpath("//*[text() = \"Restaurant\"]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Destination or Restaurant Name\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Destination or Restaurant Name\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Destination or Restaurant Name\"])]")).sendKeys("lalitpur");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Destination or Restaurant Name\"])]")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Destination or Restaurant Name\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Destination or Restaurant Name\"])]")).sendKeys("lalitpur");
    driver.findElement(By.xpath("//div[@id='restaurant']/div/div[2]/a/i")).click();
    driver.findElement(By.cssSelector("div.progress")).click();
    driver.findElement(By.xpath("//*[contains(text(), \"By Price\")]")).click();
    driver.findElement(By.cssSelector("input.range-max")).click();
    driver.findElement(By.cssSelector("input.range-max")).clear();
    driver.findElement(By.cssSelector("input.range-max")).sendKeys("68000");
    driver.findElement(By.cssSelector("div.rating.mix-filter > div.input-wrapper > ul > li")).click();
    driver.findElement(By.id("star-5")).click();
    driver.findElement(By.name("filter_by_facilities[]")).click();
    driver.findElement(By.xpath("//*[text() = \"Destination or Restaurant Name\"]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Destination or Restaurant Name\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Destination or Restaurant Name\"])]")).sendKeys("kathmandu");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Destination or Restaurant Name\"])]")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Destination or Restaurant Name\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Destination or Restaurant Name\"])]")).sendKeys("kathmandu");
    driver.findElement(By.xpath("//*[text() = \"Search\"]")).click();
    driver.findElement(By.xpath("(//*[text() = \"1\"])[4]")).click();
    driver.findElement(By.xpath("(//*[text() = \"1\"])[4]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(//*[text() = "1"])[4] | ]]
    driver.findElement(By.xpath("(//*[text() = \"1\"])[4]")).click();
    driver.findElement(By.xpath("//*[text() = \"Your Booking At Kavya Resorts And Spa Has Been Successfully Submitted.\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Edit Booking Detail\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Close\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Parking\"]")).click();
    driver.findElement(By.name("filter_by_facilities[]")).click();
    driver.findElement(By.id("star-5")).click();
    driver.findElement(By.cssSelector("input.range-max")).click();
    driver.findElement(By.cssSelector("input.range-max")).clear();
    driver.findElement(By.cssSelector("input.range-max")).sendKeys("50000");
    driver.findElement(By.xpath("//*[text() = \"Send\"]")).click();
    driver.findElement(By.cssSelector("i.bi.bi-suit-heart")).click();
    driver.findElement(By.xpath("//*[text() = \"TEST CUSTOMER5\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Logout\"]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
