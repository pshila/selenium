package com.winium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		DesktopOptions option= new  DesktopOptions();
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		//first run the Winium.Desktop.Driver.exe 
		//define which port we are running our program (port url)
	
		WiniumDriver driver= new WiniumDriver(new URL("http://localhost:9999"), option);
		Thread.sleep(2000);
		
		driver.findElement(By.name("7")).click();
		driver.findElement(By.id("93")).click();
		driver.findElement(By.name("8")).click();
		driver.findElement(By.id("121")).click();
		Thread.sleep(2000);
		String data= driver.findElement(By.id("150")).getAttribute("Name");
		
		System.out.println("result is "+data);
		
		
		

	}

}
