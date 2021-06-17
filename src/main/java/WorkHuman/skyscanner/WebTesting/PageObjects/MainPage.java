package WorkHuman.skyscanner.WebTesting.PageObjects;

import org.openqa.selenium.By;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import WorkHuman.skyscanner.WebTesting.CommonClass.*;
public class MainPage extends AbstractComponent {
public MainPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

String s = "20";
String day;
String month;
DateCalculator date;
private By destinationField = By.id("fsc-destination-search");
private By departDateField = By.id("depart-fsc-datepicker-button");
private By destinationText = By.id("react-autowhatever-fsc-destination-search--item-0");
private By returnDateField = By.id("return-fsc-datepicker-button");
private By departDateSelection = By.xpath("//button[contains(@class  , 'calendar-date--today')]");
private By returnDateSelection = By.xpath("//button[contains(@aria-label , 's+\" \"')]");
private By cabinClassField = By.id("CabinClassTravellersSelector_fsc-class-travellers-trigger__LeM38");
private By AdultPassengers = By.xpath("//button[@title = 'Increase number of adults']");
private By closeCabinClass = By.xpath("//button[text() = 'Done']");
private By searchFlights = By.xpath("//button[@aria-label = 'Search flights']");
private By CookiePopUp = By.xpath("//div[contains(@class , 'CookieBanner__buttons-wrapper')]/button");

public void CloseCookiePopUp()
{
	findElement(CookiePopUp).click();
}
public void ClickTo()
{
	WebElement el  = findElement(destinationField);
	el.click();
	el.clear();
	
	
}

public void EnterTextToField(String destination)
{

	EnterValue(destinationField , destination);
	
	findElement(destinationText).click();
}
public void ClickDepartDate()
{
	findElement(departDateField).click();
	
}
public void selectDepartDate()
{
	findElement(departDateSelection).click();
}
public void ClickReturnDate()
{
	findElement(returnDateField).click();
	
}
public void selectReturnDay()
{    
	CalculateDay();
	int day1 = Integer.parseInt(day);
     s = Integer.toString(date.getDay(day1, month));
	findElement(returnDateSelection).click();
}

public void CalculateDay()
{
	date = new DateCalculator();
	WebElement DepartureDate = findElement(departDateSelection);
  	String Date = DepartureDate.getAttribute("aria-label");
  	 day  = Date.split("\\s")[1];
  	 month = Date.split("\\s")[2];
}

public void clickCabinClass()
{
	findElement(cabinClassField).click();
}
public void increasePassenger()
{
	findElement(AdultPassengers).click();
}
public void closeCabinClass()
{
	findElement(closeCabinClass).click();
	}
public void clickSearchFlight()
{
	findElement(searchFlights).click();
}
}
