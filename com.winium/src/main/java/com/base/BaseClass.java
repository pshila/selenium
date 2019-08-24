package com.base;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class BaseClass {

	public WebDriver driver;
	public void openBrowser(String Browser){
		DesiredCapabilities cab= null;
		if (Browser.equals("chrome")){
			cab=DesiredCapabilities.chrome();
			cab.setPlatform(Platform.WINDOWS);
			
		}
		if (Browser.equals("mozilla")){
			cab=DesiredCapabilities.firefox();
			cab.setPlatform(Platform.WINDOWS);
			
		}
		if (Browser.equals("IE")){
			cab=DesiredCapabilities.internetExplorer();
			cab.setPlatform(Platform.WINDOWS);
			
		}
		
		try {
			driver=new  RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cab);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		@AfterTest
		public void quit(){
			if(driver!= null)
				driver.quit();
		}
	

	

}
