package com.Autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadMultipleFile {
WebDriver driver=null;
	
	@Test
	public void fileupload() throws IOException, InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\web driver\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// web site URL
		driver.get("file:///C:/Users/Drigendra/Desktop/fileupload.html");
		 driver.findElement(By.id("1")).click();
		 Thread.sleep(2000);
		
		 Runtime.getRuntime().exec("C:\\Users\\Drigendra\\Desktop\\shila\\SHILA\\Autoit\\MultiFile.exe"+" "+"C:\\Users\\Drigendra\\Desktop\\photo\\Pancard.jpg");
		 Thread.sleep(2000);
		 driver.findElement(By.id("1")).click();
		 Thread.sleep(2000);
		 Runtime.getRuntime().exec("C:\\Users\\Drigendra\\Desktop\\shila\\SHILA\\Autoit\\MultiFile.exe"+" "+"C:\\Users\\Drigendra\\Desktop\\shila\\SHILA\\Autoit\\APSS.txt");

}
}