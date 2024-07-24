package sojhai;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Customerdashboard extends BasicSetup{
	
	@BeforeClass
	public void messageBeforeClass(){
		System.out.println("Always display this message before class");
	}
	
	
	@BeforeMethod
	public void messageBeforeTestCases() {
		System.out.println("Always display this message before method");
	}
	
	
	@Test(priority=1)
	public static void landingPage() {
		driver.manage().window().maximize(); 
		customWait(4000);
		WebElement dropdownToggle = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[2]/div/a[@role='button']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdownToggle).click().perform();
		WebElement dropdownChoose = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[2]/div/ul/li[1]/a/i[@class='bi bi-box-arrow-in-right me-3']"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(dropdownChoose).click().perform();
	}
	
	@Test(priority=2)
	public static void loginPage() {
		driver.findElement(By.id("email")).sendKeys("d5ummycu5t0mer@outlook.com");
		driver.findElement(By.id("password")).sendKeys("Cu5t11odmer12");
		driver.findElement(By.xpath("//button[@class='primary-button w-100 mb-3']")).submit();
		
	}
	
	@Test(priority=3)
	public static void dashBoard() 
	{
		WebElement dropdownToggle = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[2]/div/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdownToggle).click().perform();
		driver.findElement(By.xpath("/html/body/main/div/div/div[1]/ol/li[1]")).click();
		WebElement Image = driver.findElement(By.xpath("/html/body/main/div[2]/section[2]/div/div[2]/div[1]/a"));
	    Actions scroll=new Actions(driver);
	    scroll.scrollToElement(Image).perform();
		customWait(2000);
		WebElement clickImage = driver.findElement(By.xpath("/html/body/main/div[2]/section[2]/div/div[2]/div[1]/a"));
		Actions point = new Actions(driver);
		point.moveToElement(clickImage).click().perform();
	}

	@Test(priority=4)
	public static void bookAHotel() {
		Select countrySelect =new Select(driver.findElement(By.name("country_code")));
		countrySelect.selectByVisibleText("Nepal");
		WebElement checkIn = driver.findElement(By.id("checkin"));
		Actions checkindate = new Actions(driver);
		checkindate.moveToElement(checkIn).click().perform();
		WebElement checkInYearUp = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div/div/span[1]"));
		WebElement checkInYearDown = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div/div/span[2]"));
		WebElement checkInMonthLeft = driver.findElement(By.xpath("/html/body/div[7]/div[1]/span[1]"));
		WebElement checkInMonthRight = driver.findElement(By.xpath("/html/body/div[7]/div[1]/span[2]"));
		Actions checkindatescroller = new Actions(driver);
		int clicksNeeded=4;
		for(int i=0; i<clicksNeeded;i++) {
			if (i<clicksNeeded/2) {
				checkindatescroller.click(checkInYearUp).perform();
				checkindatescroller.click(checkInMonthRight).perform();
				
			}
			else {
				checkindatescroller.click(checkInYearDown).perform();
				checkindatescroller.click(checkInMonthLeft).perform();
			}
			
		}
		WebElement checkInDay=driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div[2]/div/span[20]"));
		Actions pickcheckinday=new Actions(driver);
		pickcheckinday.moveToElement(checkInDay).click().perform();
		
		WebElement checkOut = driver.findElement(By.id("checkout"));
		Actions checkoutdate = new Actions(driver);
		checkoutdate.moveToElement(checkOut).click().perform();
		WebElement checkOutYearUp = driver.findElement(By.xpath("/html/body/div[9]/div[1]/div/div/div/span[1]"));
		WebElement checkOutYearDown = driver.findElement(By.xpath("/html/body/div[9]/div[1]/div/div/div/span[2]"));
		WebElement checkOutMonthLeft = driver.findElement(By.xpath("/html/body/div[9]/div[1]/span[1]"));
		WebElement checkOutMonthRight = driver.findElement(By.xpath("/html/body/div[9]/div[1]/span[2]"));
		Actions checkoutdatescroller = new Actions(driver);
		int clicksNeeded1=4;
		for(int j=0; j<clicksNeeded1;j++) {
			if (j>clicksNeeded/2) {
				checkoutdatescroller.click(checkOutYearDown).perform();
				checkoutdatescroller.click(checkOutMonthLeft).perform();
				
			}
			else {
				checkoutdatescroller.click(checkOutYearUp).perform();
				checkoutdatescroller.click(checkOutMonthRight).perform();
			}	
		}
		WebElement checkOutDay=driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[2]/div/span[18]"));
		Actions pickcheckoutday=new Actions(driver);
		pickcheckoutday.moveToElement(checkOutDay).click().perform();
		Select roomSelect =new Select(driver.findElement(By.name("room_id")));
		roomSelect.selectByVisibleText("Select a Room");
		WebElement noofRooms=driver.findElement(By.id("no_rooms"));
		int numberOfRooms=6;
		String roomnumberAsString=String.valueOf(numberOfRooms);
		noofRooms.sendKeys(roomnumberAsString);
		WebElement noofAdults=driver.findElement(By.id("no_adult"));
		int numberOfAdults=2;
		String adultscountsAsString=String.valueOf(numberOfAdults);
		noofAdults.sendKeys(adultscountsAsString);
		WebElement noofChilds=driver.findElement(By.id("no_child"));
		int numberOfChilds=6;
		String childscountsAsString=String.valueOf(numberOfChilds);
		noofChilds.sendKeys(childscountsAsString);
		WebElement agreeTerms=driver.findElement(By.name("policy_accepted"));
		Actions agreePolicy = new Actions(driver);
		agreePolicy.moveToElement(agreeTerms).click();
		WebElement submitButton=driver.findElement(By.xpath("//*[@id=\"booking_form\"]/button"));
		Actions clickButton=new Actions(driver);
		Actions scroll=new Actions(driver);
	    scroll.scrollToElement(submitButton).perform();
		clickButton.moveToElement(submitButton).click().perform();
		WebElement homePage=driver.findElement(By.xpath("/html/body/header/nav/div/div/div[1]/a[@class='brand-logo']"));
		Actions goback=new Actions(driver);
		goback.scrollToElement(homePage).click(homePage).perform();
		
	}
	
	@Test(priority=5)
	public static void searchRestaurant() {
		WebElement searchRestaurants=driver.findElement(By.xpath("/html/body/main/section[2]/div/div[1]/ul/li[2]/button"));
		Actions Restaurant=new Actions(driver);
		Actions scrolltoSearchBar=new Actions(driver);
		scrolltoSearchBar.scrollToElement(searchRestaurants).perform();
		Restaurant.click(searchRestaurants).perform();
		WebElement searchRestaurant=driver.findElement(By.id("destination-restaurant"));
	    String query="Everest View Cafe";
	    searchRestaurant.sendKeys(query);
	    WebElement searchbutton=driver.findElement(By.xpath("//*[@id=\"restaurant\"]/div/div[2]/a"));
	    Actions search=new Actions(driver);
	    search.moveToElement(searchbutton).click().perform();
		
	}
	@Test(priority=6)
	public static void filterSearchResults() {
		WebElement searchFilter=driver.findElement(By.name("filter_by_city"));
	    String query="Kathmandu";
	    searchFilter.sendKeys(query);
	    WebElement hide=driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div/div[2]/div[1]/div[1]/i"));
	    WebElement show=driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div/div[2]/div[1]/div[1]/i"));
	    Actions showorhide=new Actions(driver);
	    showorhide.click(hide).perform();
	    showorhide.click(show).perform();
	    WebElement minSlider=driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/div[1]/input"));
	    WebElement maxSlider=driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/div[3]/input"));
	    minSlider.clear();
	    maxSlider.clear();
	    int minRange=0;
	    int maxRange=10000;
		String minrangeAsString=String.valueOf(minRange);
		String maxrangeAsString=String.valueOf(maxRange);
		minSlider.sendKeys(minrangeAsString);
		maxSlider.sendKeys(maxrangeAsString);
		WebElement viewall=driver.findElement(By.xpath("//*[@id=\"filter-facilities-btn\"]"));
		Actions curtain=new Actions(driver);
		curtain.click(viewall).perform();
		WebElement facility1=driver.findElement(By.xpath("//*[@id=\"filter_facilities_list\"]/li[1]/input"));
		Actions fac1=new Actions(driver);
		fac1.click(facility1).perform();
		WebElement facility2=driver.findElement(By.xpath("//*[@id=\"filter_facilities_list\"]/li[3]/input"));
		Actions fac2=new Actions(driver);
		fac2.click(facility2).perform();
		WebElement rating=driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div/div[2]/div[3]/div[2]/ul/li[5]/input"));
		Actions rate=new Actions(driver);
		rate.click(rating).perform();
		
	}
	
	@Test(priority=7)
	public static void connectwithrestaurants() {
		driver.navigate().refresh();
		WebElement sendbutton=driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[3]/div[2]/ul/li[2]/div/div/div[2]/form/div[4]/button"));
	    Actions send=new Actions(driver);
	    customWait(4000);
	    send.moveToElement(sendbutton).click().perform();
		
	}
	
	@Test(priority=8)
	public static void chooseFilteredRestaurant() {
		WebElement likebutton=driver.findElement(By.xpath("//*[@id=\"search_list\"]/div[2]/ul/li[1]/div/div/div[3]/div/div[2]/div/button/i"));
	    Actions like=new Actions(driver);
	    like.moveToElement(likebutton).click().perform();
	    WebElement details=driver.findElement(By.xpath("//*[@id=\"search_list\"]/div[2]/ul/li[1]/div/div/div[3]/div/div[2]/a"));
	    Actions choose=new Actions(driver);
	    choose.moveToElement(details).click().perform();
	    
	}
	
	@Test(priority=9)
	public static void reviewRestaurant() {
		WebElement menuitems=driver.findElement(By.xpath("/html/body/main/section[2]/div/div/ul/li[6]/button"));;
		Actions popupbox=new Actions(driver);
		
	    popupbox.moveToElement(menuitems).click().perform();
	    customWait(4000);
	    WebElement foodcategory=driver.findElement(By.xpath("//*[@id='home-tab']"));
	    Actions menu=new Actions(driver);
	    menu.moveToElement(foodcategory).click().perform();
	    WebElement closepopup=driver.findElement(By.xpath("//*[@id='food_menu_modal']/div/div/div/button"));
	    Actions popup=new Actions(driver);
	    popup.moveToElement(closepopup).click().perform();
	    WebElement details=driver.findElement(By.xpath("/html/body/main/section[2]/div/div/ul/li[1]/a"));
	    Actions gotodetails=new Actions(driver);
	    Actions scrolltoNavBar=new Actions(driver);
		gotodetails.moveToElement(details).click().perform();
		scrolltoNavBar.scrollToElement(details).perform();
		WebElement facilities=driver.findElement(By.xpath("/html/body/main/section[2]/div/div/ul/li[2]/a"));
	    Actions gotofacilities=new Actions(driver);
	    gotofacilities.moveToElement(facilities).click().perform();
	    scrolltoNavBar.scrollToElement(facilities).click().perform();
	    WebElement map=driver.findElement(By.xpath("/html/body/main/section[2]/div/div/ul/li[3]/a"));
	    Actions gotomap=new Actions(driver);
	    gotomap.moveToElement(map).click().perform();
	    scrolltoNavBar.scrollToElement(map).click().perform();
	    WebElement policies=driver.findElement(By.xpath("/html/body/main/section[2]/div/div/ul/li[2]/a"));
	    Actions gotopolicies=new Actions(driver);
	    gotopolicies.moveToElement(policies).click().perform();
	    scrolltoNavBar.scrollToElement(policies).click().perform();
	    WebElement giveReview=driver.findElement(By.xpath("/html/body/main/div[4]/section/div/div/div[1]/div[4]/h3"));
	    List<WebElement> fillstars=driver.findElements(By.xpath("/html/body/main/div[4]/section/div/div/div[1]/div[4]/div/div[1]/div/div/div/div/div"));
		Actions scrolltoReviewSection=new Actions(driver);
		scrolltoReviewSection.scrollToElement(giveReview).click().perform();
		customWait(4000);
		int desiredRating=5;
		for(int i=0;i<fillstars.size() && i<desiredRating;i++) {
			fillstars.get(i).click();
		}
		Select countrySelect =new Select(driver.findElement(By.name("country_code")));
		countrySelect.selectByVisibleText("Nepal");
		Select tripType=new Select(driver.findElement(By.name("trip_type")));
		tripType.selectByVisibleText("Family");
		WebElement textArea=driver.findElement(By.name("comment"));
		customWait(4000);
		String reviewText="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		textArea.sendKeys(reviewText);
		WebElement submitbutton=driver.findElement(By.xpath("/html/body/main/div[4]/section/div/div/div[1]/div[4]/div/div[2]/button"));
	    Actions submit=new Actions(driver);
	    submit.moveToElement(submitbutton).click().perform();
		customWait(4000);
		WebElement otherRestaurantSuggestion=driver.findElement(By.xpath("/html/body/main/div[4]/section/div/div/div[2]/row/div[2]/a"));
		scrolltoNavBar.scrollToElement(otherRestaurantSuggestion).click().perform();
	    Actions clickonSuggestion=new Actions(driver);
	    clickonSuggestion.moveToElement(otherRestaurantSuggestion).click().perform();
	}
	
	@Test(priority=10) //Dashboard
	public static void otherAccountOption1() throws InterruptedException {
		WebElement dropdownToggle = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/a"));
		Actions dropdown = new Actions(driver);
		
		Actions movedown=new Actions(driver);
		
		dropdown.moveToElement(dropdownToggle).click().perform();
		WebElement dropdownChooseDashboard = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/ul/li[1]/a[@class='dropdown-item']"));
		movedown.moveToElement(dropdownChooseDashboard).click().perform();
	}
	
	@Test(priority=11) //BookingHistory
	public static void otherAccountOption2() throws InterruptedException{
		WebElement dropdownToggle = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/a"));
		Actions dropdown=new Actions(driver);
		Actions movedown=new Actions(driver);
		Thread.sleep(2000);
		dropdown.moveToElement(dropdownToggle).click().perform();
		WebElement dropdownChooseBookingHistory = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/ul/li[2]/a[@href='https://sojhai.com/customer/bookings']"));
		movedown.moveToElement(dropdownChooseBookingHistory).click().perform();
	}
	
	@Test(priority=12) //ReviewManager
	public static void otherAccountOption3() throws InterruptedException{
		WebElement dropdownToggle = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/a"));
		Actions dropdown=new Actions(driver);
		Actions movedown=new Actions(driver);
		Thread.sleep(2000);
		dropdown.moveToElement(dropdownToggle).click().perform();
		WebElement dropdownChooseReviewManager = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/ul/li[3]/a"));
		movedown.moveToElement(dropdownChooseReviewManager).click().perform();
		driver.navigate().back();
	}
	
	@Test(priority=13) //EventHandler
	public static void otherAccountOption4() throws InterruptedException{
		WebElement dropdownToggle = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/a[@role='button']"));
		Actions dropdown=new Actions(driver);
		Actions movedown=new Actions(driver);
		Thread.sleep(2000);
		dropdown.moveToElement(dropdownToggle).click().perform();
		WebElement dropdownChooseEventHandler = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/ul/li[4]/a"));
		movedown.moveToElement(dropdownChooseEventHandler).click().perform();
	}
	
	@Test(priority=14) //EventHandlerfurther
	public static void otherAccountOption4_1() throws InterruptedException{
		WebElement Event=driver.findElement(By.xpath("/html/body/main/div[1]/div/div[2]/div/a"));
		Actions addEvent=new Actions(driver);
		addEvent.moveToElement(Event).click().perform();
		driver.navigate().back();
	}
	
	@Test(priority=15) //Profile
	public static void otherAccountOptions5() throws InterruptedException{
		WebElement dropdownToggle = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/a[@role='button']"));
		Actions dropdown=new Actions(driver);
		Actions movedown=new Actions(driver);
		Thread.sleep(2000);
		dropdown.moveToElement(dropdownToggle).click().perform();
		WebElement dropdownChooseProfile = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/ul/li[5]/a"));
		movedown.moveToElement(dropdownChooseProfile).click().perform();
	}
	
	@Test(priority=16) //EditProfiel
	public static void otherAccountOption5_1() {
		WebElement editProfile=driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/div/div/div/div[1]/a[@class='btn btn-primary']"));
		Actions Profile=new Actions(driver);
		Profile.moveToElement(editProfile).click().perform();
						
	}
	
	@Test(priority=17)//save profile
	public static void otherAccountOption5_2() throws InterruptedException {
		WebElement addAddress=driver.findElement(By.name("address"));
		Actions scroller=new Actions(driver);
		scroller.scrollToElement(addAddress).click().perform();
		Thread.sleep(2000);
		addAddress.clear();
		String address="Kathmandu";
		addAddress.sendKeys(address);
		WebElement save=driver.findElement(By.xpath("/html/body/main/div/div/form/div[4]/div/div/div/button[@class='btn btn-primary btn-default ms-3']"));
		Actions click=new Actions(driver);
		click.moveToElement(save).click().perform();
	}
	
	@Test(priority=18)//ManageAccount
	public static void otherAccountOption6() {
		WebElement dropdownToggle = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/a[@role='button']"));
		Actions dropdown=new Actions(driver);
		Actions movedown=new Actions(driver);
		dropdown.moveToElement(dropdownToggle).click().perform();
		WebElement dropdownManageAccount = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/ul/li[6]/a"));
		movedown.moveToElement(dropdownManageAccount).click().perform();
	}
	
	@Test(priority=19)//ChangePassword
	public static void otherAccountOption7() throws InterruptedException {
		WebElement dropdownToggle = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/a[@role='button']"));
		Actions dropdown=new Actions(driver);
		Actions movedown=new Actions(driver);
		dropdown.moveToElement(dropdownToggle).click().perform();
		WebElement dropdownChangePassword = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/ul/li[7]/a"));
		movedown.moveToElement(dropdownChangePassword).click().perform();
		Thread.sleep(2000);
		WebElement oldPassword = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/div/div[2]/div[1]/form/div[1]/input"));
		oldPassword.clear();
		oldPassword.sendKeys("Pa55word123");
		WebElement newPassword = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/div/div[2]/div[1]/form/div[2]/input"));
		newPassword.clear();
		newPassword.sendKeys("Cu5t11odmer12");
		WebElement confirmPassword = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/div/div[2]/div[1]/form/div[3]/input"));
		confirmPassword.clear();
		confirmPassword.sendKeys("Cu5t11odmer12");
		WebElement changePassword=driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/div/div[2]/div[1]/form/div[4]/button"));
		Actions changeButton=new Actions(driver);
		changeButton.moveToElement(changePassword).click().perform();	
	}
	
	@Test(priority=20)
	public static void bookoneLastHotel() throws InterruptedException
	{
		WebElement bookagain=driver.findElement(By.xpath("/html/body/header/nav/div/div/div[1]/ul/li[3]/a"));
		Actions hotel=new Actions(driver);
		hotel.moveToElement(bookagain).click().perform();
		Thread.sleep(2000);
		WebElement ChooseHotel=driver.findElement(By.xpath("/html/body/main/section/div/div/div[4]/a"));
		Actions pickhotel=new Actions(driver);
		pickhotel.moveToElement(ChooseHotel).click().perform();
		Thread.sleep(2000);
		Select countrySelect =new Select(driver.findElement(By.name("country_code")));
		countrySelect.selectByVisibleText("Nepal");
		WebElement checkIn = driver.findElement(By.id("checkin"));
		Actions checkindate = new Actions(driver);
		checkindate.moveToElement(checkIn).click().perform();
		WebElement checkInYearUp = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div/div/span[1]"));
		WebElement checkInYearDown = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div/div/span[2]"));
		WebElement checkInMonthLeft = driver.findElement(By.xpath("/html/body/div[7]/div[1]/span[1]"));
		WebElement checkInMonthRight = driver.findElement(By.xpath("/html/body/div[7]/div[1]/span[2]"));
		Actions checkindatescroller = new Actions(driver);
		int clicksNeeded=4;
		for(int i=0; i<clicksNeeded;i++) {
			if (i<clicksNeeded/2) {
				checkindatescroller.click(checkInYearUp).perform();
				checkindatescroller.click(checkInMonthRight).perform();
				
			}
			else {
				checkindatescroller.click(checkInYearDown).perform();
				checkindatescroller.click(checkInMonthLeft).perform();
			}
			
		}
		WebElement checkInDay=driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div[2]/div/span[20]"));
		Actions pickcheckinday=new Actions(driver);
		pickcheckinday.moveToElement(checkInDay).click().perform();
		
		WebElement checkOut = driver.findElement(By.id("checkout"));
		Actions checkoutdate = new Actions(driver);
		checkoutdate.moveToElement(checkOut).click().perform();
		WebElement checkOutYearUp = driver.findElement(By.xpath("/html/body/div[9]/div[1]/div/div/div/span[1]"));
		WebElement checkOutYearDown = driver.findElement(By.xpath("/html/body/div[9]/div[1]/div/div/div/span[2]"));
		WebElement checkOutMonthLeft = driver.findElement(By.xpath("/html/body/div[9]/div[1]/span[1]"));
		WebElement checkOutMonthRight = driver.findElement(By.xpath("/html/body/div[9]/div[1]/span[2]"));
		Actions checkoutdatescroller = new Actions(driver);
		int clicksNeeded1=6;
		for(int j=0; j<clicksNeeded1;j++) {
			if (j>clicksNeeded/2) {
				checkoutdatescroller.click(checkOutYearDown).perform();
				checkoutdatescroller.click(checkOutMonthLeft).perform();
				
			}
			else {
				checkoutdatescroller.click(checkOutYearUp).perform();
				checkoutdatescroller.click(checkOutMonthRight).perform();
			}	
		}
		WebElement checkOutDay=driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[2]/div/span[18]"));
		Actions pickcheckoutday=new Actions(driver);
		pickcheckoutday.moveToElement(checkOutDay).click().perform();
		Select roomSelect =new Select(driver.findElement(By.name("room_id")));
		roomSelect.selectByVisibleText("Select a Room");
		WebElement noofRooms=driver.findElement(By.id("no_rooms"));
		int numberOfRooms=6;
		String roomnumberAsString=String.valueOf(numberOfRooms);
		noofRooms.sendKeys(roomnumberAsString);
		WebElement noofAdults=driver.findElement(By.id("no_adult"));
		int numberOfAdults=2;
		String adultscountsAsString=String.valueOf(numberOfAdults);
		noofAdults.sendKeys(adultscountsAsString);
		WebElement noofChilds=driver.findElement(By.id("no_child"));
		int numberOfChilds=6;
		String childscountsAsString=String.valueOf(numberOfChilds);
		noofChilds.sendKeys(childscountsAsString);
		WebElement agreeTerms=driver.findElement(By.name("policy_accepted"));
		Actions agreePolicy = new Actions(driver);
		agreePolicy.moveToElement(agreeTerms).click();
		WebElement submitButton=driver.findElement(By.xpath("//*[@id=\"booking_form\"]/button"));
		Actions clickButton=new Actions(driver);
		Actions scroll=new Actions(driver);
	    scroll.scrollToElement(submitButton).perform();
		clickButton.moveToElement(submitButton).click().perform();
		WebElement homePage=driver.findElement(By.xpath("/html/body/header/nav/div/div/div[1]/a[@class='brand-logo']"));
		Actions goback=new Actions(driver);
		goback.scrollToElement(homePage).click(homePage).perform();

		
	}
	
	@Test(priority=21)//Logout
	public static void logout() {
		WebElement dropdownToggle = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/a[@role='button']"));
		Actions dropdown=new Actions(driver);
		Actions movedown=new Actions(driver);
		dropdown.moveToElement(dropdownToggle).click().perform();
		WebElement dropdownLogOut = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/div/ul/li[8]/a"));
		movedown.moveToElement(dropdownLogOut).click().perform();
	}
	
	@Test(priority=22)
	public static void anonymousHotelSearch() {
		WebElement hotel=driver.findElement(By.xpath("/html/body/main/section[2]/div/div[1]/ul/li[1]/button"));
		Actions scrollto=new Actions(driver);
		scrollto.scrollToElement(hotel).click().perform();
		WebElement nameOrlocation=driver.findElement(By.id("destination-hotel"));
		String enterText="Kathmandu";
		nameOrlocation.sendKeys(enterText);
		WebElement checkIn = driver.findElement(By.id("checkin"));
		Actions checkindate = new Actions(driver);
		checkindate.moveToElement(checkIn).click().perform();
		WebElement checkInYearUp = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/div/span[1]"));
		WebElement checkInYearDown = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/div/span[2]"));
		WebElement checkInMonthLeft = driver.findElement(By.xpath("/html/body/div[6]/div[1]/span[1]"));
		WebElement checkInMonthRight = driver.findElement(By.xpath("/html/body/div[6]/div[1]/span[2]"));
		Actions checkindatescroller = new Actions(driver);
		int clicksNeeded=6;
		for(int i=0; i<clicksNeeded;i++) {
			if (i<clicksNeeded/2) {
				checkindatescroller.click(checkInYearUp).perform();
				checkindatescroller.click(checkInMonthRight).perform();
				
			}
			else {
				checkindatescroller.click(checkInYearDown).perform();
				checkindatescroller.click(checkInMonthLeft).perform();
			}
			
		}
		WebElement checkInDay=driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/span[17]"));
		Actions pickcheckinday=new Actions(driver);
		pickcheckinday.moveToElement(checkInDay).click().perform();
		
		WebElement checkOut = driver.findElement(By.id("checkout"));
		Actions checkoutdate = new Actions(driver);
		checkoutdate.moveToElement(checkOut).click().perform();
		WebElement checkOutYearUp = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div/div/span[1]"));
		WebElement checkOutYearDown = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div/div/span[2]"));
		WebElement checkOutMonthLeft = driver.findElement(By.xpath("/html/body/div[7]/div[1]/span[1]"));
		WebElement checkOutMonthRight = driver.findElement(By.xpath("/html/body/div[7]/div[1]/span[2]"));
		Actions checkoutdatescroller = new Actions(driver);
		int clicksNeeded1=6;
		for(int j=0; j<clicksNeeded1;j++) {
			if (j>clicksNeeded/2) {
				checkoutdatescroller.click(checkOutYearDown).perform();
				checkoutdatescroller.click(checkOutMonthLeft).perform();
				
			}
			else {
				checkoutdatescroller.click(checkOutYearUp).perform();
				checkoutdatescroller.click(checkOutMonthRight).perform();
			}	
		}
		WebElement checkOutDay=driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div[2]/div/span[27]"));
		Actions pickcheckoutday=new Actions(driver);
		pickcheckoutday.moveToElement(checkOutDay).click().perform();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"hotel\"]/div/div[2]/a"));
		Actions result=new Actions(driver);
		result.moveToElement(search).click().perform();
	}
	
	@Test(priority=23)
	public static void connectwithHotels() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.id("name"));
		name.clear();
		name.sendKeys("Dummy Customer");
		WebElement email=driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("d5ummycu5t0mer@outlook.com");
		WebElement phone=driver.findElement(By.id("phone"));
		phone.clear();
		phone.sendKeys("9895918852");
		WebElement send=driver.findElement(By.xpath("//*[@id=\"search_list\"]/div[2]/ul/li[2]/div/div/div[2]/form/div[4]/button"));
		Actions connect=new Actions(driver);
		connect.moveToElement(send).click().perform();
	}
	
	@Test(priority=24)
	public static void aboutUs() {
		WebElement about=driver.findElement(By.xpath("/html/body/header/nav/div/div/div[1]/ul/li[2]/a"));
		Actions scrollTo=new Actions(driver);
		Actions click=new Actions(driver);
		scrollTo.scrollToElement(about).click().perform();
		click.moveToElement(about).click().perform();
		customWait(4000);
	}
	
	@Test(priority=25)
	public static void privacyAndPolicy() {
		WebElement privacypolicy=driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/div[2]/div/div[2]/ul/li[2]/a"));
		//Actions scrollTo=new Actions(driver);
		Actions click=new Actions(driver);
		//scrollTo.scrollToElement(privacypolicy).click().perform();
		click.moveToElement(privacypolicy).click().perform();
		customWait(4000);
	}
	
	@Test(priority=26)
	public static void guestPolicy() {
		WebElement guestpolicy=driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/div[2]/div/div[2]/ul/li[3]/a"));
		//Actions scrollTo=new Actions(driver);
		Actions click=new Actions(driver);
		//scrollTo.scrollToElement(guestpolicy).click().perform();
		click.moveToElement(guestpolicy).click().perform();
		customWait(4000);
	}
	
	@Test(priority=27)
	public static void cancellationPolicy() {
		WebElement cancellationpolicy=driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/div[2]/div/div[2]/ul/li[4]/a"));
		//Actions scrollTo=new Actions(driver);
		Actions click=new Actions(driver);
		//scrollTo.scrollToElement(cancellationpolicy).click().perform();
		click.moveToElement(cancellationpolicy).click().perform();
		customWait(4000);
	}
	
	@Test(priority=28)
	public static void contactForqueries() throws InterruptedException{
		WebElement contact=driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/div[1]/div[1]/div/h6/a[1]"));
		//Actions scrollTo=new Actions(driver);
		Actions query=new Actions(driver);
		//scrollTo.scrollToElement(contact).click().perform();
		query.moveToElement(contact).click().perform();
		Thread.sleep(10000);
	}
	
	@Test(priority=29)
	public static void contactonFacebook() throws InterruptedException {
		WebElement fb=driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/div[1]/div[3]/ul/li[1]/a"));
		//Actions scrollTo=new Actions(driver);
		Actions facebook=new Actions(driver);
		String originalHandle = driver.getWindowHandle();
		
		//scrollTo.scrollToElement(fb).click().perform();
		facebook.moveToElement(fb).click().perform();
		Set<String> allHandles = driver.getWindowHandles();
		for (String handle : allHandles) {
            if (!handle.equals(originalHandle)) {
                try {
                    driver.switchTo().window(handle);
                    Thread.sleep(7000);
                    driver.close();
                } catch (NoSuchWindowException e) {
                    System.out.println("Exception: Window/Tab not found - " + handle);
                }
            }
        }
		driver.switchTo().window(originalHandle);
		
	}
	
	@Test(priority=30)
	public static void contactonX() throws InterruptedException {
		WebElement x=driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/div[1]/div[3]/ul/li[2]/a"));
		//Actions scrollTo=new Actions(driver);
		Actions twitter=new Actions(driver);
		String originalHandle = driver.getWindowHandle();
		//scrollTo.scrollToElement(x).click().perform();
		twitter.moveToElement(x).click().perform();
		Set<String> allHandles = driver.getWindowHandles();
		for (String handle : allHandles) {
            if (!handle.equals(originalHandle)) {
                try {
                    driver.switchTo().window(handle);
                    Thread.sleep(7000);
                    driver.close();
                } catch (NoSuchWindowException e) {
                    System.out.println("Exception: Window/Tab not found - " + handle);
                }
            }
        }
		driver.switchTo().window(originalHandle);
	}
	
	@Test(priority=31)
	public static void contactonInstagram() throws InterruptedException {
		WebElement insta=driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/div[1]/div[3]/ul/li[3]/a"));
		//Actions scrollTo=new Actions(driver);
		Actions ig=new Actions(driver);
		String originalHandle = driver.getWindowHandle();
		//scrollTo.scrollToElement(insta).click().perform();
		ig.moveToElement(insta).click().perform();
		Set<String> allHandles = driver.getWindowHandles();
		for (String handle : allHandles) {
            if (!handle.equals(originalHandle)) {
                try {
                    driver.switchTo().window(handle);
                    Thread.sleep(7000);
                    driver.close();
                } catch (NoSuchWindowException e) {
                    System.out.println("Exception: Window/Tab not found - " + handle);
                }
            }
        }
		driver.switchTo().window(originalHandle);
	
	}
	
	@Test(priority=32)
	public static void contactonTiktok() throws InterruptedException {
		WebElement tiktok=driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/div[1]/div[3]/ul/li[4]/a"));
		//Actions scrollTo=new Actions(driver);
		Actions tt=new Actions(driver);
		String originalHandle = driver.getWindowHandle();
		//scrollTo.scrollToElement(tiktok).click().perform();
		tt.moveToElement(tiktok).click().perform();
		Set<String> allHandles = driver.getWindowHandles();
		for (String handle : allHandles) {
            if (!handle.equals(originalHandle)) {
                try {
                    driver.switchTo().window(handle);
                    Thread.sleep(7000);
                    driver.close();
                } catch (NoSuchWindowException e) {
                    System.out.println("Exception: Window/Tab not found - " + handle);
                }
            }
        }
      driver.switchTo().window(originalHandle);
		
	}
	
	@Test(priority=33)
	public static void contactonGmail() throws InterruptedException{
		WebElement mail=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[2]/ul/li[1]/a"));
		//Actions scrollTo=new Actions(driver);
		Actions gmail=new Actions(driver);
		String originalHandle = driver.getWindowHandle();
		//scrollTo.scrollToElement(mail).click().perform();
		gmail.moveToElement(mail).click().perform();
		Set<String> allHandles = driver.getWindowHandles();
		for (String handle : allHandles) {
            if (!handle.equals(originalHandle)) {
                try {
                    driver.switchTo().window(handle);
                    Thread.sleep(7000);
                    driver.close();
                } catch (NoSuchWindowException e) {
                    System.out.println("Exception: Window/Tab not found - " + handle);
                }
            }
        }
      driver.switchTo().window(originalHandle);
	}
	
	@Test(priority=34)
	public static void contactonWhatsApp() throws InterruptedException{
		WebElement whatsApp=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[2]/ul/li[2]/a"));
		//Actions scrollTo=new Actions(driver);
		Actions wa=new Actions(driver);
		String originalHandle = driver.getWindowHandle();
		//scrollTo.scrollToElement(whatsApp).click().perform();
		wa.moveToElement(whatsApp).click().perform();
		Set<String> allHandles = driver.getWindowHandles();
		for (String handle : allHandles) {
            if (!handle.equals(originalHandle)) {
                try {
                    driver.switchTo().window(handle);
                    Thread.sleep(7000);
                    driver.close();
                } catch (NoSuchWindowException e) {
                    System.out.println("Exception: Window/Tab not found - " + handle);
                }
            }
        }
      driver.switchTo().window(originalHandle);
	}
	
	@Test(priority=35)
	public static void clickonPhoneNo() throws InterruptedException{
		WebElement phoneNo=driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[1]/a"));
		//Actions scrollTo=new Actions(driver);
		Actions clickit=new Actions(driver);
		String originalHandle = driver.getWindowHandle();
		//scrollTo.scrollToElement(phoneNo).click().perform();
		clickit.moveToElement(phoneNo).click().perform();
		Set<String> allHandles = driver.getWindowHandles();
		for (String handle : allHandles) {
            if (!handle.equals(originalHandle)) {
                try {
                    driver.switchTo().window(handle);
                    Thread.sleep(7000);
                    driver.close();
                } catch (NoSuchWindowException e) {
                    System.out.println("Exception: Window/Tab not found - " + handle);
                }
            }
        }
      driver.switchTo().window(originalHandle);
	}
	
	@AfterMethod //Display message after each method
	public void messageAfterMethod(){
		System.out.println("Always display this message after method");
	}
	
	@AfterClass //Display message after class
	public void messageAfterClass() {
		System.out.println("Always display this message after class");
	}
	
	private static void customWait(int i) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(4000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
}
