package test.test_art;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{

	 @Test
	    public void testing_selenium()
	    {
	System.setProperty("webdriver.chrome.driver", "D:\\WS\\learn_selenium\\Drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.snapdeal.com");
	    	
	    }
   
    
}
