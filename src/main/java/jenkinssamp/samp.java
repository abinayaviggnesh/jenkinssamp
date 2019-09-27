package jenkinssamp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class samp {


	@Test 
	public void print()
	{
		
		
		Logger log=LogManager.getLogger(samp.class);
		
        log.info("getting info");
		
		log.info("getting info");
		
		log.debug("debug");
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abina\\Downloads\\chromedriver_win32new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();

	}

}


