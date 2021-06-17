package WorkHuman.skyscanner.WebTesting.CommonClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractComponent {
	protected WebDriver driver;
	 WebDriver wait;
	public AbstractComponent(WebDriver driver) {
       this.driver = driver;
      
       
   }
   //to click on the web element passed in parameter
   public WebElement findElement(By findElementBy)
   {
	   WaitForVisibility(5000, findElementBy);
       return driver.findElement(findElementBy);
       
   }
   
   // To enter arrown down in ketboard
   public void arrowDownInKeyboard(By findElementBy)
   {
   	Actions builder=new Actions(driver);
   	//builder.moveToElement(findElement(findElementBy)).click().build().perform();
   	builder.sendKeys(Keys.ARROW_DOWN).click().build().perform();
   	driver.findElement(findElementBy).sendKeys(Keys.ARROW_DOWN);
   	driver.findElement(findElementBy).sendKeys(Keys.ENTER);
   }
  // wait until WebElement passed in parameter is not displayed
   public WebElement WaitForVisibility(int time, By element)
   {
   	return new WebDriverWait(driver , time).until(ExpectedConditions.visibilityOfElementLocated(element));
   }
   
  // To enter value in the textBox of WebElement passed in parameter
   public void EnterValue(By Locator, String Enter)
	{
	   WaitForVisibility(5000, Locator);
	   findElement(Locator).sendKeys(Enter);
	}

}


