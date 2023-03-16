package Browserstack;

import static org.testng.AssertJUnit.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.browserstack.local.Local;



	

@Test
public class Browserstackdemo {
	@org.testng.annotations.Parameters(value = { "config", "environment" })
	public void method() throws MalformedURLException {
		
	//	ChromeOptions options  =  new ChromeOptions() ;
		MutableCapabilities caps  = new MutableCapabilities()  ;
		// options.addArguments("--remote-allow-origins=*");
		 
	String url = 	 "https://" + "jshonsamson_teL0NK" + ":" + "kFN9ZroLTs81WKcCbHoL" + "@" + "hub.browserstack.com" + "/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(url) ,caps );
             driver.get("https://rahulshettyacademy.com/client/");
				Assert.assertTrue(driver.getTitle().matches("Let's Shop")) ;
            
             
            
			
		
		
	}

}

