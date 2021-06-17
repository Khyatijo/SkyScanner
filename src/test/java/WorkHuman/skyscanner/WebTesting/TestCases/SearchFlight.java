package WorkHuman.skyscanner.WebTesting.TestCases;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import WorkHuman.skyscanner.WebTesting.BaseResources.Base;
import WorkHuman.skyscanner.WebTesting.PageObjects.MainPage;
public class SearchFlight extends Base {
	WebDriver driver;
	MainPage mainpage;
	public SearchFlight() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest

	public void initialize() throws IOException
	{
		
		 driver =InitializeDriver();
			
		driver.get(getURL());
		mainpage = new MainPage(driver);
		
	}

	@Test
	public void searchFlight() throws InterruptedException
	{
		
		Thread.sleep(5000);
		mainpage.CloseCookiePopUp();
		mainpage.ClickTo();
		mainpage.EnterTextToField("amsterdam");
		mainpage.ClickDepartDate();
		mainpage.selectDepartDate();
		mainpage.ClickReturnDate();
		mainpage.selectReturnDay();
		mainpage.clickCabinClass();
		mainpage.increasePassenger();
		mainpage.closeCabinClass();
		mainpage.clickSearchFlight();
	}
}
