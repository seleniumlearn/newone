package Log4jTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger; 
import org.apache.log4j.PropertyConfigurator;
public class Log4jTest {
	public WebDriver driver;
  @Test
  public class Log4j {
	   public WebDriver driver;
	  public  void main() throws Exception {
	  
	  Logger logger= Logger.getLogger("Log4j");
	  PropertyConfigurator.configure("Log4j.properties");
	 
	//System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
	 
      driver=new FirefoxDriver();
	//  System.setProperty("webdriver.chrome.driver","C:\\lib\\chromedriver.exe"); //--->chrome browser path
	  driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  logger.info("Firefox Opened");
	  
	  driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
	  logger.info("Set wait for a page to load");
	  
	  driver.manage().window().maximize();
	  logger.info("Brows maximized");

	  driver.get("http://www.seleniumlearn.com");
	  logger.info("Website is launched");


	  
	    }  

	 }

	
  @BeforeTest
  public void beforeTest() {
	  

	  
  }

  @AfterTest
  public void afterTest() {
  }

}
