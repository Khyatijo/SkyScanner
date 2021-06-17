package WorkHuman.skyscanner.WebTesting.BaseResources;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	WebDriver driver;
	 public Properties p;
	FileReader reader;
	public Base() throws IOException
   {
		 reader=new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\WorkHuman\\skyscanner\\WebTesting\\BaseResources\\data.properties");  
	     p=new Properties();  
		 p.load(reader);
   }
	
	public  WebDriver InitializeDriver()
	{
		    String s = p.getProperty("browser");
		    String browser = "chrome";
		    System.out.println(s);
		    if(s.equals(browser))
		    	System.out.println(s);
		    {
		    	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\geckodriver.exe");
		    	DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		        //capabilities.setCapability("marionette",true);  
		        driver= new FirefoxDriver(capabilities);  
		    	
		    	
		    }
		   
		    return driver;
			
	}

public String getURL() throws IOException
{
	p.load(reader);
	String s = p.getProperty("URL");
	System.out.println(s);
	return s;
	
}
}

